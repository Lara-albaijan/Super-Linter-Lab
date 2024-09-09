import java.util.*;

public class SampleClass {
   public static final int MAGIC_NUMBER = 42; // Should be defined with better context or avoided

   public void doStuff(){
       int x = 10; // Unused variable
       for(int i=0;i<MAGIC_NUMBER;i++){
           System.out.println("Iteration: " + i); 
       }

       String s = "hello"; String s2 = "world";  // Multiple statements on one line
       System.out.println(s + s2);

       if(true) {
           System.out.println("This will always print");
       }
   }

    private int getnumber() {
        return 123;
    }

    public void performCalculation(int aint b){
        int result =a+b; 
        if(a>b){
            System.out.println("A is greater than B");
        }else{
            System.out.println("B is greater than or equal to A");
        }
    }
}
