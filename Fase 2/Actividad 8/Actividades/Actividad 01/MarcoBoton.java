import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame {
    private final JButton botonJButtonSimple; // botón con texto solamente

    public MarcoBoton() {
        super("Lista Botones");
        setLayout(new FlowLayout());
        botonJButtonSimple = new JButton("Integrantes del Grupo 03 de LP-03");
        add(botonJButtonSimple);

        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonSimple.addActionListener(manejador);
    }

    private class ManejadorBoton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            JOptionPane.showMessageDialog(null,"Lopez Palza Victor Leo , Johan Isac Mamani Jarata");
        }
    }
}