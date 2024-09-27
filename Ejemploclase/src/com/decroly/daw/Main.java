package com.decroly.daw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 1 
		
        System.out.println("Buenos Dias");
        
        // EJERCICIO 2
        
        System.out.println("ejercicio 2");
        {
        double lado = 5;
        double area = lado * lado;
        }
        
        // EJERCICIO 3
        
        System.out.println("area de un cuadrado");
        
        
        
        
        // EJERCICIO 4 
        
        System.out.println("operacion");
        {
        int num1 = 3;
        int num2 = 5;
        int operacion = (num1*num2);
        System.out.println("La multiplicacion es: " + operacion);
        int operacion1 = (num1/num2);
        System.out.println("La division es: "+ operacion1);
        int operacion2 = (num1+num2);
        System.out.println("La suma es: "+ operacion2);
        int operacion3 = (num1-num2);
        System.out.println("La resta es: "+ operacion3);
        }
        
        // EJERCICIO 5
        
        {
        System.out.println("longitud de radio");
        double radio1 = 4;
        double area1 = Math.PI * Math.pow(radio1, 2);
        System.out.println("La longitud es: "+ area1);
        double circunferencia = Math.PI * radio1 * 2;
        System.out.println("La circunferencia es: "+ circunferencia);
        double volumen = 4/3 * Math.PI * Math.pow(radio1, circunferencia);
        System.out.println("El volumen es: "+ volumen);
        }
        
        // EJERCICIO 6
        
        {
        System.out.println("precio y venta");
        double precio = 7.90;
        double real = 5.50;	
        double descuento = ((precio - real) / precio) * 100;
        System.out.printf("El porcentaje de descuento es: %.2f%%\n", descuento);
        }

        // EJERCICIO 7
        
        {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la distancia en millas marinas: ");
        double millasMarinas = scanner.nextDouble();
        double metros = millasMarinas * 1.852;
        System.out.printf("La distancia en metros es: %.2f m%n", metros);
        }
        
        // EJERCICIO 8
        
        {
        double num = 23;
        double num1 = 45;
        
        }
        
        
        
	}

}
