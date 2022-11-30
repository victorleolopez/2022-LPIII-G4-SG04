/*
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider; 

public class RowSet {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

    //Creating and Executing RowSet
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3306/lp3g4");
        rowSet.setUsername("root");
        rowSet.setPassword("root");

        rowSet.setCommand("select * from paciente");
        rowSet.execute();
    while (rowSet.next()) {
        // Generating cursor Moved event
        System.out.println("Dni: " + rowSet.getString(1));
        System.out.println("nombre: " + rowSet.getString(2));
        System.out.println("Padecimiento: " + rowSet.getString(3));
        }
    }
}
*/
