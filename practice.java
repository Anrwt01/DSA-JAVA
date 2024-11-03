   



public class practice {
    public static void main(String[] args) {
        
    
        
/* /* 
    for (int i=1; i<=n; i++){
        System.out.println("hello world");
    } */

       
    
/* while(n<=i){ */

/* o{System.out.println(6566);
}while (<=n);
 */
       /*  int sum=0; */

        /* for(int i=0; i<=n;i++){
            sum+=i;
            
        }
        System.out.println(sum); */

       /*  for(int i=1; i<=n; i++){
            System.out.println(i*2);
        } */

        

    /*     // for printing 5*5 cube
    for ( int i=1; i<=n; i++){
         for (int j=1; j<=n; j++){
                System.out.print ( "*");
            }
            System.out.println();
    } */

   /*  for ( int i=n; i>=1; i--){
        for (int j=1; j<=i; j++){
               System.out.print ( "*");
           }
           System.out.println();*/

           //printing a rhombus

           /* for (int i=1; i<=n; i++){
            for (int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println( );
           }
 */
        // for printing plaindromic 

       /*  for (int i=1; i<=n; i++){
            for (int k=1; k<=2*n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<2*i; j++){
                System.out.print("*");

            }System.out.println( );

        

        } */


        // for printing pyramid

       /*  for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        } */




         
            /* int [] arr=new int[size];

     for (int i=0; i<size; i++){
        arr [i] = sc.nextInt();
     }

     int x = sc.nextInt();

     for (int i=0; i<size; i++){
        if ( arr [i]==x){
            System.out.println(" x number found in "+ i);
        }
     }

        
        
    }
 */
    /* static void display(int[] arr){

        

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


    }
    


    public static void main(String[] args) {

        
        int [] arr = new int[2];
        arr[0] = 1;
        arr[1] = 15;

        display(arr);
     
 */

 /* int n =123456;
       
 int op=1;
 int inv=0;

 while ( n!=0){
     int digit = n%10;

     inv =  op + (int)Math.pow( 10, digit-1);

     n = n/10;
     op++;

     System.out.println(inv);} */


        
      /*   for ( int i=1; i<=n; i++){
            for ( int m = 1; m<=(n-i); m++){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                if ( i==1 || i==n || j == 1 || j == n ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } System.out.println( );
        }
    
    
    
     */
    /* for (int i = 1; i<=n; i++){
        
        for ( int k = 1; k<i; k++){
            System.out.print(" ");       }
        for (int m = 1; m<=n-i+1; m++){
            System.out.print("*"+" ");
        } System.out.println();

        
    } */


   
            int n = 7; // Size of the pattern
    


            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                // Print stars
                for (int j = 0; j < i; j++) {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
          
        } }