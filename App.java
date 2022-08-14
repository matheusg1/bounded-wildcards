import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        printList(myObjs);

        System.out.println("-----");

        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    public static void copy(List<? extends Number> origem, List<? super Number> destino){        

        for (int i = 0; i < origem.size(); i++) {
            Number n = origem.get(i);
            destino.add(n);
        }
    }

    public static void printList(List<?> lista){
        
        for (Object object : lista) {
            System.out.println(object);
        }
    }
}