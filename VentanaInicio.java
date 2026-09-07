package AdivinaPersonaje;
import javax.swing.*;
import java.awt.*;

/**
 * Pantalla inicial: elegir modo de juego.
 * Desde acá se navega a PantallaJuego (jugador vs máquina)
 * o a PantallaMaquinaVsMaquina (máquina vs máquina).
 */
public class VentanaInicio extends JFrame {

    public VentanaInicio() {
        setTitle("Adivina Personaje");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        JLabel titulo = new JLabel("Adivina Personaje");
        titulo.setFont(new Font("SansSerif", Font.BOLD, 22));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton btnJugadorVsMaquina = new JButton("Jugador vs Máquina");
        JButton btnMaquinaVsMaquina = new JButton("Máquina vs Máquina");
        JButton btnSalir = new JButton("Salir");

        for (JButton b : new JButton[]{btnJugadorVsMaquina, btnMaquinaVsMaquina, btnSalir}) {
            b.setAlignmentX(Component.CENTER_ALIGNMENT);
            b.setMaximumSize(new Dimension(250, 40));
        }

        // Navegación entre pantallas
        btnJugadorVsMaquina.addActionListener(e -> {
            dispose();
            new PantallaJuego().setVisible(true);
        });

        btnMaquinaVsMaquina.addActionListener(e -> {
            dispose();
            new PantallaMaquinaVsMaquina().setVisible(true);
        });

        btnSalir.addActionListener(e -> System.exit(0));

        panelPrincipal.add(titulo);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 30)));
        panelPrincipal.add(btnJugadorVsMaquina);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 10)));
        panelPrincipal.add(btnMaquinaVsMaquina);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 10)));
        panelPrincipal.add(btnSalir);

        add(panelPrincipal);
    }

    public static void main(String[] args) {
        // Punto de entrada de la aplicación
        SwingUtilities.invokeLater(() -> new VentanaInicio().setVisible(true));
    }
}
