import java.util.Scanner;
public class DawBank {
    public static void main(String[] args) throws Exception {
        System.out.println("***Bienvenido a TuBank***");
        Scanner teclado = new Scanner(System.in);
        String opcion = "";
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
                    break;

                case "2":
                    break;

                case "3":
                    break;  

                case "4":
                    break;

                case "5":
                    break;

                case "6":
                    break;

                case "7":
                    break;

                case "8":
                    break;
            }
        } while (!opcion.equalsIgnoreCase("8"));
    }
}
