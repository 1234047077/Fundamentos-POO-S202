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
import java.sql.ResultSet;

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
 
 public ResultSet obtenerUsuarioPorId(int id){
     String selectSql = "SELECT * FROM Usuarios WHERE ID = ?";
 
 
 try{
 PreparedStatement ps = conexion.prepareStatement(selectSql);
 ps.setInt(1,id);
 return ps.executeQuery();
}
    catch(SQLException e){
 System.out.println("ERROR AL INTENTAR CONSULTAR: " + e.getMessage());
         return null;
    }
}
 
 //Obtener usuario por ID
 
 public ResultSet obtenerTodos(){
     //No se necesita un parametro
     String sqlTodos = "SELECT * FROM Usuarios";
     
     try{
         PreparedStatement ps = conexion.prepareStatement(sqlTodos);
         return ps.executeQuery();
         
     }
     catch(SQLException w ){
         System.out.println("Error al consultar" + w.getMessage());
         return null;
     }
 }
 
 public boolean actualizarUsuario(int id, String nombre, String correo, String contra) {
    String sqlUpdate = "UPDATE Usuarios SET Nombre=?, Correo=?, Contraseña=? WHERE ID=?";
    
    try {
        PreparedStatement ps = conexion.prepareStatement(sqlUpdate);
        ps.setString(1, nombre);
        ps.setString(2, correo);
        ps.setString(3, contra);
        ps.setInt(4, id);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        System.out.println("Error al actualizar usuario: " + e.getMessage());
        return false;
    }
}

     public boolean moverAEliminados(int id) {
        
        String selectQuery = "SELECT * FROM usuarios WHERE id = ?";
        String insertQuery = "INSERT INTO usuarios_eliminados (id, nombre, correo, contraseña, fecha_eliminacion) VALUES (?, ?, ?, ?, NOW())";
        String deleteQuery = "DELETE FROM usuarios WHERE id = ?";
        
        try {
            
            PreparedStatement psSelect = conexion.prepareStatement(selectQuery);
            psSelect.setInt(1, id);
            ResultSet rs = psSelect.executeQuery();
            
            if (rs.next()) {
               
                PreparedStatement psInsert = conexion.prepareStatement(insertQuery);
                psInsert.setInt(1, rs.getInt("ID"));
                psInsert.setString(2, rs.getString("Nombre"));
                psInsert.setString(3, rs.getString("Correo"));
                psInsert.setString(4, rs.getString("Contraseña"));
                psInsert.executeUpdate();
                
               
                PreparedStatement psDelete = conexion.prepareStatement(deleteQuery);
                psDelete.setInt(1, id);
                return psDelete.executeUpdate() > 0;
            }
            return false;
        } catch (SQLException e) {
            System.out.println("Error al mover usuario a eliminados: " + e.getMessage());
            return false;
        }
    }
    
    public ResultSet obtenerUsuariosEliminados() {
        String query = "SELECT id, nombre, correo, contraseña, fecha_eliminacion FROM usuarios_eliminados";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            return ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error al cargar usuarios eliminados: " + e.getMessage());
            return null;
        }
    }

 
 
 
 
}


