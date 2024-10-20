
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        //actividad 1 Crea un programa que pida diez números reales por teclado, 
        //los almacene en un array,y luego muestre todos sus valores.

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


        //actividad 2 Crea un programa que pida diez números reales por teclado, 
        //los almacene en un array,y luego muestre la suma de todos los valores.

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


        //actividad 3 Crea un programa que pida diez números reales por teclado, 
        //los almacene en un array,y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.

        Scanner teclado2 = new Scanner(System.in);
        int [] numeros2 = new int[10];
        System.out.println("Ingresar numeros");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros2[i] = teclado2.nextInt();
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int i = 1; i < numeros2.length; i++) {
            if (numeros2[i] > max) {
                max = numeros2[i];
            }
            if (numeros2[i] < min) {
                min = numeros2[i];
            }
        }
        System.out.println("El mayor es: " + max);
        System.out.println("El menor es: " + min);


        //actividad 4 Crea un programa que pida veinte números enteros por teclado, 
        //los almacene en un array y luego muestre por separado la suma de todos los valores positivos y negativos.
        
        Scanner teclado3 = new Scanner(System.in);
        int [] numeros3 = new int[20];
        int sumaPositivos=0;
        int sumaNegativos=0;
        System.out.println("Ingresar numeros");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros3[i] = teclado3.nextInt();
        if (numeros[i] > 0) {
            sumaPositivos += numeros3[i];
        } else if (numeros[i] < 0) {
            sumaNegativos += numeros3[i];
        }
    }
        System.out.println("La suma de positivos es: "+sumaPositivos);
        System.out.println("La suma de negativos es: "+sumaNegativos);
        //solucionar la 4

        
        //actividad 5 Crea un programa que pida veinte números reales por teclado, 
        //los almacene en un array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.

        Scanner teclado4 = new Scanner(System.in);
        int [] numeros4 = new int[20];
        double media = 0.0;
        int suma1 = 0;
        System.out.println("Ingresar numeros");

        for(int i = 0; i < numeros4.length; i++){
            System.out.print("Número " + (i + 1) + ": ");
            numeros4[i] = teclado4.nextInt();
            suma1 = suma1 + numeros4[i];
            media = media / numeros4.length;
        }
        System.out.println("La suma es: "+suma1);
        System.out.println("El numero de valores es: "+media);


        //actividad 6 Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
        //N, escriba M en todas sus posiciones y lo muestre por pantalla.

        Scanner teclado5 = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array (N): ");
        int n = teclado5.nextInt();
        System.out.print("Ingrese el valor a rellenar en el array (M): ");
        int m = teclado5.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = m;
        }
        System.out.println("Array rellenado con M:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }


        //actividad 7 

        Scanner = teclado6.new Scanner (System.in);
        System.out.print("Ingrese el valor inicial (P): ");
        int p = teclado6.nextInt();
        System.out.print("Ingrese el valor final (Q): ");
        int q = teclado6.nextInt();
        if (p > q) {
            System.out.println("El valor inicial (P) debe ser menor o igual que el valor final (Q).");
            return;
        }
        int[] array1 = new int[q - p + 1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = p + i;
        }
        System.out.println("Array con valores desde P hasta Q:");
        for (int value : array1) {
            System.out.print(value + " ");
        }


        //actividad 8

        Scanner = teclado7.new Scanner(System,in);
        double[] numeroRandom = new double[100];
        for (int i = 0; i < numeroRandom.length; i++) {
            numeroRandom[i] = Math.random();
        }
        System.out.print("Ingrese un valor real R (entre 0.0 y 1.0): ");
        double R = teclado7.nextDouble();
        int contador = 0;
        for (double number : numeroRandom) {
            if (number >= R) {
                contador++;
            }
        }
        System.out.println("Cantidad de valores en el array que son iguales o superiores a " + R + ": " + contador);


        //actividad 9

        Scanner = teclado8.new Scanner(System.in);
        int [] numeroAleatorio = new int [100];
        for (int i = 0; i < numeroAleatorio.length; i++){
            numeroAleatorio [i] = (int) (1 + Math.random() * 10);
        }
        System.out.println("Array generado: ");
        for (int i = 0; i < numeroAleatorio.length; i++) {
            System.out.print(numeroAleatorio[i] + " ");
        }
        teclado8 = new Scanner(System.in);
        System.out.print("Introduce un valor N entre 1 y 10: ");
        int N = teclado8.nextInt();

        System.out.println("El valor " + N + " aparece en las siguientes posiciones:");
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == N) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El valor " + N + " no se encuentra en el array.");
        }


    }
}
