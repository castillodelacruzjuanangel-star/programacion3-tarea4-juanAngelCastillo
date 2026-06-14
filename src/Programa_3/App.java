package Programa_3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //try-catch para validar las entradas
        try {
            System.out.print("Ingrese su edad: ");
            int edad = leer.nextInt();

            Usuario.validarEdad(edad);
            leer.close(); //cierra al objeto leer

            System.out.println("Edad registrada."); //mensaje que se imprime en caso de entradas validas
        
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage()); //imprime un mensaje en caso de ser menor de edad
        }
        
        catch (InputMismatchException a){ //evita que se ingresen letras en vez de numeros
            System.out.println("ERROR: debe ingresar una edad valida.");
        }        
    }
}
