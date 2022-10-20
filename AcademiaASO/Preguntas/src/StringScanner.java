import java.util.ArrayList;
import java.util.Scanner;
public class StringScanner {

//        public static void main(String[] args) {
//            String in ="1 10 100 1000";
//            //String in ="1 2 3 4 5 6 7 8 9 10";
//
//            //Scanner s=new Scanner(in);
//            Scanner s=new Scanner(in);
//
//            int accum=0;
//            for (int i = 0; i < 4; i++) {
//                accum+=s.nextInt();
//            }
//            System.out.println(accum);
//        }

    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(7);
        l.add(1);
        l.add(5);
        l.add(1);
        l.remove(1);
        System.out.println(l); // ¿Cual es la salida?


        //Forma correcta de inicializar un boolean
        //boolean a = 0; error
         //boolean b = 1; error
         //boolean c = null; error
         boolean d = (1 < 5);

        System.out.println("Result:" + 2+3+5);
        System.out.println("Result:" + 2+3*5);


    }

}
