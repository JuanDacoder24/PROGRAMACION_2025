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
        
        
        
	}

}
