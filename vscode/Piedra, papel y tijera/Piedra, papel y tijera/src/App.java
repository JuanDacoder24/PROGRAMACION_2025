import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        System.out.println("****Bienvenido al juego: Piedra, papel o tijera****");
        System.out.println("En que consiste:\n El juego de Piedra, Papel o Tijera es un clásico juego de estrategia y azar que se juega con\n las manos. Consiste en elegir uno de tres elementos: piedra, papel o tijera, y compararlos para determinar quién gana.");

        String opcion = "";
        String opcionUsuario = Scanner.nexLine();
        String opcionComputadora = random.nexLine(P,L,T);

        do{
            teclado = Scanner(System.in);
            System.out.println("Escoje");
            System.out.println("P - Piedra");
            System.out.println("L - Papel");
            System.out.println("T - Tijera");
            System.out.println("S - Salir");
            String [] opciones = {"Piedra, Papel, Tijera"};

            switch (opcion) {
                case "P":
                teclado = Scanner(System.in);
                if (opcionUsuario.equals(P)>opcionComputadora){
                    System.out.println("Haz ganado");
                }else{
                    System.out.println("Haz perdido");
                }
                    break;
            
                default:
                    break;
            }




        }while(!opcion.equals("S"));
        
        

    }
}
