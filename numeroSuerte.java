package co.edu.utp.misiontic2022.c2;


import java.util.Scanner;

public class numeroSuerte {
    /* Programa que pida por teclado la fecha de nacimiento de una persona
(día, mes, año) y calcule su número de la suerte.
El número de la suerte se calcula sumando el día, mes y año de la fecha
de nacimiento y a continuación sumando las cifras obtenidas en la suma.
Por ejemplo:
Si la fecha de nacimiento es 12/07/1980
Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 =
28
Número de la suerte: 28 */

//funciones de interaccion. recogemos datos y hacemos reportes o mesajes en consola

public static String leerFecha(){

    System.out.println("App del numero de la Suerte");
    System.out.println("Ingrese la fecha");
    Scanner lector = new Scanner(System.in);
    String fecha;
    fecha = lector.nextLine();
    
    return fecha;
    
}



//logica


public static int numeroSuerte(String fechaNacimiento){

    
    String[] partesFecha = fechaNacimiento.split("/",5);//se partela cadean y se convierte en arreglo
    int valorDias = Integer.parseInt(partesFecha[0]);//se convierte a entero desde un string
    int valorMeses = Integer.parseInt(partesFecha[1]);
    int valorAnos = Integer.parseInt(partesFecha[2]);
    
    int sumaPartes = valorDias + valorMeses + valorAnos;
    
    String sumaTexto = sumaPartes + "";
    //
    int sumatoriaCifras=0;
    for (int i=0; i< sumaTexto.length(); i++)
    {
        sumatoriaCifras += Character.getNumericValue(sumaTexto.charAt(i));//convierte valores string del arreglo a enteros
    }
    return sumatoriaCifras;


}    

public static void presentarResultado(int numeroSuerte) {
    System.out.println("elnumeor de la suerte es: "+numeroSuerte);

}

public static void main(String[] args) {
        presentarResultado(numeroSuerte(leerFecha()));
    }
}
