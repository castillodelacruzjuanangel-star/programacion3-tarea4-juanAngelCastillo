package Programa_1;

public class App {
    public static void main(String[] args ) throws Exception{

        //Se inicializan los objetos de tipo Descarga estableciendo el nombre del archivo
        Descarga archivo1 = new Descarga("archivo1");
        Descarga archivo2 = new Descarga("archivo2");
        Descarga archivo3 = new Descarga("archivo3");

        System.out.println("---Simulador de progreso de descargas.---\n");

        System.out.println("ESTADO DE DESCARGAS ");

        System.out.println("\nNOMBRE\t\t\tPROGRESO\n");

        //se ponen en ejecucion los 3 hilos de descarga
        archivo1.start();
        archivo2.start();
        archivo3.start();
        
    }
}

