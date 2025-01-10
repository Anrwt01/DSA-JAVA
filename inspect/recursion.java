import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        

        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        Factorial(n);
    }

    static int Factorial(int n){

        if ( n==0||n==1)
            return 1;
            
        
                return n*Factorial(n-1);
    }
    static int power( int n, int x ){

        if (x==0){
            return 1;
            
        }

        return n * power(n, x-1);

    }

    static int Factorialtail(int n,int k){

        if ( n==0||n==1)
            return k;
            
        
                return Factorialtail(n-1, n*k);
    }


    
}
