import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        /*actividad 1 Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
        y luego muestre la matriz por pantalla.*/

        int[][] matriz = new int[5][5];
        int contador = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); 
        }


        /*actividad 2 Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
        multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.*/


        int[][] matriz1 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz1[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println(); 
        }


        /*actividad 3 Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
        introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
        matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
        menores que cero y cuántos son igual a cero. */

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de filas N: ");
        int n = teclado.nextInt();
        System.out.print("Introduce el número de columnas M: ");
        int m = teclado.nextInt();
        int[][] matriz3 = new int[n][m];
        System.out.println("Introduce los valores de la matriz (" + n + "x" + m + "): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz3[i][j] = teclado.nextInt();
            }
        }

        int mayoresCero = 0;
        int menoresCero = 0;
        int igualesCero = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz3[i][j] > 0) {
                    mayoresCero++;
                } else if (matriz3[i][j] < 0) {
                    menoresCero++;
                } else {
                    igualesCero++;
                }
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Valores mayores que 0: " + mayoresCero);
        System.out.println("Valores menores que 0: " + menoresCero);
        System.out.println("Valores iguales a 0: " + igualesCero);


        /*actividad 4 Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
        1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
        programa mostrará la nota mínima, máxima y media de cada alumno.*/

        Scanner teclado1 = new Scanner(System.in);
        double[][] notas = new double[4][5];
        for (int alumno = 0; alumno < 4; alumno++) {
            System.out.println("Introduce las notas para Alumno " + (alumno + 1) + ":");
            for (int asignatura = 0; asignatura < 5; asignatura++) {
                System.out.print("Nota para la Asignatura " + (asignatura + 1) + ": ");
                notas[alumno][asignatura] = teclado1.nextDouble();
            }
        }

        for (int alumno = 0; alumno < 4; alumno++) {
            double suma = 0;
            double minima = notas[alumno][0];
            double maxima = notas[alumno][0];

            for (int asignatura = 0; asignatura < 5; asignatura++) {
                double nota = notas[alumno][asignatura];
                suma += nota;

                if (nota < minima) {
                    minima = nota;
                }
                if (nota > maxima) {
                    maxima = nota;
                }
            }

            double media = suma / 5;

            System.out.println("\nResultados para Alumno " + (alumno + 1) + ":");
            System.out.println("Nota mínima: " + minima);
            System.out.println("Nota máxima: " + maxima);
            System.out.println("Nota media: " + media);
        }


        /*actividad 5  */

        Scanner teclado2 = new Scanner (System.in);
        System.out.print("Introduce el número de personas: ");
        int ene = teclado2.nextInt();
        double[][] datos = new double[ene][2];
        double sumaSueldosHombres = 0;
        double sumaSueldosMujeres = 0;
        int contadorHombres = 0;
        int contadorMujeres = 0;
        for (int i = 0; i < ene; i++) {
            System.out.print("Introduce el género de la persona " + (i + 1) + " (0 para varón, 1 para mujer): ");
            int genero = teclado2.nextInt();

            System.out.print("Introduce el sueldo de la persona " + (i + 1) + ": ");
            double sueldo = teclado2.nextDouble();
            datos[i][0] = genero;
            datos[i][1] = sueldo;
            if (genero == 0) { 
                sumaSueldosHombres += sueldo;
                contadorHombres++;
            } else if (genero == 1) {
                sumaSueldosMujeres += sueldo;
                contadorMujeres++;
            }
        }
        double mediaSueldosHombres = (contadorHombres > 0) ? sumaSueldosHombres / contadorHombres : 0;
        double mediaSueldosMujeres = (contadorMujeres > 0) ? sumaSueldosMujeres / contadorMujeres : 0;

        System.out.println("\nResultados:");
        if (contadorHombres > 0) {
            System.out.println("Sueldo medio de los hombres: " + mediaSueldosHombres);
        } else {
            System.out.println("No se introdujeron datos de hombres.");
        }

        if (contadorMujeres > 0) {
            System.out.println("Sueldo medio de las mujeres: " + mediaSueldosMujeres);
        } else {
            System.out.println("No se introdujeron datos de mujeres.");
        }

        if (contadorHombres > 0 && contadorMujeres > 0) {
            if (mediaSueldosHombres > mediaSueldosMujeres) {
                System.out.println("Existe brecha salarial: Los hombres ganan más en promedio.");
            } else if (mediaSueldosMujeres > mediaSueldosHombres) {
                System.out.println("Existe brecha salarial: Las mujeres ganan más en promedio.");
            } else {
                System.out.println("No hay brecha salarial: Ambos géneros ganan lo mismo en promedio.");
            }
        }


    }
}
