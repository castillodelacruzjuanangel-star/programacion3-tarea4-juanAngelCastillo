package Programa_4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir = false; //variable para detener el bucle

        while (!salir) {
            System.out.println("""
            ====================================
                    CALCULADORA BASICA
            ====================================
            1. Suma
            2. Resta
            3. Multiplicacion
            4. Division   
            5. salir     
            """);

            //Try-catch para los errores de entradas invalidas y errores en las operaciones
            try {
                System.out.print("Ingrese la opcion deseada: ");
                int opcion = leer.nextInt();

                //condicion if para reemplazar el default del switch (esto para evitar repetir codigo)
                if(opcion < 0 || opcion > 5){
                    System.out.println("\nOpcion invalida.\n");

                } else{

                    if(opcion == 5)
                        salir = true;
                    
                    else{
                        //solicita al usuario los 2 numeros que con los que quiere realizar la operacion
                        System.out.print("\nIngrese el primer numero: ");
                        int num1 = leer.nextInt();
                        System.out.print("Ingrese el segundo numero: ");
                        int num2 = leer.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Resultado: " + Calculadora.suma(num1, num2)); //llama al metodo estatico suma
                                break;

                            case 2:
                                System.out.println("Resultado: " + Calculadora.resta(num1, num2));//llama al metodo estatico resta
                                break;

                            case 3:
                                System.out.println("Resultado: " + Calculadora.multiplicacion(num1, num2));//llama al metodo estatico multiplicacion
                                break;

                            case 4:
                                System.out.println("Resultado: " + Calculadora.division(num1, num2));//llama al metodo estatico divicion
                                break;
                        }
                    }
                }

            } catch (ArithmeticException e) {
                System.out.println("ERROR: No es posible dividir entre cero(0)"); //catch para lanzar una excepcion cuando se intenta dividir entre 0

            } catch (InputMismatchException a){
                System.out.println("ERROR: Por favor ingresar numeros validos."); //catch para lanzar una excepcion cuando se intenta ingresar letras en vez de numeros
                leer.nextLine();

            } finally{
                System.out.println("Proceso finalizado.");
            }
        }
        leer.close();
    }
}
