/*
import java.sql.*; 

class InsertPrepared {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/lp3g4", "root", "root");

            PreparedStatement stmt = con.prepareStatement("insert into paciente values(?,?,?)");
            stmt.setString(1, "5555");//1 specifies the first parameter in the query
            stmt.setString(2, "Dyan");
            stmt.setString(3, "Asma");
            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
*/


