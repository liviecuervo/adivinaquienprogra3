package AdivinaPersonaje;
import javax.swing.*;
import java.awt.*;

/**
 * Pantalla de juego: Jugador vs Máquina.
 *
 * Estructura pensada para que tu amigo enganche acá:
 *  - la lista de candidatos restantes (List<Personaje>)
 *  - el manejo de preguntas y eliminación
 *  - el algoritmo greedy para elegir preguntas de la máquina
 */
public class PantallaJuego extends JFrame {

    // Componentes principales
    private JList<String> listaCandidatos;
    private DefaultListModel<String> modeloCandidatos;

    private JComboBox<String> comboAtributo;
    private JComboBox<String> comboValor;
    private JButton btnPreguntar;

    private JTextArea areaLog;
    private JLabel labelEstado;

    public PantallaJuego() {
        setTitle("Adivina Personaje - Jugador vs Máquina");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // --- Panel izquierdo: candidatos restantes ---
        modeloCandidatos = new DefaultListModel<>();
        // TODO: cargar acá los 23 personajes generados por ListaPersonaje
        // ejemplo: for (Personaje p : listaPersonajes) modeloCandidatos.addElement(p.getNombre());
        listaCandidatos = new JList<>(modeloCandidatos);
        JScrollPane scrollCandidatos = new JScrollPane(listaCandidatos);
        scrollCandidatos.setBorder(BorderFactory.createTitledBorder("Candidatos restantes"));
        scrollCandidatos.setPreferredSize(new Dimension(220, 0));

        // --- Panel central: log de preguntas/respuestas ---
        areaLog = new JTextArea();
        areaLog.setEditable(false);
        areaLog.setLineWrap(true);
        JScrollPane scrollLog = new JScrollPane(areaLog);
        scrollLog.setBorder(BorderFactory.createTitledBorder("Historial de la partida"));

        // --- Panel inferior: hacer una pregunta ---
        JPanel panelPregunta = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelPregunta.setBorder(BorderFactory.createTitledBorder("Hacer una pregunta"));

        // TODO: cargar acá los atributos reales de Personaje (ej: "Color de pelo", "Usa lentes", etc.)
        comboAtributo = new JComboBox<>(new String[]{"Atributo 1", "Atributo 2"});
        // TODO: al cambiar el atributo elegido, actualizar comboValor con los valores posibles
        comboValor = new JComboBox<>(new String[]{"Valor 1", "Valor 2"});
        btnPreguntar = new JButton("Preguntar");

        // TODO: reemplazar por la lógica real: evaluar la pregunta contra el personaje objetivo,
        // actualizar modeloCandidatos (eliminar los que no cumplen) y escribir en areaLog.
        btnPreguntar.addActionListener(e -> {
            String atributo = (String) comboAtributo.getSelectedItem();
            String valor = (String) comboValor.getSelectedItem();
            registrarEnLog("Preguntaste: ¿" + atributo + " = " + valor + "?");
        });

        panelPregunta.add(new JLabel("Atributo:"));
        panelPregunta.add(comboAtributo);
        panelPregunta.add(new JLabel("Valor:"));
        panelPregunta.add(comboValor);
        panelPregunta.add(btnPreguntar);

        // --- Panel superior: estado del juego ---
        labelEstado = new JLabel("Elegí una pregunta para empezar.", SwingConstants.CENTER);
        labelEstado.setFont(new Font("SansSerif", Font.PLAIN, 14));

        add(labelEstado, BorderLayout.NORTH);
        add(scrollCandidatos, BorderLayout.WEST);
        add(scrollLog, BorderLayout.CENTER);
        add(panelPregunta, BorderLayout.SOUTH);
    }

    /** Utilidad para ir escribiendo el historial de la partida. */
    private void registrarEnLog(String mensaje) {
        areaLog.append(mensaje + "\n");
    }

    // TODO: método para que la máquina adivine cuando quede 1 candidato o decida arriesgar,
    // por ejemplo: public void mostrarResultado(Personaje ganador) { ... }
}
