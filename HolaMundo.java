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

        if(option != 1){
                System.out.print("Mi hermano le dije que digite 1 si quiere saber el signo, sino coma mierda entonces eh");
        }

        if(option == 1){
            System.out.println("Listo mbb, ahora diga en que hijueperra dia nacio, OJO solo el dia.");
            int day = in.nextInt();
            System.out.println("Mano, enserio nacio el " + day + "? Quieto.");
            System.out.println("Bueno amor, ahora digite el numero del mes en el que nacio. Tenga en cuenta la siguiente tabla: \n 1. Enero \n 2. Febrero \n 3. Marzo \n 4. Abril \n 5. Mayo \n 6. Junio \n 7. Julio \n 8. Agosto \n 9. Septiembre \n 10. Octubre \n 11. Noviembre \n 12. Diciembre" );
            int month = in.nextInt();

                if(month == 1 && day <= 20){
                        System.out.println("Sos dizque capricornio JAAJAJA");
                }else{
                        System.out.println("Todavia no tengo mas hecho, relajao que dentro de poquito esta.");
                }

        }
     

    }
}