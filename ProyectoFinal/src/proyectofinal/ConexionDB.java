
package proyectofinal;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {
    
    Connection conectar = null;
    
    public Connection ConexionDB(){           
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/vdhdonhuevo", "root", "");
        }catch(Exception e){
                System.out.println(e.getMessage());
        }
        return conectar;
    }

    Statement PreparedStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
