import javax.swing.JFrame;

public class App_MarcoRastreadorRaton {
    public static void main(String[] args) {
        
        MarcoRastreadorRaton marcoRastreadorRaton = new MarcoRastreadorRaton();
        marcoRastreadorRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoRastreadorRaton.setSize(800, 500);
        marcoRastreadorRaton.setVisible(true);
    }
}
