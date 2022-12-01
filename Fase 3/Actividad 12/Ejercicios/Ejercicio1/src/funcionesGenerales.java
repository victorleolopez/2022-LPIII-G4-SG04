


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

    public DefaultTableModel mostrardatos(String genral) throws SQLException {
        numero =0;
        DefaultTableModel modelotable;
        Statement stm = conn.createStatement();
        modelotable = new DefaultTableModel(null, new String[]{"IDCurso","descripcion","credito"});
        String list[] = new String[3];
        ResultSet re = stm.executeQuery(genral);
        while (re.next()) {
            list [0]=re.getString("idCurso");
            list [1]=re.getString("descripcion");
            list [2]=re.getString("credito");
            modelotable.addRow(list);
            numero++;
        }
        return modelotable;
    }
    
}
