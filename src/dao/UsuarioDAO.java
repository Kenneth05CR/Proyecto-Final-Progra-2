package dao;

import conexion.Conexion;
import modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    // Método que ya tenías para el Login
    public Usuario validarLogin(String email, String password) {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuarios WHERE email = ? AND password = ?";

        try {
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("id_usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setEmail(rs.getString("email"));
                usuario.setPassword(rs.getString("password"));
                usuario.setRol(rs.getString("rol"));
            }

        } catch (SQLException e) {
            System.out.println("Error al validar usuario: " + e.getMessage());
        }
        return usuario;
    }

    // NUEVO MÉTODO DAO para actualizar la contraseña
    public boolean actualizarPassword(int idUsuario, String nuevaPassword) {
        String sql = "UPDATE usuarios SET password = ? WHERE id_usuario = ?";
        boolean exito = false;

        try {
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nuevaPassword);
            ps.setInt(2, idUsuario);

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                exito = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al actualizar la contraseña: " + e.getMessage());
        }

        return exito;
    }
        // crear estudiante nuevo 
    public boolean registrarEstudiante(Usuario estudiante) {
        String sql = "INSERT INTO usuarios (nombre, email, password, rol) VALUES (?, ?, ?, 'ESTUDIANTE')";
        try {
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getEmail());
            ps.setString(3, estudiante.getPassword());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al registrar estudiante: " + e.getMessage());
            return false;
        }
    }

    // registrar profesor (nuevo método)
    public boolean registrarProfesor(Usuario profesor) {
        String sql = "INSERT INTO usuarios (nombre, email, password, rol) VALUES (?, ?, ?, 'PROFESOR')";
        try {
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, profesor.getNombre());
            ps.setString(2, profesor.getEmail());
            ps.setString(3, profesor.getPassword());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al registrar profesor: " + e.getMessage());
            return false;
        }
    }

    // 2. Método para LISTAR los estudiantes y mostrarlos en la tabla
    public List<Usuario> listarEstudiantes() {
        List<Usuario> lista = new ArrayList<>();
        lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios WHERE rol = 'ESTUDIANTE'";
       try {
        Connection con = Conexion.conectar();
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Usuario u = new Usuario();
            u.setIdUsuario(rs.getInt("id_usuario"));
            u.setNombre(rs.getString("nombre"));
            u.setEmail(rs.getString("email"));
            u.setPassword(rs.getString("password"));
            u.setRol(rs.getString("rol"));
            
            lista.add(u);
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    
    return lista;
}
    // Modificar Estudiante (sirve también para actualizar profesores)
    public boolean modificarEstudiante(Usuario estudiante) {
        String sql = "UPDATE usuarios SET nombre = ?, email = ?, password = ? WHERE id_usuario = ?";
        try {
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getEmail());
            ps.setString(3, estudiante.getPassword());
            ps.setInt(4, estudiante.getIdUsuario());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al modificar estudiante: " + e.getMessage());
            return false;
        }
    }
    
    // Método para LISTAR los profesores y mostrarlos en la tabla
    public List<Usuario> listarProfesores() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios WHERE rol = 'PROFESOR'";
        try {
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt("id_usuario"));
                u.setNombre(rs.getString("nombre"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setRol(rs.getString("rol"));
                
                lista.add(u);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar profesores: " + e.getMessage());
        }
        return lista;
    }
}
