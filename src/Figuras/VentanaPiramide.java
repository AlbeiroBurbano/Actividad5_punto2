package Figuras;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPiramide {
    public JPanel Piramide;
    private JTextField campoBase;
    private JTextField campoAltura;
    private JTextField campoApotema;
    private JButton calcular;
    private JLabel volumen;
    private JLabel superficie;
    private JLabel apotema;
    private JLabel base;
    private JLabel altura;


public VentanaPiramide() {
    calcular.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Piramide piramide;
            boolean error = false;
            double base = 0;
            double altura = 0;
            double apotema = 0;
            try {
                base = Double.parseDouble(campoBase.getText());
                altura = Double.parseDouble(campoAltura.getText());
                apotema = Double.parseDouble(campoApotema.getText());
                piramide = new Piramide(base, altura, apotema);
                volumen.setText("Volumen (cm3): " + String.format("%.2f",piramide.calcularVolumen()));
                superficie.setText("Superficie (cm2): " + String.format("%.2f",piramide.calcularSuperficie()));
            } catch (Exception e1) {
                error = true;
            } finally {
                if (error) {
                    JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    });
}
}
