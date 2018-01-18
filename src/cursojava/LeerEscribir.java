package cursojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author santiaguf
 */
public class LeerEscribir {
    
    //método escribir para abreviar el system.out...
    public void escribir(String mensaje) {
        System.out.println(mensaje);
    }
    
    //método o función leer para abreviar
    public float leer() throws IOException{       
        //creamos un objeto llamado br de la clase BufferedReader    
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));   
        //convertimos a tipo entero el String que recibimos de la entrada de consola
        float h = Integer.parseInt(br.readLine());  
        //retornamos el valor
        return (h);
    }
    
    public void triangulo() throws IOException{
        escribir("vamos a calcular el área de un triángulo, indícame:");
        escribir("base");
        float base = leer();
        escribir("altura");
        float altura = leer();
        float area = base* altura;
        escribir("el área del triángulo es: "+area);
    }
    public void calcularEdad() throws IOException{
        escribir("en qué año naciste?");
        float nacimiento = leer();
        int actual = 2018;
        float edad = actual-nacimiento;
        escribir("tienes "+edad+" años");
    }
}
