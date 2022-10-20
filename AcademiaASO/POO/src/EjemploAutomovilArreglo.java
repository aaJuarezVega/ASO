import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {


        Persona conductorSubaru = new Persona("Lucy", "Juárez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setTanque(new Tanque());
        subaru.setColor(Automovil.COLOR_AZUL);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        Persona pato = new Persona("Pato", "Martínez");
        Automovil mazda = new Automovil("Mazda", "Mazda 6", Automovil.COLOR_ROJO,
                new Motor(3.0, TipoMotor.GASOLINA));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setTanque(new Tanque());
        mazda.setConductor(pato);


        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara", Automovil.COLOR_VERDE,
                new Motor(3.0, TipoMotor.GASOLINA), new Tanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setTanque(new Tanque());
        nissan.setConductor(bea);

        Persona lalo = new Persona("Lalo", "Vega");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Automovil.COLOR_BLANCO
                , new Motor(1.6, TipoMotor.GASOLINA), new Tanque(50));

        suzuki.setColor(Color.AMARILLO.getColor());
        suzuki.setTipo(TipoAutomovil.SUV);
        suzuki.setConductor(lalo);
        Automovil.setColorPatente("azul");

        Automovil[] autos = new Automovil[4];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;

        Arrays.sort(autos);
        for (int i = 0; i < autos.length; i++){
            System.out.println(autos[i]);
        }






    }

}
