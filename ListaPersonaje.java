package AdivinaPersonaje;

import java.util.*;

public class ListaPersonaje {
    private List<Personaje> personajes;
    private Random random;

    private static final String[] nombresFemeninos = {
            "Sofia", "Valentina", "Emma", "Isabella", "Catalina", "Martina", "Julieta",
            "Delfina", "Renata", "Mia", "Agustina", "Camila", "Lucia", "Zoe", "Pilar",
            "Guadalupe", "Josefina", "Malena", "Emilia", "Priscila", "Antonella",
            "Constanza", "Milagros", "Abril", "Morena", "Ambar", "Luana", "Olivia",
            "Francesca", "Selena"
    };
    private static final String[] nombresMasculinos = {
            "Juan", "Mateo", "Santiago", "Benjamin", "Lautaro", "Tomas", "Facundo",
            "Bautista", "Franco", "Thiago", "Ignacio", "Bruno", "Joaquin", "Nicolas",
            "Agustin", "Valentino", "Ciro", "Gael", "Santino", "Dante", "Pedro",
            "Martin", "Federico", "Rodrigo", "Maximo", "Ramiro", "Tobias", "Lorenzo",
            "Simon", "Lucas"
    };
    private static final String [] generos = {"Masculino", "Femenino"};
    private static final String [] rangosEtareos = {"Niño", "Joven", "Adulto"};
    private static final String [] coloresPelo = {"Rubio", "Negro", "Colorado", "Canoso"};
    private static final String [] coloresPiel ={"Blanco", "Negro", "Morocho"};
    private static final String [] coloresOjo = {"Azul", "Celeste", "Marron", "Miel", "Verde", "Negro"};
    private static final String [] coloresRemera = {"Negro", "Blanco", "Violeta", "Rosa"};
    private static final String [] largosPelo ={"Corto", "Medio", "Largo"};
    private static final String [] tiposPelo ={"Lacio", "Ondeado", "Enrulado"};

    public ListaPersonaje() {
        this.personajes = new ArrayList<>();
        this.random = new Random();

    }
    private String elegirRandom(String[] lista) {
        return lista[random.nextInt(lista.length)];
    }

    public void generarPersonajesAleatorios(int cantidad) {
        List<String> masculinosDisponibles = new ArrayList<>(Arrays.asList(nombresMasculinos));
        List<String> femeninosDisponibles = new ArrayList<>(Arrays.asList(nombresFemeninos));
        Collections.shuffle(masculinosDisponibles, random);
        Collections.shuffle(femeninosDisponibles, random);

        int indiceMasculino = 0;
        int indiceFemenino = 0;
        int generados = 0;

        while (generados < cantidad) {
            String genero = elegirRandom(generos);
            String nombre;
            if (genero.equals("Masculino")) {
                nombre = masculinosDisponibles.get(indiceMasculino);
                indiceMasculino++;
            } else {
                nombre = femeninosDisponibles.get(indiceFemenino);
                indiceFemenino++;
            }
            String rangoEtareo = elegirRandom(rangosEtareos);
            String colorPelo = elegirRandom(coloresPelo);
            String colorPiel = elegirRandom(coloresPiel);
            String colorOjo = elegirRandom(coloresOjo);
            String colorRemera = elegirRandom(coloresRemera);
            String largoPelo= elegirRandom(largosPelo);
            String tipoPelo= elegirRandom(tiposPelo);
            boolean tieneGorro = random.nextBoolean();
            boolean tieneLentes = random.nextBoolean();
            boolean tieneCollar = random.nextBoolean();
            boolean tieneBarba = random.nextBoolean();
            boolean tienePelo = random.nextBoolean();


            Personaje nuevoPersonaje = new Personaje(generados+1, nombre, genero, rangoEtareo, colorPelo,
                    tieneGorro, colorPiel, tieneLentes, colorOjo,
                    tieneCollar, colorRemera, tieneBarba, tienePelo,
                    largoPelo, tipoPelo
            );
            this.personajes.add(nuevoPersonaje);

            generados++;
        }
    this.personajes = Ordenamiento.mergeSort(this.personajes);
    }

}
