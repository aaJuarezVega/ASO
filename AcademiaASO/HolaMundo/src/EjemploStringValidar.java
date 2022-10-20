public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo ) {
            curso = " "; // "Programacion en Java";
        }

        boolean esVacio2 = curso.isEmpty();
        boolean esVacio = curso.length()==0;
        boolean esBlanco = curso.isBlank();


        System.out.println("esVacio = " + esVacio);
        System.out.println("esVacio2 = " + esVacio2);
        System.out.println("esBlanco = " + esBlanco + "\n");

        if (!esBlanco ){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " .concat(curso));
        }

    }
}
