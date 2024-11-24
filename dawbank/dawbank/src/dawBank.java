import java.util.Scanner;
public class DawBank {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        System.out.println("***Bienvenido a TuBank***");
        System.out.println("Introduce una IBAN");
        String iban;
        do {
            iban = teclado.nextLine();
        }while (!setValidIban(iban));

        System.out.println("Ingresa nombre del titular");
        String nombre = teclado.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(iban, titular);
        String opcion = "";
        teclado = new Scanner(System.in);
        do { 
            System.out.println("1 - Datos de la cuenta");
            System.out.println("2 - IBAN");
            System.out.println("3 - Titular");
            System.out.println("4 - Saldo");
            System.out.println("5 - Ingreso");
            System.out.println("6 - Retirada");
            System.out.println("7 - Movimientos");
            System.out.println("8 - Salir");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                System.out.println("Titular: " + cuenta.getTitular() + "IBAN: " + cuenta.getIban() + "Saldo: " + cuenta.getSaldo());
                    break;

                case "2":
                System.out.println("El numero del IBAN es: " + cuenta.getIban());
                    break;

                case "3":
                System.out.println("El titular de la cuneta es: " + cuenta.getTitular());
                    break;  

                case "4":
                System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());
                    break;

                case "5":
                System.out.println("Escriba la cantidad que desee ingresar.");
                teclado = new Scanner(System.in);
                double ingreso = teclado.nextDouble();
                teclado.nextLine();
                cuenta.ingresarMovimientos(ingreso);
                    break;

                case "6":
                System.out.println("Escriba la cantidad que desee retirar.");
                teclado = new Scanner(System.in);
                double retirada = teclado.nextDouble();
                teclado.nextLine();
                cuenta.ingresarMovimientos(retirada);
                    break;

                case "7":
                cuenta.mostrarMovimiento();
                    break;

                case "8":
                System.out.println("Saliendo del programa, HASTA PRONTO");
                    break;
                default:
                System.out.println("Introduzca la alternativa correcta");
            }
        } while (!opcion.equalsIgnoreCase("8"));
    }
}
