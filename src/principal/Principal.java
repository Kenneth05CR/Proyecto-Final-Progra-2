/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Usuario
 */

import modelo.Usuario;
import dao.UsuarioDAO;

public class Principal {
    
   public static void main(String[] args) {

    UsuarioDAO dao = new UsuarioDAO();

    Usuario usuario = dao.validarLogin("profe@edustream.com", "123456");

    if (usuario != null) {
    System.out.println("Bienvenido: " + usuario.getNombre());
    System.out.println("Correo: " + usuario.getEmail());
    System.out.println("Rol: " + usuario.getRol());
    } else {
    System.out.println("Usuario o contraseña incorrectos");
    }
    
   } 
    
}
