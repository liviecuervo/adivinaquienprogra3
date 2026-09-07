package AdivinaPersonaje;

import java.util.ArrayList;
import java.util.List;

public class Ordenamiento {
    public static List<Personaje> mergeSort(List<Personaje> lista){
        if (lista.size()<=1){
            return lista;
        }
        int medio = lista.size()/2;
        List<Personaje> mitadIzquierda =new ArrayList<>(lista.subList(0, medio));
        List<Personaje> mitadDerecha=new ArrayList<>(lista.subList(medio, lista.size()));
        mitadIzquierda = mergeSort(mitadIzquierda);
        mitadDerecha = mergeSort(mitadDerecha);

        return  merge(mitadIzquierda, mitadDerecha);

    }
    public static List<Personaje> merge(List<Personaje> mitadIzquierda, List<Personaje> mitadDerecha){
        int i =0;
        int j =0;
        List<Personaje> resultado = new ArrayList<>();

        while (i < mitadIzquierda.size() && j < mitadDerecha.size()){
            if (mitadIzquierda.get(i).getGenero().compareTo(mitadDerecha.get(j).getGenero())<=0){
                resultado.add(mitadIzquierda.get(i));
                i++;
            } else{
                resultado.add(mitadDerecha.get(j));
                j++;
            }
        }
        while (i < mitadIzquierda.size()){
            resultado.add(mitadIzquierda.get(i));
            i++;
        }
        while (j< mitadDerecha.size()){
            resultado.add(mitadDerecha.get(j));
            j++;
        }
        return resultado;
    }
}
