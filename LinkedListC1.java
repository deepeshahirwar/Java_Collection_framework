import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListC1 {
    public static void main(String[] args) {
         LinkedList<Object> list = new LinkedList<Object>(); 
         list.add(10);
         list.add('a');
         list.add(110.23);
         list.add(100.0f);
          
         Iterator<Object> itr = list.iterator(); 
          
         while (itr.hasNext()) {
            System.out.println(itr.next());
         }

    }
}
