public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.extn";
        System.out.println("archivo = " + archivo);

        int i = archivo.lastIndexOf(".");

        System.out.println("archivo.length() = " + archivo.length());

        System.out.println("archivo = " + archivo.substring(0,i));
        System.out.println("archivo = " + archivo.substring(i+1,archivo.length()));



        
    }
}
