package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conexion;
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBProyecto?useSSL=false","root","admin");
        }catch(Exception e){
            System.out.println("La conexión no se pudo establecer" + e);
        }
    }
    
    public Connection getConnection(){
        return conexion;
    }
}
