# programacion3-tarea4-juanAngelCastillo

Tarea para practicar hilos, excepciones y archivos.

Cada programa se encuentra en su debido paquete enumerados para una mejor organizacion de codigo

Descripcion de cada programa.

  Programa 1: 
  Simula la descarga de archivos utilizando hilos, se imprime en pantalla el nombre del archivo y el progreso de la descarga. Cuando el progreso llega a 100% se imprime el mensaje "Descarga completada."

  Programa 2:
  Simula una carrera de 4 corredores utilizando hilos. Al emprezar se imprime en pantalla el estado actual de cada corredor, luego inicia la carrera se imprime el progreso de cada participante ejemplo: "pedro       avanzo al metro 4", al finalizar el programa se imprime denuevo el estado actual de los corredores y se imprime el nombre del ganador.

  Programa 3:
  Valida la edad del usuario utilizando try-catch y excepciones personalizadas. El programa cuenta con una excepcion personalizada EdadInvalidaException, Si el usuario es menor de edad el programa saltara al        catch y imprime "ERROR: debe ser mayor de edad." en caso contrario imprime "Edad registrada."

  Programa 4:
  Calculadora basica con try-catch para detectar errores. Realiza operaciones basicas (suma, resta multiplicacion y division) validando las entradas, evitando que se ingresen letras en vez de numeros tanto en la    seleccion de opciones del menu como al realizar alguna de las operaciones disponibles, lanza una excepion en caso de dividir entre 0

  Programa 5:
  Programa de registro de actividades. Permite al usuario guardar actividades en un archivo de texto, en programa crea un archivo de texto llamado "actividades.txt" en donde se guardan las actividades ingresadas    por el usuario, permite agregar actividades al final del archivo sin necesidad de borrar las que ya se encuentran guardas. El programa permite listar las actividades que se an guardado en caso de no haber         actividades imprime "La lista de actividades se encuentra vacia." en caso contrario imprime linea por linea las actividades guardadas en el archivo .txt


Como ejecutarlo: 

para ejecutar cada programa en su paquede se debe escribir en la terminal en los siguientes comandos
1- javac nombre-del-paquete/*.java
2- java nombre-del-paquete.App

ejemplo:
javac Programa_3/*.java
java Programa_3.App
