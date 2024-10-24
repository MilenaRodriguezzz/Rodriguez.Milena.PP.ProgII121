
package examen;

// Milena Rodríguez 121, TM, PP 

public class Examen {

    public static void main(String[] args) {
        //Se crea una nueva biblioteca en la que se agregarán las publicaciones
        Biblioteca biblioteca = new Biblioteca(); 
        
        try {
            biblioteca.agregarPublicacion(new Libro("Libro de historia", 1953, "Creador de libros de historia", Genero.HISTORIA));
            biblioteca.agregarPublicacion(new Libro("Los simspon", 2012, "Homero", Genero.FICCION));
            biblioteca.agregarPublicacion(new Libro("Libro para ninios", 2020, "Nick", Genero.FICCION));
            biblioteca.agregarPublicacion(new Revista (305, "Avon", 1980));
            biblioteca.agregarPublicacion(new Revista (345, "Vogue", 2020));
            biblioteca.agregarPublicacion(new Revista (380, "Times New", 1890));
            biblioteca.agregarPublicacion(new Ilustracion("Victorio", 80.0, 60.5, "Arte Moderno", 2023));
            biblioteca.agregarPublicacion(new Ilustracion("Quinquinela Martin", 125.0, 105.5, "Arte Clásico", 1900));
            biblioteca.agregarPublicacion(new Ilustracion("Blair", 100.0, 54.5, "Arte Abstracto", 2020));
            
            
            //Se muestran las publicaciones previamente agregadas
            biblioteca.mostrarPublicaciones(); 
            
            System.out.println("----");
            //Se leen las publicaciones
            biblioteca.leerPublicaciones();
            
            System.out.println("----");
            //Intentar agregar el duplicado para que te de error
            biblioteca.agregarPublicacion(new Libro("El principito", 1900, "Autor", Genero.FICCION));
            
            //En caso de que se encuentre algún duplicado en las agrecaciones, va a llamar a la función de exception personalizada que se creó previamente
            // y emitirá el mensaje escrito en caso de que no se pueda leer la publicación (Declarado en publicación)
        } catch (PublicacionDuplicadaException e) {
            System.out.println("Error: " +e.getMessage());
        }
    }
}

