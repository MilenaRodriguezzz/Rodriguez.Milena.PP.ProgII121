package examen;

// Milena Rodríguez 121, TM, PP 

public abstract class Publicacion {
    protected String titulo;
    protected int anioPublicacion;


    public Publicacion(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public abstract void mostrarInfo();
    
    public void leer() {
        System.out.println(titulo + " no se puede leer.");
    }

}
