package cursojava;

import java.io.IOException;

/**
 *
 * @author santiaguf
 */
public class Cursojava {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        //llamamos el primer método
        saludar("usuario");
        
        //creamos un objeto de la clase leer y escribir para acceder a sus métodos
        LeerEscribir io = new LeerEscribir();    

        //accedemos a sus métodos y funciones
        io.calcularEdad();
        io.triangulo();
        
    }
    
    //vamos a crear nuestro primer método para msaludar
    public static void saludar(String nombre){
        System.out.println("hola "+ nombre);
    }
}
