package Programa_2;


public class App {

    public static void main(String[] args) {

        Corredor juan = new Corredor("juan");
        Corredor pedro = new Corredor("pedro");
        Corredor ana = new Corredor("ana");
        Corredor carlos = new Corredor("carlos");

        System.out.println("======ESTADO ACTUAL DE LOS CORREDORES======");

        //se imprime el estado actual de los 4 hilos
        System.out.println(juan.getNombre() + " estado: " + juan.getState());
        System.out.println(pedro.getNombre() + " estado: " + pedro.getState());
        System.out.println(ana.getNombre() + " estado: " + ana.getState());
        System.out.println(carlos.getNombre() + " estado: " + carlos.getState());

        System.out.println("\n======INICIA LA CARRERA======");

        //cada hilo empieza su ejecucion
        juan.start();
        ana.start();
        pedro.start();
        carlos.start();

        //se hace un try-catch para capturar posibles interrupciones entre los hilos
        try {
            juan.join();
            ana.join();
            pedro.join();
            carlos.join();

        } catch (InterruptedException e) {
            System.out.println("Se ha interrumpido la carrera.");
        }
    
        System.out.println("\n======TERMINA LA CARRERA======");

        //se imprime en pantalla el estado actual de los corredores despues de la carrera
        System.out.println(juan.getNombre() + " estado: " + juan.getState());
        System.out.println(pedro.getNombre() + " estado: " + pedro.getState());
        System.out.println(ana.getNombre() + " estado: " + ana.getState());
        System.out.println(carlos.getNombre() + " estado: " + carlos.getState());

        System.out.println("\nEl ganador es " + Corredor.ganador); //se imprime al ganador siendo este el hilo que termino primero su ejecucion
    }
}
