public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setColor(Automovil.COLOR_AZUL);
        subaru.setTipo(TipoAutomovil.HATCHBACK);



        Automovil mazda = new Automovil("Mazda", "Mazda 6", Automovil.COLOR_ROJO, new Motor(3.0, TipoMotor.GASOLINA));
        mazda.setTipo(TipoAutomovil.PICKUP);


        Automovil nissan = new Automovil("Nissan", "Navara", Automovil.COLOR_VERDE, new Motor(3.0, TipoMotor.GASOLINA), new Tanque(50) );
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Automovil.COLOR_BLANCO, new Motor(3.0, TipoMotor.GASOLINA), new Tanque(60) );
        nissan2.setTipo(TipoAutomovil.PICKUP);

        //ejemplo que no deberia de generar este tipo de asignacion
        //nissan2.colorPatente = "azul";
        // La asignación debe hacerse atravez de la clase Automovil
        //Automovil.colorPatente = "azul";
        Automovil.setColorPatente("azul");



        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(nissan2.detalle());
        System.out.println("Color patente que se aplica a todos los objetos " + Automovil.getColorPatente());


        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipo Subaru: " + tipoSubaru.getNombre());
        System.out.println("tipo desc subaru: " +  tipoSubaru.getDescripcion())  ;


        System.out.println(Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println(Automovil.VELOCIDAD_MAX_CIUDAD);


    }

}
