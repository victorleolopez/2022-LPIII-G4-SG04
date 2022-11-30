package carpeta;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JOHAN
 */
public class conexion {
    private static Connection conn;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String db = "contacto";
    private static final String url = "jdbc:mysql://localhost/" + db + "";
    
    public conexion() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            // Connect?
            if (conn != null)
                System.out.println("Conexión establecida exitosamente");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Conexión Fallida:\n\n" + ex);
        }
    }
    public Connection getConexion() {
        return conn;
    }
}
