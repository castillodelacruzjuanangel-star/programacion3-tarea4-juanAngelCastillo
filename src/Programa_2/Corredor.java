package Programa_2; 

public class Corredor extends Thread{
    private String nombreCorredor;
    public static String ganador = ""; //variable estatica vacia para guardar al ganador

    public Corredor(String nombre){
        this.nombreCorredor = nombre;
    }

    @Override
    public void run(){

        for(int i = 0; i <= 10; i++){
            System.out.println(nombreCorredor + " avanzo al metro " + i); //imprime el avance de cada corredor

            try {
                Thread.sleep(2000); //tiempo entre cada metro de 2 segundos
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(nombreCorredor + " llego a la meta"); //imprime el nombre del corredor cunado este llega a la meta

        //guarda el nombre del primero que llego a la meta y lo almacena en la variable ganador
        if(ganador.equals("")){
            ganador = nombreCorredor;
        }
    }
    
    public String getNombre(){
        return nombreCorredor;
    }

}
