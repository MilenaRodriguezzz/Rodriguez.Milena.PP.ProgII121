
package examen;

// Milena Rodríguez 121, TM, PP 

public class Revista extends Publicacion {
    private int numeroEdicion;

    public Revista(int numeroEdicion, String titulo, int anioPublicacion) {
        super(titulo, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }
    
    @Override
    public void mostrarInfo(){ // método toString
        System.out.println("Numero de edicion: " + numeroEdicion);
    }
    
    public void leer(){
        System.out.println("Leyendo la revista: " + titulo);
    }

}
