/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cesar
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserCRUD {
    
    private Connection conexion;
    
    public UserCRUD(){  // CONSTRUCTOR
        conexion = ConexionMySQL.conectar();
    }
    
 public boolean crearUsuario(String Nombre, String Correo, String Contra){// CREAR EL USUARIO
     
     String sqlInsert = "INSERT INTO Usuarios (Nombre,Correo,Contraseña) VALUE(?,?,?)";
     
     try{ //INTENTE HACER EL INSERT
         PreparedStatement ps = conexion.prepareStatement(sqlInsert);
         ps.setString(1, Nombre);
         ps.setString(2, Correo);
         ps.setString(3, Contra);
         return ps.executeUpdate() > 0;
 }
     catch(SQLException e){   //EXEPCIONES PARA POSIBLES ERRORES, CATCH DETALLES MAS TECNICOS
         System.out.println("Error al intentar Insertar: "+ e.getMessage());
         return false;
     }
 
 }
 
}

