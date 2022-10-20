public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 3.500f;

        if (promedio >= 6.5){
            System.out.println("Excelente promedio");

        } else if (promedio >= 6.0 ){
            System.out.println("Muy buen promedio!");
        } else if (promedio >=5.5) {
            System.out.println("buen promedio!");
        } else if (promedio >= 5) {
            System.out.println("Regular, necesitas esforzarte mas!");
        } else if(promedio >=4){
            System.out.println("insuficiente, necesitas estudiar mas!");
        }else{
            System.out.println("Reprobado");
        }

        System.out.println("promedio = " + promedio);

    }
}
