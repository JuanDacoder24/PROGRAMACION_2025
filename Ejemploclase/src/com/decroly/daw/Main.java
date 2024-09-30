package com.decroly.daw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 1 
		
        System.out.println("Buenos Dias");
        
        // EJERCICIO 2
        
        
        double lado = 5;
        double area = lado * lado;
        System.out.println("ejercicio 2: "+ area);
        
        
        // EJERCICIO 3
        
        
        area = 3;
        double area1 = Math.PI * Math.pow(area, 2);
        System.out.println("area de un cuadrado: "+ area1);      		
        
        
        // EJERCICIO 4 
        
        System.out.println("operacion");
        
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
        
        
        // EJERCICIO 5
        
        
        System.out.println("longitud de radio");
        double radio1 = 4;
        double area2 = Math.PI * Math.pow(radio1, 2);
        System.out.println("La longitud es: "+ area2);
        double circunferencia = Math.PI * radio1 * 2;
        System.out.println("La circunferencia es: "+ circunferencia);
        double volumen = 4/3 * Math.PI * Math.pow(radio1, circunferencia);
        System.out.println("El volumen es: "+ volumen);
        
        
        // EJERCICIO 6
        
        
        System.out.println("precio y venta");
        double precio = 7.90;
        double real = 5.50;	
        double descuento = ((precio - real) / precio) * 100;
        System.out.printf("El porcentaje de descuento es: %.2f%%\n", descuento);
        

        // EJERCICIO 7
       
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la distancia en millas marinas: ");
        double millasMarinas = scanner.nextDouble();
        double metros = millasMarinas * 1.852;
        System.out.println("La distancia en metros es: "+metros);
        
        
        
        // EJERCICIO 8
        
        System.out.print("Introduce el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int numero2 = scanner.nextInt();
        if (numero1 < numero2) {
            System.out.println("Los numeros en orden ascendente son: " + numero1 + ", " + numero2);
        } else {
            System.out.println("Los numeros en orden ascendente son: " + numero2 + ", " + numero1);
        }
        

        
        // EJERCICIO 9
        
        System.out.print("Introduce el primer numero: ");
        int numero3 = scanner.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int numero4 = scanner.nextInt();
        if (numero3 > numero4) {
            System.out.println("El numero mayor es: " + numero3);
        } else if (numero3 < numero4) {
            System.out.println("El numero mayor es: " + numero4);
        } else {
            System.out.println("Los numeros son iguales.");
        }
        
        
        
        // EJERCICIO 10
        
        System.out.print("Ingrese el primer numero: ");
        int num5 = scanner.nextInt();        
        System.out.print("Ingrese el segundo numero: ");
        int num6 = scanner.nextInt();     
        System.out.print("Ingrese el tercer numero: ");
        int num7 = scanner.nextInt();
        int mayor;
        if (num5 > num6 && num5 > num7) {
            mayor = num5;
        } else if (num6 > num5 && num6 > num7) {
            mayor = num6;
        } else {
            mayor = num7;
        }
        System.out.println("El número mayor es: " + mayor);
        
        

        // EJERCICIO 11
        
        System.out.print("Ingrese el primer numero: ");
        int num8 = scanner.nextInt();        
        System.out.print("Ingrese el segundo numero: ");
        int num9 = scanner.nextInt();
        int suma = num8 + num9; 
        System.out.println("suma: "+ suma);
        int resta = num8 - num9;
        System.out.println("resta: "+ resta);
        int producto = num8 * num9;
        System.out.println("producto: "+ producto);
        int division = num8 / num9;
        System.out.println("division: "+ division);
        
	
        // EJERCICIO 12
        
        System.out.println("Ingresar numero: ");
        int num10 = scanner.nextInt();
        System.out.println("Ingresar numero: ");
        int num11 = scanner.nextInt();
        if (num10 > num11) {
            System.out.println("El numero mayor es: " + num10);
        } else if (num10 < num11) {
            System.out.println("El numero mayor es: " + num11);
        }
        
            
        // EJERCICIO 13
        
        System.out.println("Ingresa numero: ");
        int num12 = scanner.nextInt();
        if (num12 >= 0) {
            System.out.println("El número " + num12 + " es positivo.");
        } else {
            System.out.println("El número " + num12 + " es negativo.");
        }
        
        
        
        
	}

}
