
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        //actividad 1//

        Scanner teclado = new Scanner(System.in);
        int [] numeros = new int[10];
        System.out.println("Ingresar numeros");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("\nLos números ingresados son:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }


        //actividad 2//

        Scanner teclado1 = new Scanner(System.in);
        int [] numeros1 = new int[10];
        System.out.println("Ingresar numeros");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros1[i] = teclado1.nextInt();
        }
        int suma = 0;
        for (int numero : numeros1){
            suma += numero;
        }
        System.out.println("La suma de sus numeros es: "+suma);


        //actividad 3//

        Scanner teclado2 = new Scanner(System.in);
        int [] numeros2 = new int[10];
        System.out.println("Ingresar numeros");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros1[i] = teclado1.nextInt();
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
//falta terminar//
        for (int i = 0; i <= min; i++) {
            if(min < i)

            System.out.println("El menor es: " + min);
        }
        for (int i = 0; i <= min; i++) {
            if(max > i)

            System.out.println("El mayor es: " + max);
        }
        

        //actividad 4//
        
        Scanner teclado3 = new Scanner(System.in);
        int [] numeros3 = new int[10];
        System.out.println("Ingresar numeros");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros1[i] = teclado1.nextInt();
        }

           

    }
}
