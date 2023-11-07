
import java.util.LinkedList;

public class LinkedListC2 {
    public static void main(String[] args) {
         LinkedList<Character> list = new LinkedList<Character>(); 
         
          list.add('a'); 
           list.add('b');
           list.add('c');  
           
           list.addFirst('d');
           list.add(2, 'e'); 
            
           System.out.println(list);

           
          
           list.remove(3);
           list.removeFirst();
           list.removeLast();  
           list.removeLast(); 
           System.out.println(list);
          
        //  Iterator<Character> itr = list.iterator(); 
          
        //  while (itr.hasNext()) {
        //     System.out.println(itr.next());
        //  }
      System.out.println(list.size());
    }
}
