import java.util.Scanner;

public class HolaMundo{
    public static void main(String[] args){

       Scanner in = new Scanner(System.in);
       System.out.println("Ingrese su nombre: ");
       String name = in.nextLine();
       System.out.println("Bienvenido a nuestro sistema " + name);

       System.out.println("Si desea conocer su signo zodiacal marque 1");
        String number = in.nextLine();
        int option = Integer.parseInt(number);

        if(option == 1){
            System.out.print("Listo.");
        }
     

    }
}