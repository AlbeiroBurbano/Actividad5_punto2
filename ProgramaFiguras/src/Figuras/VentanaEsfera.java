package Figuras;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEsfera {
    public JPanel Esfera;
    private JTextField campoRadio;
    private JButton calcular;
    private JLabel volumen;
    private JLabel superficie;
    private JLabel radio;

public VentanaEsfera() {
    calcular.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {


                boolean error = false;
                try {
                    double radio = Double.parseDouble(campoRadio.getText());
                    Esfera esfera = new Esfera(radio);
                    volumen.setText("Volumen (cm3): " + String.format("%.2f", esfera.calcularVolumen()));
                    superficie.setText("Superficie (cm2): " + String.format("%.2f", esfera.calcularSuperficie()));
                } catch (Exception e1) {
                    error = true;
                } finally {
                    if (error) {
                        JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error", JOptionPane.ERROR_MESSAGE);
                    }


                }

        }
    });
}
}
