/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package dao;

import conexion.Conexion;
import modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

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
}