import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DemoJFileChooser extends JFrame {
    private final JTextArea areaSalida;

    public DemoJFileChooser() throws IOException {
        super("Deno de JFileChooser");
        areaSalida = new JTextArea();
        add(new JScrollPane(areaSalida)); // areasalida cuenta con controles deslizables
        analizarRuta(); // obtiene el objeto Path del usuario y muestra la información
    }

public void analizarRuta() throws IOException { 
    //crea un objeto Path con la ruta al archivo o directorio seleccionado por el usuario 
    Path ruta = obtenerRutaArchiveDirectorio();
    if (ruta != null && Files.exists(ruta)) {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%s:%n", ruta.getFileName())); 
        builder.append(String.format("%s un directorion%n", Files.isDirectory(ruta) ? "Es" : "No es"));
        builder.append(String.format("%s una ruta absoluta%n", ruta. IsAbsolute() ? "Es" : "No es")); 
        builder.append(String.format("Ultima modificacio%n",Files.getLastModifiedTime(ruta)));
        builder.append(String.format("Tamanio: %s%n", Files.size(ruta))); 
        builder.append(String.format("Ruta: sin", ruta)); 
        builder.append(String.format("Ruta absoluta: %s%n",ruta.toAbsolutePath()));
        if (Files.isDirectory(ruta)) { 
            builder.append(String. format ("Contenido del directorio:%n"));
            //objeto para iterar a través del contenido de un directorio
            DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta);
            for (Path p: flujoDirectorio) 
                builder.append(String.format("%s", p));
        }
        areaSalida.setText(builder.toString()); // muestra el contenido del objeto String
        else {
            JOptionPane.showMessageDialog(this, ruta.getFileName()+" no existe.", "ERROR",JOptionPane.ERROR_MESSAGE);
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
