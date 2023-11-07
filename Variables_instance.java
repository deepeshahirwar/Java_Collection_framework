  
   class Student{
    String name; 
    String enroll; 
    int age; 
     
    void getName( String name){
        System.out.println("Student name is : "+ name);
    } 
     
      void getEnroll(String enroll){
        System.out.println("Student  enrollment is : "+ enroll);
    } 
     
    void getAge(int age){
    System.out.println("Student age is: "+ age);
   }
    
  }

 public class Variables_instance {
    public static void main(String[] args) { 
         
        //int var1; 
        //System.out.println(var1);// it will give error var1 not initiliazed 
         
        Student s1 = new Student();  
        System.out.println(s1);// output is - Student@5acf9800 

        s1.getName("Deepesh"); 
        s1.getEnroll("0111Al211056"); 
        s1.getAge(21);
        
    }
}
