import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class GestionVideoDaw {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("***Bienvenido a VideoDaw***");
        String opcion = "";
        Cliente persona = new Cliente(opcion, opcion, opcion, opcion, null, null);

        do { 
            teclado = new Scanner (System.in);
            System.out.println("1 - Crear y registrar VideoClub en la franquicia");
            System.out.println("2 - Registrar película en videoclub");
            System.out.println("3 - Crear y registrar cliente en videoclub");
            System.out.println("4 - Alquilar película");
            System.out.println("5 - Devolver película");
            System.out.println("6 - Dar de baja cliente");
            System.out.println("7 - Dar de baja película");
            System.out.println("8 - Salir");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                String cif;
                do {
                    System.out.println("Introduzca el CIF para el registro del VideoClub");
                    cif = teclado.nextLine().toUpperCase();
                    if(setValidCif(cif)){
                        System.out.println("Correcto");
                    }else
                    System.out.println("Incorrecto, intentelo otra vez");
                }while (!setValidCif(cif));

                System.out.println("Introduza la direccion de su local");
                String direccion = teclado.nextLine();
                System.out.println(persona.getDireccion());
                    break;
                case "2":
                    
                    break;
                case "3":
                String dni;
                do {
                    System.out.println("Primero introduzca el DNI para registrar al cliente");
                    dni = teclado.nextLine().toUpperCase();
                    if(setValidDni(dni)){
                        System.out.println("Correcto");
                    }else
                    System.out.println("Incorrecto, intentelo otra vez");
                }while (!setValidDni(dni));
                System.out.println("Introduce el nombre");
                String nombre = teclado.nextLine();
                    
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
                System.out.println("Saliendo del programa, HASTA PRONTO");
                    break;
                default:
                System.out.println("Introduzca la alternativa correcta");
            }
        } while (!opcion.equalsIgnoreCase("8"));
    }
    public static boolean setValidDni(String dni) {
        Pattern pat = Pattern.compile("[A-Z]{1}[0-9]{8}");
        Matcher mat = pat.matcher(dni);
        return mat.matches();
        
    }
    public static boolean setValidCif(String cif) {
        Pattern pat = Pattern.compile("[A-Z]{1}[0-9]{7}[A-Z]{1}");
        Matcher mat = pat.matcher(cif);
        return mat.matches();
    }
}
