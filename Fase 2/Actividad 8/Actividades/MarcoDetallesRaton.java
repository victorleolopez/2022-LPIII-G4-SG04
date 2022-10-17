
// Archivo "MarcoDetallesRaton.java"
// Demostración de los clics del ratón y cómo diferenciar los botones del mismo.
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Se importo 
import javax.swing.JPanel;
import java.awt.Color;

public class MarcoDetallesRaton extends JFrame {
    private String detalles; // String que se muestra en barraEstado
    private final JLabel barraEstado; // JLabel que aparece en la parte inferior de la
    // ventana
    // constructor establece String de la barra de título y registra componente de
    // escucha del ratón

    // Se agrego una variable estatica tipo JPanel
    private final JPanel panelRaton;

    public MarcoDetallesRaton() {
        // super("Clics y botones del raton");
        super("Johan Victor ");
        barraEstado = new JLabel("Haga clic en el raton");
        add(barraEstado, BorderLayout.SOUTH);
        addMouseListener(new ManejadorClicRaton()); // agrega el manejador

        // Se agrego
        panelRaton = new JPanel();
        add(panelRaton, BorderLayout.CENTER);
        ManejadorClicRaton manejador = new ManejadorClicRaton();
        panelRaton.addMouseListener(manejador);
        panelRaton.addMouseMotionListener(manejador);
    }

    // clase interna para manejar los eventos del ratón
    private class ManejadorClicRaton extends MouseAdapter {
        // maneja evento de clic del ratón y determina cuál botón se oprimió
        @Override
        public void mouseClicked(MouseEvent evento) {
            // int xPos = evento.getX(); // obtiene posición x del ratón en caso requerirse
            // int yPos = evento.getY(); // obtiene posición y del ratón en caso requerirse

            detalles = String.format("Se hizo clic %d vez(veces)",
                    evento.getClickCount());

            if (evento.isMetaDown()) { // botón derecho del ratón
                detalles += " con el boton derecho del raton";
                panelRaton.setBackground(Color.YELLOW);
            } else if (evento.isAltDown()) { // botón central del ratón
                detalles += " con el boton central del raton";
                panelRaton.setBackground(Color.GREEN);
            } else {// botón izquierdo del ratón
                detalles += " con el boton izquierdo del raton";
                panelRaton.setBackground(Color.RED);
            }
            barraEstado.setText(detalles); // muestra mensaje en barraEstado
        } // fin de la clase MarcoDetallesRaton

        @Override
        public void mouseExited(MouseEvent evento) {
            panelRaton.setBackground(Color.WHITE);
        }
    }

}