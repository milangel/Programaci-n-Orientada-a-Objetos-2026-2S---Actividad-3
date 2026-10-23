import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Ejercicio 8.2
 */
public class VentanaEjercicio82 extends JFrame {

    private JLabel labelEntrada;
    private JTextField campoEntrada;
    private JButton botonProcesar;
    private JLabel labelResultado;

    public VentanaEjercicio82() {
        // Configuración de la ventana principal
        setTitle("Ejercicio 8.2");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Creación y ubicación de componentes
        labelEntrada = new JLabel("Ingrese un valor:");
        labelEntrada.setBounds(30, 30, 120, 25);
        add(labelEntrada);

        campoEntrada = new JTextField();
        campoEntrada.setBounds(160, 30, 180, 25);
        add(campoEntrada);

        botonProcesar = new JButton("Procesar");
        botonProcesar.setBounds(130, 70, 120, 30);
        add(botonProcesar);

        labelResultado = new JLabel("Resultado: ");
        labelResultado.setBounds(30, 110, 310, 25);
        add(labelResultado);

        // Evento del botón
        botonProcesar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = campoEntrada.getText();
                labelResultado.setText("Resultado: Procesado -> " + texto);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaEjercicio82 ventana = new VentanaEjercicio82();
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        });
    }
}