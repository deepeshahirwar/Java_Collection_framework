
import java.util.*;

public class LinkedListC3 {
    public static void main(String[] args) {
         LinkedList<Integer> list = new LinkedList<Integer>(); 
         
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
          list.add(5);
          list.add(6);
          list.add(7);
          list.add(8); 
           
           
          list.set(0,10); 
          list.remove(3);
           list.removeFirst();
           list.removeLast();  
          
    // for iterating list
             Iterator<Integer> itr = list.iterator(); 
          
         while (itr.hasNext()) {
            System.out.println(itr.next());
         }
          
// 
    LinkedList<Integer> list2 = new LinkedList<Integer>();  

    list2.addAll(list);  
    list2.toArray(); 
     
  System.out.println(list2.size()); 
    

   System.out.println(list);
   System.out.println(list.getFirst());       
           
    
   System.out.println(list2.peekFirst());
   System.out.println(list2.peekLast());
      
   System.out.println(list2.get(3));
     

 
    System.out.println( list.clone());
  
       

    }
}
