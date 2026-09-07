package AdivinaPersonaje;

public class Personaje {
    private int id;
    private String nombre;
    private String genero;
    private String rangoEteareo;
    private String colorPelo;
    private boolean tieneGorro;
    private String colorPiel;
    private boolean tieneLentes;
    private String colorOjos;
    private boolean tieneCollar;
    private String colorRemera;
    private boolean tieneBarba;
    private boolean tienePelo;
    private String largoPelo;
    private String tipoPelo;

    public Personaje(int id, String nombre, String genero, String rangoEteareo, String colorPelo, boolean tieneGorro, String colorPiel, boolean tieneLentes, String colorOjos, boolean tieneCollar, String colorRemera, boolean tieneBarba, boolean tienePelo, String largoPelo, String tipoPelo) {
        this.tienePelo = tienePelo;
        this.largoPelo = tienePelo ? largoPelo : "N/A";
        this.tipoPelo = tienePelo ? tipoPelo : "N/A";
        this.colorPelo = tienePelo ? colorPelo : "N/A";
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.rangoEteareo = rangoEteareo;
        this.tieneGorro = tieneGorro;
        this.colorPiel = colorPiel;
        this.tieneLentes = tieneLentes;
        this.colorOjos = colorOjos;
        this.tieneCollar = tieneCollar;
        this.colorRemera = colorRemera;
        this.tieneBarba = tieneBarba;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getRangoEteareo() {
        return rangoEteareo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public boolean isTieneGorro() {
        return tieneGorro;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public boolean isTieneLentes() {
        return tieneLentes;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public boolean isTieneCollar() {
        return tieneCollar;
    }

    public String getColorRemera() {
        return colorRemera;
    }

    public boolean isTieneBarba() {
        return tieneBarba;
    }

    public boolean isTienePelo() {
        return tienePelo;
    }

    public String getLargoPelo() {
        return largoPelo;
    }

    public String getTipoPelo() {
        return tipoPelo;

    }
    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", rangoEteareo='" + rangoEteareo + '\'' +
                ", colorPelo='" + colorPelo + '\'' +
                ", tieneGorro=" + tieneGorro +
                ", colorPiel='" + colorPiel + '\'' +
                ", tieneLentes=" + tieneLentes +
                ", colorOjos='" + colorOjos + '\'' +
                ", tieneCollar=" + tieneCollar +
                ", colorRemera='" + colorRemera + '\'' +
                ", tieneBigote=" + tieneBarba +
                ", tienePelo=" + tienePelo +
                ", largoPelo='" + largoPelo + '\'' +
                ", tipoPelo='" + tipoPelo + '\'' +
                '}';
    }

}

