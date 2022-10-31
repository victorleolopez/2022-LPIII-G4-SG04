import java.io.IOException;

import javax.swing.JFrame;

public class PruebaWordCount {
    public static void main(String[] args) throws IOException {
        DemoWordCount aplicacion = new DemoWordCount();
        aplicacion.setSize(400,400);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setVisible(true);
    }
}
