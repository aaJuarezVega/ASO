import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*
        //Arreglo usuarios
        String[] usernames = new String[2];
        String[] passwords  = new String[2];

        usernames[0] = "Alex";
        usernames[1] = "Luis";

        passwords[0] = "1234";
        passwords[1] = "1234";
        */

        //Arreglo usuarios
        String[] usernames = {"Alex", "Luis"};
        String[] passwords = {"1234","1234"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Usuario: ");
        String u = scanner.next();

        System.out.println("Ingrese password: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i=0; i< usernames.length; ++i){
            if ( (usernames[i].equals(u) && passwords[i].equals(p))  ){
                esAutenticado = true;
                break;
            }

        }

        if (esAutenticado){
            System.out.println("Bienvenido " .concat(u).concat("!"));
        } else {
            System.out.println("Usuario invalido, intente nuevamente!");

        }

    }
}
