package AdivinaPersonaje;

public class Pregunta {
    private String atributo;
    private String valor;

    public boolean evaluar(Personaje p) {
        if (atributo.equals("genero")) {
            return p.getGenero().equals(valor);
        } else if (atributo.equals("rango eteareo")) {
            return p.getRangoEteareo().equals(valor);
        } else if (atributo.equals("ojos")) {
            return p.getColorOjos().equals(valor);
        } else if (atributo.equals("color pelo")) {
            return p.getColorPelo().equals(valor);
        } else if (atributo.equals("remera")) {
            return p.getColorRemera().equals(valor);
        } else if (atributo.equals("largo pelo")) {
            return p.getLargoPelo().equals(valor);
        } else if (atributo.equals("tipo pelo")) {
            return p.getTipoPelo().equals(valor);
        } else if (atributo.equals("color piel")) {
            return p.getColorPiel().equals(valor);
        } else if (atributo.equals("tiene lentes")) {
            boolean valorBuscado = Boolean.parseBoolean(valor);
            return p.isTieneLentes() == valorBuscado;
        } else if (atributo.equals("tiene gorro")) {
            boolean valorBuscado = Boolean.parseBoolean(valor);
            return p.isTieneGorro() == valorBuscado;
        } else if (atributo.equals("tiene collar")) {
            boolean valorBuscado = Boolean.parseBoolean(valor);
            return p.isTieneCollar() == valorBuscado;
        } else if (atributo.equals("tiene barba")) {
            boolean valorBuscado = Boolean.parseBoolean(valor);
            return p.isTieneBarba() == valorBuscado;
        }   else if (atributo.equals("tiene pelo")) {
            boolean valorBuscado = Boolean.parseBoolean(valor);
            return p.isTienePelo() == valorBuscado;
        } else return false;

    }

}
