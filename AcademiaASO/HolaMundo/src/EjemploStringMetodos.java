public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre  = "Alex";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Alex\") = " + nombre.equals("Alex"));
        System.out.println("nombre.equalsIgnoreCase(\"alex\") = " + nombre.equalsIgnoreCase("alex"));
        System.out.println("nombre.compareTo(\"Alex\") = " + nombre.compareTo("aron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(4) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(0,4) = " + nombre.substring(0, 4));
        System.out.println("nombre.substring(0,4) = " + nombre.substring(1, 3));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String palabra = "       Trabalenguas  ";
        System.out.println("palabra.replace(\"a\", \".\") = " + palabra.replace("a", "."));
        System.out.println("palabra = " + palabra);
        System.out.println("palabra.indexOf(\"e\") = " + palabra.indexOf("e"));
        System.out.println("palabra.lastIndexOf(\"a\") = " + palabra.lastIndexOf("a"));

        System.out.println("palabra.trim() = " + palabra.trim());
    }
}


