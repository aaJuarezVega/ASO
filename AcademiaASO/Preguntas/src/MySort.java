import java.util.Comparator;

class MySort  implements Comparator<Integer> {

        public int compare(Integer x, Integer y){
            return y.compareTo(x);
        }

}

