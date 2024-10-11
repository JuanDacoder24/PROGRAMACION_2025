import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        

        System.out.println("Introduce la cantidad de dinero: ");
        int cantidadEuros = teclado.nextInt();
        if (cantidadEuros % 5 != 0) {
            System.out.println("La cantidad introducida no es un múltiplo de 5 €.");
            return;
        }
        int billetes500 = cantidadEuros / 500;
        cantidadEuros %= 500;
        int billetes200 = cantidadEuros / 200;
        cantidadEuros %= 200;
        int billetes100 = cantidadEuros / 100;
        cantidadEuros %= 100;
        int billetes50 = cantidadEuros / 50;
        cantidadEuros %= 50;
        int billetes20 = cantidadEuros / 20;
        cantidadEuros %= 20;
        int billetes10 = cantidadEuros / 10;
        cantidadEuros %= 10;
        int billetes5 = cantidadEuros / 5;
        
        System.out.println("Billetes necesarios:");
        System.out.println("  Billetes de 500 €: " + billetes500);
        System.out.println("  Billetes de 200 €: " + billetes200);
        System.out.println("  Billetes de 100 €: " + billetes100);
        System.out.println("  Billetes de 50 €: " + billetes50);
        System.out.println("  Billetes de 20 €: " + billetes20);
        System.out.println("  Billetes de 10 €: " + billetes10);
        System.out.println("  Billetes de 5 €: " + billetes5);

        

        // ejercicio 2

        String opcion = "";
        teclado = new Scanner(System.in);

        do { 
            System.out.println("(1 - Sumar)");
            System.out.println("(2 - Restar)");
            System.out.println("(3 - Multiplicar)");
            System.out.println("(4 - Dividir)");
            System.out.println("(5 - Salir)");
            opcion = teclado.nextLine();

            int num1 = 0, num2 = 0;

            switch(opcion){
                case "1":
                    teclado= new Scanner (System.in);
                    System.out.println("Introduce el numero");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    System.out.println("el resultado es: "+(num1+num2));       
                    break;
                
                case "2":
                    teclado = new Scanner (System.in);
                    System.out.println("Introduce el numero");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    System.out.println("el resultado es: "+(num1-num2));       
                    break;

                case "3":
                teclado = new Scanner (System.in);
                    System.out.println("Introduce el numero");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    System.out.println("el resultado es: "+(num1*num2));
                    break;
            
                case "4":
                    teclado = new Scanner (System.in);
                    System.out.println("Introduce el numero");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    System.out.println("el resultado es: "+(num1/num2));
                    break;



                    
            }

        } while(!opcion.equals("5"));
        
    }

}

    
