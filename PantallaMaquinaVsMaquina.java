package AdivinaPersonaje;
import javax.swing.*;
import java.awt.*;

/**
 * Pantalla de juego: Máquina vs Máquina.
 * El requisito académico pide que el razonamiento de la máquina
 * (elección de pregunta vía greedy, descarte de candidatos) sea visible paso a paso.
 *
 * Pensada para que tu amigo enganche acá el bucle de simulación,
 * idealmente con una pausa entre pasos (Timer o Thread) para que se pueda seguir en pantalla.
 */
public class PantallaMaquinaVsMaquina extends JFrame {

    private JTextArea areaRazonamiento;
    private DefaultListModel<String> modeloCandidatosM1;
    private DefaultListModel<String> modeloCandidatosM2;
    private JList<String> listaM1;
    private JList<String> listaM2;

    private JButton btnIniciar;
    private JButton btnPaso;
    private JLabel labelEstado;

    public PantallaMaquinaVsMaquina() {
        setTitle("Adivina Personaje - Máquina vs Máquina");
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // --- Paneles laterales: candidatos de cada máquina ---
        modeloCandidatosM1 = new DefaultListModel<>();
        modeloCandidatosM2 = new DefaultListModel<>();
        listaM1 = new JList<>(modeloCandidatosM1);
        listaM2 = new JList<>(modeloCandidatosM2);

        JScrollPane scrollM1 = new JScrollPane(listaM1);
        scrollM1.setBorder(BorderFactory.createTitledBorder("Máquina 1 - candidatos"));
        scrollM1.setPreferredSize(new Dimension(200, 0));

        JScrollPane scrollM2 = new JScrollPane(listaM2);
        scrollM2.setBorder(BorderFactory.createTitledBorder("Máquina 2 - candidatos"));
        scrollM2.setPreferredSize(new Dimension(200, 0));

        // --- Centro: razonamiento paso a paso ---
        areaRazonamiento = new JTextArea();
        areaRazonamiento.setEditable(false);
        areaRazonamiento.setLineWrap(true);
        JScrollPane scrollRazonamiento = new JScrollPane(areaRazonamiento);
        scrollRazonamiento.setBorder(BorderFactory.createTitledBorder("Razonamiento de la máquina"));

        // --- Controles ---
        JPanel panelControles = new JPanel(new FlowLayout());
        btnIniciar = new JButton("Iniciar simulación");
        btnPaso = new JButton("Siguiente paso");
        btnPaso.setEnabled(false);

        // TODO: reemplazar por la inicialización real: generar los 23 personajes,
        // elegir el objetivo secreto, y cargar modeloCandidatosM1 / modeloCandidatosM2.
        btnIniciar.addActionListener(e -> {
            registrarPaso("Simulación iniciada.");
            btnPaso.setEnabled(true);
        });

        // TODO: reemplazar por un paso real del algoritmo greedy:
        // elegir mejor pregunta, mostrar por qué se eligió (cuántos candidatos elimina),
        // aplicar la respuesta y actualizar la lista de candidatos correspondiente.
        btnPaso.addActionListener(e -> {
            registrarPaso("Máquina elige pregunta según criterio greedy...");
        });

        panelControles.add(btnIniciar);
        panelControles.add(btnPaso);

        labelEstado = new JLabel("Presioná \"Iniciar simulación\" para comenzar.", SwingConstants.CENTER);

        add(labelEstado, BorderLayout.NORTH);
        add(scrollM1, BorderLayout.WEST);
        add(scrollM2, BorderLayout.EAST);
        add(scrollRazonamiento, BorderLayout.CENTER);
        add(panelControles, BorderLayout.SOUTH);
    }

    /** Utilidad para ir mostrando el razonamiento paso a paso. */
    private void registrarPaso(String mensaje) {
        areaRazonamiento.append(mensaje + "\n");
    }

    // TODO: método para marcar el final de la partida y mostrar el personaje ganador,
    // por ejemplo: private void finalizarPartida(Personaje resultado) { ... }
}
