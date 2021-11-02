import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8 {
    public static void filter(List<Integer> myList)
    {
        myList.stream().filter(n->n%2==0).map(n->n+" ").forEach(System.out::print);
    }
    public static void reduce(List<Integer> myList)
    {
        System.out.println(myList.stream().reduce(0,Integer::sum));
    }
    public static void map(List<Integer> myList)
    {
        myList.stream().map(n->n%2==0).forEach(System.out::println);
    }
    public static void parllelstream(List<Integer> myList)
    {
        myList.parallelStream().filter(n->n%2==0).map(n->n+" ").forEach(System.out::print);
    }
    public static void main(String args[]){
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<10; i++)
            myList.add(i);

        filter(myList);
        System.out.println();
        reduce(myList);
        map(myList);
        parllelstream(myList);

    }
}
