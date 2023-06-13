package Figuras;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Figuras");
        frame.setContentPane(new VentanaPrincipal().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}