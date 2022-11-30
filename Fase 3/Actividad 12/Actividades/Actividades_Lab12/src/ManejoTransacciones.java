
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ManejoTransacciones {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lp3g4", "root", "root");

            con.setAutoCommit(false);

            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into paciente values(66666,'Juan','SIA')");
            stmt.executeUpdate("insert into paciente values(77777,'Leonardo','SIDA')");

            con.commit();
            System.out.println("Se insertaron los dos registros");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
