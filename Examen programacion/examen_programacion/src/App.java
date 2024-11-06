import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        int [] array = new int [teclado.nextInt()];
        System.out.println("Inserte numeros: ");
        for(int i = 0; i<array.length; i++){
            array[i] = teclado.nextInt();
            }
        String opcion = "";
        do {
             opcion = teclado.nextLine();
             teclado = new Scanner(System.in);
             System.out.println("1 - Modificar coleccion");
             System.out.println("2 - Estadisticas de la coleccion");
             System.out.println("3 - Ampliar el valor de la coleccion");
             System.out.println("4 - Salir");

             switch (opcion) {
                 case "1":
                 teclado = new Scanner(System.in);
                 System.out.println(">> Insertar numero: ");
                 System.out.println(">> Borrar numero de una posicion: ");
                 System.out.println(">> Modificar numero de una posicion especifica: ");

                 case "2":
                 
                 System.out.println(">> Media de todos los valores no nulos: ");
                 double media;
                 int suma = 0;
                 for(int i = 0; i < array.length; i++){
                    array[i] = teclado.nextInt();
                    media = suma / array.length;
                    System.out.println("La media es: " + media);
                }
                 System.out.println(">> Suma de todos los valores: ");
                 int suma1 = 0;
                 for (int i = 0; i < array.length; i++) {
                    System.out.print((i + 1));
                    array[i] = teclado.nextInt();
                    suma1 = suma1 + array[i];
                    System.out.println("La suma es:" + suma1);
                 }
                 System.out.println(">> Maximo de la coleccion: ");
                 int max = Integer.MAX_VALUE;
                 for (int i = 1; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                    System.out.println("El maximo es: " + max);
                 }
                 System.out.println(">> Minimo de la coleccion: ");
                 int min = Integer.MIN_VALUE;
                 for (int i = 1; i < array.length; i++) {
                    if (array[i] > min) {
                        min = array[i];
                    }
                    System.out.println("El minimo es: " + min);
                 }

                 case "3":
                 teclado = new Scanner(System.in);
                 
                     
                     break;
                 
             }
            
        } while (!opcion.equals("4"));

    }
}
