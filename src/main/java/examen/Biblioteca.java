package examen;

// Milena Rodríguez 121, TM, PP 
 
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Publicacion> publicaciones;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
    }

    // Agregar la publicación y lanzar la publicacion duplicada que se crea personalizada
    public void agregarPublicacion(Publicacion p) throws PublicacionDuplicadaException {
        // Con un elemento for each, va a iterar sobre todos los elementos de la lista publicaciones
        // pub va a ser la variable temporal que va a representar cada publicación en la lista durante esta iteración. Es temporal ya que va a cambiar
        // para seguir comparando los elementos de la lista.

        for (Publicacion pub : publicaciones) {
            // Se va a verificar si el títutlo de la publicación (pub) es igual al de la nueva publicación que se quiere agregar (p) y se ignoran las mayúsculas/minúsculas
            // (equalsIgnoreCase) y también se va a comparar si el año de publicación entre la publicación (pub) y la nueva publicación (p)
            // Si coinciden, significa que la publicación ya existe, y se lanza una excepción para evitar agregar un duplicado.
            if (pub.getTitulo().equalsIgnoreCase(p.getTitulo()) && pub.getAnioPublicacion() == p.getAnioPublicacion()) {
                throw new PublicacionDuplicadaException("La publicación ya existe: " + p.getTitulo());
            }
        }
        publicaciones.add(p);
    }

    public void mostrarPublicaciones() {
        // Para cada elemento p que hay en la lista publicaciones, se va a mostrar la información que se tiene con un bucle for each
        for (Publicacion p : publicaciones) {
        p.mostrarInfo();
    }
    }
    
    public void leerPublicaciones() {
        // Para cada elemento p que hay en la lista publicaciones, se va a leer dicha publicación (en caso de que no se pueda, va a tirar error en el código main)
        for (Publicacion p : publicaciones) {
            p.leer();
        }
    }
    
    
    // También, para agregar publicación y compararlas se podría utilizar un equals:
    
    //    public void agregarPublicacion(Publicacion p) throws PublicacionDuplicadaException {
    //    for (Publicacion pub : publicaciones) {
    //        if (pub.equals(p)) { 
    //            throw new PublicacionDuplicadaException("La publicación ya existe: " + p.getTitulo());
    //        }
    //    }
    //    publicaciones.add(p);
    //}
}

