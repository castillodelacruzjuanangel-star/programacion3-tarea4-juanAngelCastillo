package Programa_1;

public class Descarga extends Thread{
    private String nombreArchivo;

    //constructor para inicializar el e
    public Descarga(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }


    @Override
    public void run(){
        int porcentaje = 0; //se declara una variable que representa el porcentaje de descarga
        for(int i  = 0; i <= 10; i++){
            System.out.println(nombreArchivo + "\t\t" + porcentaje + "%"); //se imprime el nombre del archivo y su progreso
            porcentaje += 10; //se aumenta en 10 cada vuelta del ciclo

            try {
                Thread.sleep(1500); //se establece un tiempo de 1.5 segundos entre porcentaje
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Descarga completada"); //al parar el bucle la variable porcentaje queda igual a 100 y se imprime el mensaje
    }
}
