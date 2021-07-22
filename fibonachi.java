package co.edu.utp.misiontic2022.c2;

public class fibonachi {
    
//Mostrar los N primeros términos de la serie de Fibonacci.
//F(N) = F(N-2)+ F(N-1)
    static final int F_0 = 0;
    static final int F_1 = 1;

    public static void mostrarSerieFibonacci(int n){
        //variables
        int terminoN_2 = F_0;
        int terminoN_1 = F_1;

        //generalizar la presentacion de todos los terminos
        for (int i = 0; i <= n; i++) {
            //casos base
            if(i==0 || i==1){
                System.out.printf("F(%d) = %d %n",i,i);
            }else{//caso general
                System.out.printf("F(%d) = f(%d) + f(%d) = %d %n",i,i-2,i-1,terminoN_2 + terminoN_1);
                int auxiliar = terminoN_2;
                terminoN_2 = terminoN_1;
                terminoN_1 = auxiliar; 
            }

        }
    }

    public static void main(String[] args) {
        
        System.out.println("Serie de Fibonacci");
        mostrarSerieFibonacci(8);
    }
}
