/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

/**
 *
 * @author Usuario
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 

public class Conexion {
    
    private static final String URL = "jdbc:mysql://localhost:3306/edu_stream";
    private static final String USER = "root";
    private static final String PASS ="root";
    
    
    public static Connection conectar(){
    
    Connection con = null;
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(URL,USER,PASS);
    
    System.out.println("Conexion exitosa");
    
    } catch(ClassNotFoundException e) {
    System.out.println("Error con el driver:  " + e.getMessage());
    
    } catch (SQLException e){
    System.out.println("Error de conexion " + e.getMessage());
    
    }
    
    return con;
    
    }    
    
}
