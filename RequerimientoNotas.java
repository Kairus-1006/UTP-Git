package co.edu.utp.misiontic2022.c2;


import java.util.Scanner;





public class RequerimientoNotas {

    //Logica
    //(Calcular el promedio ajustado)
    public static double calcularPromedioAjustado(int n1, int n2, int n3, int n4, int n5)
    {
        //declarar la variable que recibira la respuesta
        double promedioAjustado = 0;

        //identificar la peor nota y la vamos a almacenar
        int peorNota = n1;
        if(peorNota > n2)
        {
            peorNota = n2;
        }
        if (peorNota > n3)
        {
            peorNota = n3;
        }
        if(peorNota > n4)
        {
            peorNota =n4;
        }
        if (peorNota > n5)
        {
            peorNota = n5;
        }

        //3. calcular el promedio ajustado quitando la peor nota identificada
        promedioAjustado = (n1 + n2 + n3 + n4 + n5 - peorNota) / 4;
        promedioAjustado = (promedioAjustado * 5) / 100;
        return promedioAjustado;

    }

    public static void generarMensajePromedio(String codigo, double promedioAjustado) 
    {
        //4. armar el mensaje de salida como lo solicita el requerimiento
        System.out.println("el promedioajustado del estudiante es "+codigo+" es: "+promedioAjustado);
        
    
    }

public static void main(String[] args) {
    

    
    //interaccion --> recoleccion
    //1. obtener Info del estudiante: codigo y las 5 notas en escala de 0 a 100
    Scanner lector = new Scanner(System.in);

    System.out.println("Ingrese el codigo del estudiante: ");
    String codigo = lector.nextLine();
    System.out.println("Ingrese nota 1: ");
    int nota1 = lector.nextInt();
    System.out.println("Ingrese nota 2: ");
    int nota2 = lector.nextInt();
    System.out.println("Ingrese nota 3: ");
    int nota3 = lector.nextInt();
    System.out.println("Ingrese nota 4: ");
    int nota4 = lector.nextInt();
    System.out.println("Ingrese nota 5: ");
    int nota5 = lector.nextInt();

    lector.close();
    //2. identificar la peor nota
    //3. Calcular el promedio ajustado, quitando la peor nota identificada
    double promedioAjustado = calcularPromedioAjustado(nota1,nota2, nota3, nota4, nota5);

    //4. armar el mensaje de salida como lo solicita el requerimiento
    generarMensajePromedio(codigo, promedioAjustado);
}
}
