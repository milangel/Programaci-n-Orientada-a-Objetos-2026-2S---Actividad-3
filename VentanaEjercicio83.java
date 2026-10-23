import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Ejercicio 8.3
 */
public class VentanaEjercicio83 extends JFrame implements ActionListener {

    private JButton boton1;
    private JButton boton2;
    private JLabel labelMensaje;

    public VentanaEjercicio83() {
        setTitle("Ejercicio 8.3");
        setSize(400, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        boton1 = new JButton("Opción A");
        boton1.setBounds(50, 40, 120, 30);
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Opción B");
        boton2.setBounds(210, 40, 120, 30);
        boton2.addActionListener(this);
        add(boton2);

        labelMensaje = new JLabel("Estado: Esperando interacción...", SwingConstants.CENTER);
        labelMensaje.setBounds(30, 110, 320, 30);
        add(labelMensaje);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            labelMensaje.setText("Estado: Haz presionado la Opción A");
        } else if (e.getSource() == boton2) {
            labelMensaje.setText("Estado: Haz presionado la Opción B");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaEjercicio83 v = new VentanaEjercicio83();
            v.setLocationRelativeTo(null);
            v.setVisible(true);
        });
    }
}
