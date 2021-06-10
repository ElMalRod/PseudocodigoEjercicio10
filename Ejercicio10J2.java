import java.util.Scanner;

public class Ejercicio10J2 {

    public static void main(String[] args) {
        // variables a utilizar
        Scanner sc = new Scanner(System.in);
        int N;
        int contador=0;
        int mult=0;
        int num=0;
        boolean ciclo = true;
        do {
            System.out.println("Ingrese un numero");
            N=sc.nextInt();
             contador=contador+N;
            if (N%6==0) {
               mult=mult+1;
            }
            else if (N<=10) {
                num=num+N;
            }
       
           
        } while (contador!=1000);
        System.out.println("La sumatoria es de: "+contador);
        System.out.println("la cantidad de numeros multiplos de 6 es de: "+mult);
        System.out.println("la suma de numeros entre 1 y 10 es de: "+num);

    }
}