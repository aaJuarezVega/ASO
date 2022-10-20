public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setColor(Automovil.COLOR_AZUL);
        subaru.setTipo(TipoAutomovil.HATCHBACK);



        Automovil mazda = new Automovil("Mazda", "Mazda 6", Automovil.COLOR_ROJO, new Motor(4.0, TipoMotor.GASOLINA));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipo Subaru: " + tipoSubaru.getNombre());
        System.out.println("tipo desc subaru: " +  tipoSubaru.getDescripcion())  ;

        switch (tipoSubaru) {
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automovil pequelo de dos puertas y tipicamente deportivo");
            case FURGON -> System.out.println("automovil utilitario de transporte, de empresas");
            case HATCHBACK -> System.out.println("automivil mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("automovil de doble cabina o camiotea");
            case SEDAN -> System.out.println("Es un automovil medianop");
            case STATION_WAGON -> System.out.println("automovil mas grande, con maleta grande...");
        }

        TipoAutomovil[] tipos =  TipoAutomovil.values();
        for (TipoAutomovil ta: tipos){
            System.out.println(ta + " => " + ta.name() + ", " +
            ta.getNombre() + ", " +
            ta.getDescripcion() + ", " +
            ta.getNumeroPueta()) ;
            System.out.println();
        }

    }

}
