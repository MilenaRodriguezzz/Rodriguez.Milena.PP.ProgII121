package examen;

// Milena Rodríguez 121, TM, PP 

public class Libro extends Publicacion {
    private String autor;
    private Genero genero;

    public Libro(String titulo, int anioPublicacion, String autor, Genero genero) {
        super(titulo, anioPublicacion);
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public void mostrarInfo() { // método toString
        System.out.println("Autor: " + autor + ", Genero: " + genero);
    }

    public void leer() {
        System.out.println("Leyendo el libro: " + titulo);
    }
}
