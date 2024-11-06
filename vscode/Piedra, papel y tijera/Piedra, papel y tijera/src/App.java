import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        String [] opciones = {"Piedra, Papel, Tijera"};
        String continuar;
        System.out.println("****Bienvenido al juego: Piedra, papel o tijera****");
        System.out.println("En que consiste:\n El juego de Piedra, Papel o Tijera es un clásico juego de estrategia y azar que se juega con\n las manos. Consiste en elegir uno de tres elementos: piedra, papel o tijera, y compararlos para determinar quién gana.");
        
        String opcion = "";
        String opcionUsuario = teclado.nextLine();
        int opcionComputadora = random.nextInt();
        do{
            teclado =  new Scanner(System.in);
            System.out.println("Escoge una opcion");
            System.out.println("P - Piedra");
            System.out.println("L - Papel");
            System.out.println("T - Tijera");
            System.out.println("S - Salir");
            String opcionUsuario = teclado.nextLine();
            int opcionComputadora = random.nextInt(3)+1;
            int P = 1;
            int L = 2;
            int T = 3;
            switch (opcionUsuario) {
                case "P":
                System.out.println("Elegiste: Piedra");
                System.out.println("La computadora eligió: " + (opcionComputadora == P ? "Piedra" : (opcionComputadora == L ? "Papel" : "Tijera")));
                if (opcionComputadora == P) {
                    System.out.println("¡Es un empate!");
                } else if (opcionComputadora == L) {
                    System.out.println("¡Perdiste!");
                } else {
                    System.out.println("¡Ganaste!");
                }
                break; 

                case "L":
                System.out.println("Elegiste: Papel");
                System.out.println("La computadora eligió: " + (opcionComputadora == P ? "Piedra" : (opcionComputadora == L ? "Papel" : "Tijera")));
                if (opcionComputadora == L) {
                    System.out.println("¡Es un empate!");
                } else if (opcionComputadora == T) {
                    System.out.println("¡Perdiste!");
                } else {
                    System.out.println("¡Ganaste!");
                }
                break;

                case "T":
                System.out.println("Elegiste: Tijera");
                System.out.println("La computadora eligió: " + (opcionComputadora == P ? "Piedra" : (opcionComputadora == L ? "Papel" : "Tijera")));
                if (opcionComputadora == T) {
                    System.out.println("¡Es un empate!");
                } else if (opcionComputadora == P) {
                    System.out.println("¡Perdiste!");
                } else {
                    System.out.println("¡Ganaste!");
                }
                break;
                default:
                    break;
            }




        }while(!opcion.equals("S"));
        
        

    }
}
