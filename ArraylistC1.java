
import java.util.ArrayList;
import java.util.*;
public class ArraylistC1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
         ArrayList<Integer> list2 = new ArrayList<>();

        list.add(5);
        list.add(25);
        list.add(15);
        list.add(20);
        list.add(10); 
         
       
          Collections.sort(list); // for sort
        Iterator  itr = list.iterator(); 
          
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        } 
      // use of arraylist methods  
       
     
       
      
       

    }
}
