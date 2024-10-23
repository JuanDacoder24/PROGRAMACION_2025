import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        //actividad 1 Crea un programa que pida una cadena de texto por teclado y luego muestre cada
        //palabra de la cadena en una línea distinta.

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = teclado.nextLine();

        String[] palabras = texto.split("\\s+");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        /*actividad 2 Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
        iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.*/

        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String texto1 = teclado1.nextLine();
        System.out.println("Introduce otro texto: ");
        String texto2 = teclado1.nextLine();
        Boolean verdadero;
        if (texto1.equals(texto2)){
            System.out.println("Las palabras son iguales");
        }else {
            System.out.println("Las palabras NO son exactamente iguales.");
        }
        if (texto1.equalsIgnoreCase(texto2)) {
            System.out.println("Las palabras son iguales (sin diferenciar mayúsculas y minúsculas).");
        } else {
            System.out.println("Las palabras NO son iguales (sin diferenciar mayúsculas y minúsculas).");
        }
        

        /*actividad 3 Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
        Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
        las tres primeras letras de cada uno de ellos. Por ejemplo, si se introduce “Lionel”,
        “Tarazón” y “Alcocer” mostrará “LIOTARALC”.*/

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Introducir nombre: ");
        String nombre = teclado2.nextLine();
        String s1 = nombre.substring(0,3);
        System.out.println("Introducir apellido: ");
        String apellido1 = teclado2.nextLine();
        String s2 = apellido1.substring(0,3);
        System.out.println("Introducir segundo apellido: ");
        String apellido2 = teclado2.nextLine();
        String s3 = apellido2.substring(0,3);
        String suma = s1+s2+s3;

        System.out.println("La palabra es: " + suma.toUpperCase());


        /*actividad 4 Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas
        ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
        mayúsculas y minúsculas.*/

        Scanner teclado3 = new Scanner (System.in);
        System.out.println("Introduce una frase: ");
        String frase = teclado3.nextLine().toLowerCase();
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            switch (c) {
                case 'a':
                contadorA++;
                    break;
                case 'e':
                contadorE++;
                    break;
                case 'i':
                contadorI++;
                    break;
                case 'o':
                contadorO++;
                    break;
                case 'u':
                contadorU++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Número de 'a': " + contadorA);
        System.out.println("Número de 'e': " + contadorE);
        System.out.println("Número de 'i': " + contadorI);
        System.out.println("Número de 'o': " + contadorO);
        System.out.println("Número de 'u': " + contadorU);



        /*actividad 5 Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo
        o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
        Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
        acentos, etc.). Un palíndromo es un texto que se lee igual de izquierda a derecha que de
        derecha a izquierda. */

        Scanner teclado4 = new Scanner(System.in);
        System.out.println("Colocar una frase: ");
        String frase1 = teclado4.nextLine();
        String fraseModificada = frase1.toLowerCase().replace(" ", "");
        boolean esPalindromo = true;
        int longitud = fraseModificada.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (fraseModificada.charAt(i) != fraseModificada.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase NO es un palíndromo.");
        }


        

    }
}
