
package Modelo;

import Vista.VCrearAlumnos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AlumnoBD {
    VCrearAlumnos c;
    public static void guardarAlumnoBD(Alumno alumno){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/alumnos","root","root");
         System.out.println("Conexion establecida!");
         Statement sentencia = conexion.createStatement();
         int insert = sentencia.executeUpdate("insert into alumno values('"+alumno.getCedula()+"','"+alumno.getNombre()+"','"+alumno.getApellido()+"','"+alumno.getDireccion()+"','"+alumno.getTeléfono()+"','"+alumno.getCarrera()+"','"+alumno.getModulo()+"','"+alumno.getCorreo()+"')");
         
         sentencia.close();
         conexion.close();
       
     }catch(Exception ex){
         System.out.println("Error en la conexion"+ex);
     }
        
    }
    
    public static void eliminar (String cedula){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/alumnos","root","root");
         System.out.println("Conexion establecida!");
         Statement sentencia = conexion.createStatement();
         int insert = sentencia.executeUpdate("delete from estudiante where cedula = '"+cedula+"'");
         
         sentencia.close();
         conexion.close();
       
     }catch(Exception ex){
         System.out.println("Error en la conexion"+ex);
     }  
    }

public void buscar(Alumno Alumno) {
        boolean existe = false;
        String cedula;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/alumnos", "root", "root");
            System.out.println("Concexion establecida");

            Statement sentencia = conexion.createStatement();

            ResultSet buscar = sentencia.executeQuery("SELECT Cédula FROM alumno WHERE Cédula = " + Alumno.getCedula());

            while (buscar.next()) {
                existe = true;

                if (existe == true) {
                    JOptionPane.showMessageDialog(null, "El numero de cedula se encuentra: " + Alumno.getCedula() + " si está en la BD", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

                }
            }

            if (existe == false) {
            
                JOptionPane.showMessageDialog(null, "El numero de cedula no se encuentra", "Error de captura", JOptionPane.ERROR_MESSAGE);             
            }
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.println("Error de coneccion" + ex);
        }

    }
}
