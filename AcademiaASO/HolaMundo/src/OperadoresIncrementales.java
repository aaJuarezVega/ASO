public class OperadoresIncrementales {
    public static void main(String[] args) {
        //Preincremento
        int i = 1;
        System.out.println("i = " + i);
        int j = ++i;
        System.out.println("j = " + j+"\n");

        i = 2;
        System.out.println("i = " + i);
        j = i++;

        System.out.println("j = " + j);
        System.out.println("i = " + i);

        //Predecremento
        System.out.println("Predecremento \n");
        i =3;
        System.out.println("i inicial = " + i);
        j = --i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Postdecremento
        System.out.println("\nPost Decremento");
        i = 5;
        System.out.println("i inicial = " + i);
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);




    }
}
