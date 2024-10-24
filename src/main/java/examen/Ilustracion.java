package examen;

// Milena Rodríguez 121, TM, PP 

public class Ilustracion extends Publicacion {
    private String ilustrador;
    private double ancho;
    private double alto;

    public Ilustracion(String ilustrador, double ancho, double alto, String titulo, int anioPublicacion) {
        super(titulo, anioPublicacion);
        this.ilustrador = ilustrador;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override 
    public void mostrarInfo(){ // método toString
        System.out.println("Ilustrador: " + ilustrador + " Ancho: " + ancho + " Alto: " + alto);
    }
}
 

