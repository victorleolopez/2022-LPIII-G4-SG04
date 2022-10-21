
// Archivo "MarcoRastreadorRaton.java"
// Manejo de eventos de ratón.
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Icon; // interfaz utilizada para manipular imágenes// Archivo “LabelFrame.java”
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MarcoRastreadorRaton extends JFrame {
    // private final JLabel etiqueta1;
    int click;
    JLabel etiqueta1 = new JLabel("Campo de texto no editable");
    private final JLabel etiqueta2;
    private final JTextField campoTexto1;
    private final JPanel panelRaton; // panel en el que ocurrirán los eventos de ratón
    private final JLabel barraEstado; // muestra información de los eventos
    // El constructor de MarcoRastreadorRaton establece la GUI y
    // registra los manejadores de eventos de ratón
    Icon insecto2 = new ImageIcon(getClass().getResource("insecto.png"));
    Icon insecto = new ImageIcon(getClass().getResource("insecto1.png"));

    public MarcoRastreadorRaton() {
        super("Demostracion de los eventos de raton");
        etiqueta1.setToolTipText("Estiqueta texto no editable");

        etiqueta2 = new JLabel("Imagen", insecto, SwingConstants.LEFT);
        etiqueta2.setToolTipText("Mamriposa");

        campoTexto1 = new JTextField("Campo de texto no editable", 21);

        campoTexto1.setToolTipText("Etiqueta para texto no editable");
        campoTexto1.setEditable(false);

        panelRaton = new JPanel();

        panelRaton.setBackground(Color.WHITE);
        add(panelRaton, BorderLayout.CENTER); // agrega el panel a JFrame
        panelRaton.add(etiqueta2, BorderLayout.CENTER);
        panelRaton.add(etiqueta1, BorderLayout.CENTER);
        panelRaton.add(campoTexto1, BorderLayout.CENTER);

        barraEstado = new JLabel("Raton fuera de JPanel");
        add(barraEstado, BorderLayout.SOUTH); // agrega etiqueta a JFrame

        // crea y registra un componente de escucha para los eventos de ratón y de su

        // movimiento
        ManejadorRaton manejador = new ManejadorRaton();
        panelRaton.addMouseListener(manejador);
        etiqueta1.addMouseListener(manejador);
        etiqueta2.addMouseListener(manejador);
        campoTexto1.addMouseListener(manejador);
        panelRaton.addMouseMotionListener(manejador);

    }

    private class ManejadorRaton implements MouseListener, MouseMotionListener {
        // Los manejadores de eventos de MouseListener
        // manejan el evento cuando se suelta el ratón justo después de oprimir el botón
        @Override
        public void mouseClicked(MouseEvent evento) {
            barraEstado.setText(String.format("1 Se hizo clic en [%d, %d]", evento.getX(),
                    evento.getY()));
            click = evento.getClickCount();

            if (evento.getSource() == etiqueta2 && etiqueta2.getIcon() != insecto) {
                etiqueta2.setIcon(insecto);
            } else if (evento.getSource() == etiqueta2 && etiqueta2.getIcon() != insecto2) {
                etiqueta2.setIcon(insecto2);
            }
            if (evento.getSource() == campoTexto1)
                campoTexto1.setEditable(true);
            else
                campoTexto1.setEditable(false);

        }

        // maneja evento cuando se oprime el ratón
        @Override
        public void mousePressed(MouseEvent evento) {
            barraEstado.setText(String.format("2 Se oprimio en [%d, %d]", evento.getX(),
                    evento.getY()));

        }

        // maneja evento cuando se suelta el botón del ratón
        @Override
        public void mouseReleased(MouseEvent evento) {
            barraEstado.setText(String.format("3 Se solto en [%d, %d]", evento.getX(),
                    evento.getY()));
            campoTexto1.setEditable(false);
            // etiqueta1.setText("PROBAR");

        }

        // maneja evento cuando el ratón entra al área
        @Override
        public void mouseEntered(MouseEvent evento) {
            barraEstado.setText(String.format("4 Raton entro en [%d, %d]", evento.getX(),
                    evento.getY()));
            panelRaton.setBackground(Color.GREEN);

        }

        // maneja evento cuando el ratón sale del área
        @Override
        public void mouseExited(MouseEvent evento) {
            barraEstado.setText("Raton fuera de JPanel");
            panelRaton.setBackground(Color.WHITE);
            campoTexto1.setEditable(false);
        }

        // Los manejadores de eventos de MouseMotionListener manejan
        // el evento cuando el usuario arrastra el ratón con el botón oprimido
        @Override
        public void mouseDragged(MouseEvent evento) {
            barraEstado.setText(String.format("Se arrastro en [%d, %d]", evento.getX(),
                    evento.getY()));
        }

        // maneja evento cuando el usuario mueve el ratón
        @Override
        public void mouseMoved(MouseEvent evento) {
            barraEstado.setText(String.format("Se movio en [%d, %d]", evento.getX(),
                    evento.getY()));
        }
    } // fin de la clase interna ManejadorRaton
} // fin de la clase MarcoRastreadorRaton
