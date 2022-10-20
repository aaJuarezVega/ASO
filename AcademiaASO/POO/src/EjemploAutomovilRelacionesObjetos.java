public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {




        Persona conductorSubaru = new Persona("Lucy", "Juárez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setTanque(new Tanque());
        subaru.setColor(Automovil.COLOR_AZUL);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub);

        Rueda[] ruedasSub = new Rueda[5];
        for (int i = 0; i<ruedasSub.length; i++ ){
            subaru.addRueda(new Rueda("Yokohama", 16, 198));
        }




        Persona pato =  new Persona("Pato", "Martínez");
        Automovil mazda = new Automovil("Mazda", "Mazda 6", Automovil.COLOR_ROJO, new Motor(3.0, TipoMotor.GASOLINA));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setTanque(new Tanque());
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMaz);

        Rueda[] ruedasMaz = new Rueda[5];
        for (int i = 0; i<ruedasMaz.length; i++) {
            mazda.addRueda( new Rueda("Michelin", 18, 10.5));
        }


        Rueda[] ruedasNissan = new Rueda[5];
        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara", Automovil.COLOR_VERDE,
                new Motor(3.0, TipoMotor.GASOLINA), new Tanque(50), bea, ruedasNissan );
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setTanque(new Tanque());


        for (int i = 0; i<ruedasNissan.length; i++) {
            nissan.addRueda(new Rueda("Prielli", 20, 11.5));
        }



        Rueda[] ruedasNissanII = new Rueda[5];
        Persona lalo = new Persona("Lalo", "Vega");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Automovil.COLOR_BLANCO
                , new Motor(3.0, TipoMotor.GASOLINA), new Tanque(60), lalo,ruedasNissanII );
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.setConductor(lalo);
        Automovil.setColorPatente("azul");


        for (int i = 0; i<ruedasNissanII.length; i++) {
            nissan2.addRueda(new Rueda("Prielli", 20, 11.5));
        }


        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(nissan2.detalle());





    }

}
