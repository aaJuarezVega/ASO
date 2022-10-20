public class EjemploAutomovil{
    public static void main(String[] args) {

        Automovil renault = new Automovil();
        Motor motorRenault = new Motor(1.6, TipoMotor.GASOLINA);
        renault.setMotor(motorRenault);
        Tanque tanqueRenault = new Tanque(60);
        renault.setTanque(tanqueRenault);

        renault.setFabricante("Renault");
        renault.setModelo("Sandero");
        renault.setColor("Naranja");

        System.out.println("renault.getFabricante() = " + renault.getFabricante());

        Motor motorSubaru = new Motor(2.0, TipoMotor.GASOLINA);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setTanque(new Tanque(50));
        subaru.setColor("Azul");

        Automovil mazda = new Automovil("Mazda", "Mazda 6", "Rojo", new Motor(3.5,TipoMotor.DISEL));
        mazda.setTanque(new Tanque(45));
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris", new Motor(4.0, TipoMotor.GASOLINA), new Tanque(50) );
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris", new Motor(3.5, TipoMotor.DISEL), new Tanque(50) );

        System.out.println(renault.detalle());
        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());

        System.out.println(nissan);
        System.out.println(nissan2);



        System.out.println( renault.acelerar(3000));
        System.out.println( renault.frenar());

        System.out.println(renault.acelerarFrenar(4000));

        System.out.println("kilometros por litro :" +renault.calcularConsumo(300, 0.6f));
        System.out.println("kilometros por litro :" +renault.calcularConsumo(300, 50));




    }



}
