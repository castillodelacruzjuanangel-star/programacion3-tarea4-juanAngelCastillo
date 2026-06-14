package Programa_3;

public class Usuario {
    public static void validarEdad(int edad) throws EdadInvalidaException{
        if(edad < 18){
            throw new EdadInvalidaException("ERROR: debe ser mayor de edad.");
        }
    }

}
