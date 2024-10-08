package com.decroly.daw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// EJERCICIO 1
	
		Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cual es tu edad?: ");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
		
		
	// EJERCICIO 2
        
        System.out.print("¿Cual es tu edad?: ");
        int edad1 = teclado.nextInt();
        if (edad1 >= 18) {
            System.out.println("Eres mayor de edad");
        }
        else {
        	System.out.println("Eres menor de edad");
		}
        
   // EJERCICIO 3
        
        System.out.println("Numero del 1 al 20:");
        int numero = 1;
        for (int i = 1; i <= 20; i++) {
        	System.out.println(i);
        }
     
   // EJERCICIO 4
        
        System.out.println("Numeros pares:");
        int numeropar = 2;
        for (int i = 2; i <= 200; i+=2) {
        	System.out.println(i);
        }
        
   // EJERCICIO 5
        
        System.out.println("Numeros pares:");
        int contador = 1;
        while (contador <= 200) {
        if (contador % 2 == 0) {
        System.out.println(contador);        
        }     
        contador ++;
        
        }
      
   // EJERCICIO 6 
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número N: ");
        int N = scanner.nextInt();
        System.out.println("Los números desde 1 hasta " + N + " son:");
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
      
   // EJERCICIO 7
        
        System.out.println("Colocar nota: ");
        Scanner teclado1 = new Scanner(System.in);
        double nota;
        nota = teclado1.nextDouble();
        if (nota < 3) {	
        	System.out.println("Muy deficiente");
        }else if (nota < 5)
        {
        	System.out.println("Insuficiente");
        }else if (nota < 6)
        {
        	System.out.println("Bien");
        }else if (nota < 9)
        {
        	System.out.println("Notable");
        }else if(nota >=9 && nota <= 10)
        {
        	System.out.println("Sobresaliente");
        }
       

   // EJERCICIO 8 
        
        Scanner positivo = new Scanner(System.in);
        System.out.println("Numero positivo N!: ");
        int positivo1 = scanner.nextInt();
        
        int factorial = 1;
        
        for (int i = 1; i <= positivo1; i++) {
            factorial *= i;
        }
        
        
        System.out.println("Factorial es: "+factorial);
        
        
   // EJERCICIO 9 
        
        System.out.println("insertar hora: ");
        int hora = scanner.nextInt();
        System.out.println("insertar minuto: ");
        int minuto = scanner.nextInt();
        System.out.println("insertar segundo: ");
        int segundo = scanner.nextInt();
        
        segundo ++;
        
        if (segundo >= 60) {
        	segundo = 0;
            minuto++;
            
        }
        if (minuto >= 60) {
        	minuto = 0;
            hora++;
            
        }
        if (hora >= 24) {
            hora = 0;
            
        }
        System.out.println("La hora después de transcurrir un segundo es: ");
        System.out.println(hora + " horas, " + minuto + " minutos, " + segundo + " segundos");
     
        
    // EJERCICIO 10
        
        Scanner negativo = new Scanner(System.in);
        boolean negativo1 = false;
        
        for (int i = 0; i < 10; i++) {
        	System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero1 = scanner.nextInt();
            if (numero1 < 0);{
            negativo1 = false;
            }
        }
        if (negativo1) {
            System.out.println("Se han leído números negativos.");
        } else {
            System.out.println("No se han leído números negativos.");
        }
        
    // EJERCICIO 11
        
        Scanner posi = new Scanner(System.in);
        int posi1 = 0;
        int nega1 = 0;
        
        for (int i = 0; i < 10; i++) {
        	System.out.print("Ingrese el número " + (i + 1) + ": ");
        	int numero1 = scanner.nextInt();
        	if (numero > 0) {
                posi1++;
            } else if (numero < 0) {
                nega1++;
                System.out.println("\nResultados:");
                System.out.println("Positivos: " + posi1);
                System.out.println("Negativos: " + nega1);
            }
        }
        
    // EJERCICIO 12
        
        Scanner nulo = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        double num1 = 0;
        boolean mostrarNum = true;
        System.out.println("Escribe una numero y para cerrar un cero: ");
        
        while(contador<=0) {
        	numero = scanner.nextInt();
        	contador++;
        }
        
        
    // EJERCICIO 13
        
        Scanner num = new Scanner(System.in);
        int suma = 0;
        int producto = 1;

        for (int i = 1; i <= 10; i++) {
            suma += i;
            producto *= i;
        }

        System.out.println("Suma de los 10 primeros números naturales: " + suma);
        System.out.println("Producto de los 10 primeros números naturales: " + producto);
        
        
        
        
        
    
        
        
	}

}
