import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"zul", "amarillo", "rojo", "verde", "blanco", "negro", "cafe"};

        for (int i = 0; i < 100; i++) {

            //random = Math.random();
            double random = Math.random();
            System.out.println("random = " + random);

            // Quiero un nuúmero entre 0 y 7 se pone la siguiente linea.
            random *= 7;

            System.out.println("random = " + random);

            random = Math.floor(random);
            System.out.println("random = " + random);

            System.out.println("Colores = " + colores[(int) random]);

            //Objeto Random

            System.out.println("Aleatorio Int con objeto Random");
            Random randomObjInt = new Random();
            int randomInt =  randomObjInt.nextInt(7);
            System.out.println("randomInt = " + randomInt);


            System.out.println("Aleatorio Long con objeto Random");
            Random randomObjLng = new Random();
            long randomLong =  randomObjLng.nextLong();
            System.out.println("randomLong = " + randomLong);
        }
    }

}
