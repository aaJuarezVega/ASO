import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pregunta43 {


    public static void main(String[] args) {
        Integer[] primes = {2,7,5,3};
        MySort ms = new MySort();



        Arrays.sort(primes, ms);
        for (Integer p2: primes ) {
            System.out.println(p2 + " ");
        }

    }

    static class MySort  implements Comparator<Integer> {

        public int compare(Integer x, Integer y){
            return y.compareTo(x);
        }

    }



}
