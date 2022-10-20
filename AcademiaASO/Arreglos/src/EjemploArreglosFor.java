import java.math.BigDecimal;
import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        Long[] l = new Long[7];

        for (int i = 0; i < l.length; i++) {
            System.out.println("Long[ " + i + " ] "  + l[i]);

        }

        Integer[] k = new Integer[7];

        for (int i = 0; i < k.length; i++) {
            System.out.println("Integer[ " + i + " ] "  + k[i]);

        }

        BigDecimal[] m = new BigDecimal[7];

        for (int i = 0; i < m.length; i++) {
            System.out.println("BigDecimal[ " + i + " ] "  + m[i]);

        }

        String[] productos = new String[7];

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2]= "Disco duro SSD Samsung Externo";
        productos[3] = "Asus Nonebook";
        productos[4] = "Mackbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        for (String s: productos) {
            System.out.println( s);
        }

        for (int i = 0; i < productos.length; i++) {
            System.out.println("productos = " + productos[i]);

        }



        int[] numeros = new int[4];

        numeros[0] = 126;
        numeros[1] = Integer.valueOf("25");
        numeros[2] = (int) 53l;
        numeros[3] = 44;

        Arrays.sort(numeros);




    }

}
