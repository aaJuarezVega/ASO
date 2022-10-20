import java.util.HashMap;

public class Map {


        public static void main(String[] args) {

            // Creamos el Map paisCapital

            HashMap< String, String > paisCapital = new HashMap < String, String > ();

            // Llenamos el mapa con su par clave:valor (Pais:Capital)

            paisCapital.put("Rusia", "Moscu");
            paisCapital.put("España", "Madrid");
            paisCapital.put("Argentina", "Buenos Aires");
            paisCapital.put("Brasil", "Brasilia");
            System.out.println(paisCapital);
        }

}
