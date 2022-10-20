public class PrincipalFactura {

    public static void main(String[] args) {
        Factura f0 = new Factura(1);
        Factura f1 = new Factura(2);
        Factura f2 = new Factura(3);

        Persona p = new Persona("Lucy", "Suarez", "Ramos");



        //Agregar factura con método de la clase persona
        p.addFactura(f0);
        p.addFactura(f1);
        p.addFactura(f2);

        //Agregar factura con método varArgs

        p.addFactura(f0,f1, f2);

        p.mostrarFacturas();



    }
}
