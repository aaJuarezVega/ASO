public class EjemploStringMetodoArreglo {
    public static void main(String[] args) {
        String  palabra = "Trabalenguas";

        System.out.println("palabra.toCharArray() = " + palabra.toCharArray());

        char[] arreglo = palabra.toCharArray();
        int elementos = arreglo.length;
        System.out.println("elementos = " + elementos);
        for(int  i = 0; i < elementos; i++){
            System.out.println("arreglo = " + arreglo[i]);

        }

        /*System.out.println("palabra = " + palabra.split("a"));
         Split genera un arreglo por lo que se tiene que visualizar con un for
        */
        String[] arreglo2 = palabra.split("a");
        int largo = arreglo2.length;

        for(int j=0; j<largo; j++){
            System.out.println(arreglo2[j]);
        }



        /************************************************************
        para usar un carácter especial se tiene que usar // o []
          archivo.split("\\.")
          archivo.split("[.]")
         **************************************************************/
        String archivo = "alguna.imagen.jpge";
        String[] archivoArr = archivo.split("\\.");
        largo = archivoArr.length;

        for(int j = 0; j<largo; j++){
            System.out.println(archivoArr[j]);
        }


    }
}
