package Figuras;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCilindro {

    public JPanel Cilindro;
    private JTextField campoRadio;
    private JTextField campoAltura;
    private JButton calcular;
    private JLabel volumen;
    private JLabel superficie;
    private JLabel altura;


    public VentanaCilindro() {
    calcular.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean error = false;
            double radio = 0;
            double altura = 0;
            try {
             radio = Double.parseDouble(campoRadio.getText());
                altura = Double.parseDouble(campoAltura.getText());
                Cilindro cilindro = new Cilindro(radio, altura);
                volumen.setText("Volumen (cm3): " + String.format("%.2f",cilindro.calcularVolumen()));
                superficie.setText("Superficie (cm2): " + String.format("%.2f",cilindro.calcularSuperficie()));
            } catch (Exception e1){
                error = true;
            } finally {
                if(error) {
                    JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de numero", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }


    });
}
}
