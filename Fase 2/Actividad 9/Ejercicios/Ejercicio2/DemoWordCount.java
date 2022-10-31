import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DemoWordCount extends JFrame {
    private final JTextArea areaSalida;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;

    public DemoWordCount() throws IOException {
        super("Word Count Johan Victor");
        areaSalida = new JTextArea();
        add(new JScrollPane(areaSalida)); // areasalida cuenta con controles deslizables
        initComponents();
        analizarRuta(); // obtiene el objeto Path del usuario y muestra la información
    }

    private void initComponents() {
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);
    }

    public void analizarRuta() throws IOException {
        // crea un objeto Path con la ruta al archivo o directorio seleccionado por el
        // usuario
        Path ruta = obtenerRutaArchiveDirectorio();
        String libro = ruta.toString();
        if (ruta != null && Files.exists(ruta)) {
            int lineas = 0, palabra = 0, caracteres = 0;
            LinkedList<File> listFicheros = new LinkedList<>();
            for (int i = 0; i <= 5; i++) {
                listFicheros.add(new File(libro));
            }
            Archivo archivo = new Archivo(listFicheros.get(1));
            lineas += archivo.getLineas();
            palabra += archivo.getPalabras();
            caracteres += archivo.getCaracteres();
            StringBuilder builder = new StringBuilder();
            builder.append(String.format(" File: %s %n", ruta.getFileName()));
            builder.append(String.format(" Lineas = %s %n", lineas));
            builder.append(String.format(" Words = %s %n", palabra));
            builder.append(String.format(" Chars = %s %n", caracteres));
            areaSalida.setText(builder.toString()); // muestra el contenido del objeto String
        } else {
            JOptionPane.showMessageDialog(this, ruta.getFileName() + " no existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Path obtenerRutaArchiveDirectorio() {
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int resultado = selectorArchivos.showOpenDialog(this);
        // si el usuario hizo clic en el botón Cancelar en el cuadro de diálogo, regresa
        if (resultado == JFileChooser.CANCEL_OPTION)
            System.exit(1);
        // devuelve objeto Path que representa el archivo seleccionado
        return selectorArchivos.getSelectedFile().toPath();
    }
}
