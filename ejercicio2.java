package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejercicio2 {
    
    /* Programa que calcule el precio de venta de un producto conociendo el precio
    por unidad (sin IVA) del producto, el número de productos vendidos y el
    porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.
 */
    //ejemplo declaracion constante
    public static final int constanteGloria = 12;
    public static final double IVA = 0.19;

    public static int[] leerProducto(){
        //arreglo querecibe info
        int[] arregloInfoProducto = new int[2];

        //construccion del scanner
        Scanner lector = new Scanner(System.in);

        //recoger precio del producto
        System.out.println("ingrese precio del producto --> ");
        arregloInfoProducto[0] = lector.nextInt();

        //recoger cantidad del producto
        System.out.println("ingrese cantidad del producto --> ");
        arregloInfoProducto[1] = lector.nextInt();
        lector.close();

        //retornar info coleccionada en el arreglo
        return arregloInfoProducto;
    }

    public static void presentarPrecioVenta(double precioVentaFinal){
        System.out.println("---El precio con IVA es: "+precioVentaFinal+"---");
    }
    
    //logica

    public static double calcularPrecioVenta(int precioUnidad, int cantidad){

        //variable donde se almacenara precio deventa
        double precioVenta = 0;

        precioVenta = precioUnidad * cantidad * IVA;
        precioVenta = precioVenta + (precioUnidad * cantidad);
        
        return precioVenta;

    }
    public static void main(String[] args) {

        //ejecucion
        int[] infoProducto = leerProducto();
        presentarPrecioVenta(calcularPrecioVenta(infoProducto[0], infoProducto[1]));
        
        
    }
}
