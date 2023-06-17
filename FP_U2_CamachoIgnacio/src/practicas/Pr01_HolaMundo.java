package practicas;

/**
 *
 * @author nacho
 */
public class Pr01_HolaMundo {
    
    //crear el metodo principal y siempre debe ir
    public static void main(String[] args) {
        //imprimir pantalla
        System.out.print("Hola Mundo");
        //esta linea es un comentario
        System.out.println("esta linea escribe y salta de renglon");
        //el print no salta de renglon
        System.out.print("imprime una linea, pero el cursor se queda al final");
        System.out.print("esta es otra linea que quedo pegada  ala anterior");
        
        //para hacer un salto de linea podemos escribir \n
        //para hacer un espacio tabulador podemos escribir \t
        System.out.print("Hola mi nombre \n es Ignacio Camacho");
        System.out.println("\tsoy alumno \t de la carrera de sistemas"); 
        System.out.println("\t\ttomo clase con el 071CA");
    }
}
