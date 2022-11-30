/*
import java.sql.*;

class CallableStatementAct {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/lp3g4", "root", "root");

            CallableStatement stmt=con.prepareCall("{call p_mostrar()}");
            System.out.println(" Se ejecuto Correctamente");
                 
            stmt.execute(); 

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}  
*/
