public class EjemploStringtestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;
String d = "";
        StringBuilder sb = new StringBuilder(c);

        long inicio = System.currentTimeMillis();

        for (int i = 1; i<=500; i++){
            //c = c.concat(a).concat(b).concat("\n");   // tiempo 2ms
            //d +=  c+ a + b  + "\n";                        // tiempo 16 ms
            sb.append(a).append(b).append("\n");        // 0 ms
            //System.out.println(i + "c = " + c);

        }
        long fin = System.currentTimeMillis();


        System.out.println("d = " + d);
        System.out.println("sb = " + sb.toString());
        System.out.println(fin- inicio);





    }

}
