package Programa_5;

import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader;
import java.util.List;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);
        boolean salir = false; //variable booleana para controlar el bucle
        int opcion;
        Path ruta = Paths.get("actividades.txt"); //crea el archivo .txt en donde se encuentre el programa alojado

        while (!salir) {

            System.out.println("""
            ---------------------------------------
                    REGISTRO DE ACTIVIDADES
            ---------------------------------------
            1. Agregar actividad
            2. Mostrar actividades
            3. Salir  
                """);
                
            System.out.print("Ingrese la opcion deseada: ");
            opcion = leer.nextInt();
            leer.nextLine();
            

            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Agregue una actividad(enter para guardar): ");
                        String actividad = leer.nextLine(); //lee el texte que se le ingrese desde el teclado guardandolo en la variable actividad

                        //verifica que el archivo existe y luego guarda los escrito en la variable al final del archivo el archivo
                        //en caso de no existir, crea uno nuevo
                        Files.write(ruta, List.of(actividad), StandardOpenOption.CREATE, StandardOpenOption.APPEND); 
                        System.out.println("\nLa actividad se guardo correctamente.");
                        
                    } catch (IOException e) { 
                        System.out.println("ERROR: no se pudo abrir el archivo.");
                    }
                    break;

                case 2:
                    //condicion para verificar que el archivo si existe
                    if(Files.exists(ruta)){ 

                        BufferedReader leerArchivo = Files.newBufferedReader(ruta);
                        String leerActividad;

                        try {
                            System.out.println("""
                                    ====================================
                                            LISTA DE ACTIVIDADES
                                    ====================================
                                    """);

                            //bucle para leer linea por linea el archivo, Parando cuando no encuentre mas lineas
                            while((leerActividad = leerArchivo.readLine()) != null){
                                System.out.println(leerActividad); //imprime la linea guardada en la variable leerActividad
                            }

                            leerArchivo.close(); //cierra el archivo

                        } catch (Exception e) {
                            System.out.println("ERROR: no se pudo abrir el archivo.");
                        }
                    }
                    else{
                        System.out.println("La lista de actividades se encuentra vacia.");
                    }
                    break;

                case 3:
                    salir = true;
                    break;

                default:
                    System.out.println("Opcion invalida. Por favor seleccionar una de la opciones Disponi.");
                    break;
            }
        }
        leer.close();

    }
}
