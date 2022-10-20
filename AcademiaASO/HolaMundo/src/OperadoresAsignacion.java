public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;

        System.out.println("j = " + j);
        System.out.println("i = " + i);


        i += 2;
        System.out.println("i = " + i);

        i += 5;
        System.out.println("i = " + i);

        j -= 4;
        System.out.println("j = " + j);

        j *=3;
        System.out.println("j = " + j);

        String sqlString =  "Select * from tabla";
        sqlString += "where c.nombre = 'Alex'";

        System.out.println("sqlString = " + sqlString);



    }
}
