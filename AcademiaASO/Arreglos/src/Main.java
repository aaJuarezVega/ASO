public class Main {
    public static void main(String[] args) {

        Persona alex = new Persona("Alex", "Juarez", "Vega");
        Profesor pMiguel = new Profesor( "Miguel", "Esparza", "Sanchez", "Español", "1A");

        pMiguel.mostrarDatos();
        //System.out.println("miguel = " + miguel.mostrarDatos());
    }
}