import java.util.*;

public class ngreaterelelement {
    
    public static void display(int[] num){
        for ( int i=0; i<num.length; i++){
            System.out.println(num[i]+ " ");
        }
        System.out.println();
    }

    public static void main(int[] num) {
      Stack <Integer> stk = new Stack<>();
          int[] ans = new int[num.length];

          for ( int i=0; i<num.length; i++){
            while (!stk.empty() && num[i] > stk.peek() ) {
                num[stk.pop()] = num[i];
                
            }
            stk.push(i);
        
            while (!stk.empty()) 
                ans[stk.pop()] = -1;


              display(ans);;
                         
                 }
                 
             }
             
            }

