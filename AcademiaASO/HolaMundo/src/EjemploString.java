public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación java");

        boolean esIgual = curso == curso2;

        esIgual = curso.equals(curso2);

        esIgual = curso.equalsIgnoreCase((curso2));
        System.out.println("esIgual = " + esIgual);



    }

}
