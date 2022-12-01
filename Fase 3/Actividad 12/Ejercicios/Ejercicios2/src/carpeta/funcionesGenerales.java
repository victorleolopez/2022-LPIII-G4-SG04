package carpeta;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JOHAN
 */
public class funcionesGenerales {
    conexion mysql = new conexion();
    Connection conn = mysql.getConexion();
    public int numero;
    
    
    
    public DefaultTableModel mostrardatos() throws SQLException {
        numero =0;
        DefaultTableModel modelotable;
        Statement stm = conn.createStatement();
        modelotable = new DefaultTableModel(null, new String[]{"ID","Nombre","Apellidos","Email","telefono"});
        String list[] = new String[5];
        ResultSet re = stm.executeQuery("select * from agenda");
        while (re.next()) {
            list [0]=re.getString("idAddress");
            list [1]=re.getString("firstName");
            list [2]=re.getString("lastName");
            list [3]=re.getString("email");
            list [4]=re.getString("phoneNumber");
            modelotable.addRow(list);
            numero++;
        }
        return modelotable;
    }
    public void registre(){
        
        main p1 = new main(1);
        p1.setVisible(true);
    }
    
    public DefaultTableModel buscardato(String inf) throws SQLException {
        DefaultTableModel modelotable;
        Statement stm = conn.createStatement();
        modelotable = new DefaultTableModel(null, new String[]{"ID","Nombre","Apellidos","Email","telefono"});
        String list[] = new String[5];
        ResultSet re = stm.executeQuery("SELECT * FROM `agenda` WHERE lastName LIKE '" + inf + "%'");
        while (re.next()) {
            list [0]=re.getString("idAddress");
            list [1]=re.getString("firstName");
            list [2]=re.getString("lastName");
            list [3]=re.getString("email");
            list [4]=re.getString("phoneNumber");
            modelotable.addRow(list);
        }
        return modelotable;
    }
    
    public void Insertdat(contacto dat) throws SQLException {
        Statement stm = conn.createStatement();
        stm.executeUpdate(
                "INSERT INTO `agenda` (`idAddress`,`firstName`,`lastName`,`email`, `phoneNumber`) VALUES ('" 
                        + dat.getIdAddress() + "','" + dat.getFirstName()+ "', "
                        + "'" + dat.getLastName() + "', '" + dat.getEmail() + "', '" + dat.getPhoneNumber()
                        + "')");
        javax.swing.JOptionPane.showMessageDialog(null, "¡Usuario registrado correctamente! \n", "HECHO",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
}
