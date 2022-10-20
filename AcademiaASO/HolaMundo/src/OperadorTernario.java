import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7==5?"Verdadero":"Falso";
        System.out.println("variable = " + variable);

        String estado = "";
        String[] materias = {"matematicas","ciencias","historia"};
        double[] cal ={0,0,0};

        double promedio = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < materias.length; i++){

            System.out.println("Materia "+ materias[i]);

            System.out.println("Calificación :" );
            cal[i] = s.nextDouble();


        }

        for (int j=0; j< cal.length; j++ ){
            promedio += cal[j];
        }

        promedio /= cal.length;;


        estado = promedio>=5.49?"Aprobado":"Rechazado";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);


    }
}
