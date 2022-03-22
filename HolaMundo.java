import java.util.Scanner;

public class HolaMundo{
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Ingrese su nombre: ");
       String name = in.nextLine();
       System.out.println("Bienvenido a nuestro sistema " + name + ". Por favor escoja una de las opciones a continuacion:");

       System.out.println("Si desea saber cual es su signo presione 1");
        Int option = in.nextLine();

        if(option == 1){
            System.out.println("Ha entrado al sistema que reconoce su signo zodiacal.");
            System.out.println("Por favor digite el mes en el que nacio");
        }


    }
}