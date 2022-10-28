import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class MarcoLista extends JFrame {
    private final JList<String> listaJListColores;
    private static final String[] nombresColores = {
            "Negro", "Azul", "Cyan", "Gris oscuro", "Gris", "Verde", "Gris claro", "Magenta",
            "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo"
    };
    private static final Color[] colores = {
            Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
            Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW
    };

    public MarcoLista() {
        super("Lopez Palza Victor Leo, Johan Isac Mamani Jarata");
        setLayout(new FlowLayout());

        listaJListColores = new JList<String>(nombresColores);
        listaJListColores.setVisibleRowCount(5);

        add(new JScrollPane(listaJListColores));

        listaJListColores.addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent evento) {
                        getContentPane().setBackground(
                                colores[listaJListColores.getSelectedIndex()]);
                    }
                });
    }
}
