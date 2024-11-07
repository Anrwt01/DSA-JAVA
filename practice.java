import java.util.Scanner;

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


   
            /* int n = 7; // Size of the pattern
    


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
            } */

          /*   int z = 1; int n = 4;

            for ( int i = 1; i<=n;i++){
                for ( int j=n-1; j>=1;j--){
                    System.out.print(" ");
                } for ( int k = 1; k<=z; k++){
                    System.out.print("*"+" ");;
                } z +=2;
                System.out.print("\n");
            }
           */
           /*  int n = 5;

            for ( int i=1; i<n;i++){
                for ( int j=1; j<=n-i+1; j++){
                        System.out.print("*");
                }   for ( int k=1; k<=2*i-2; k++){
                    System.out.print(" ");         
                } for(int j=1; j<=10-i+1; j++)  
                {  
                System.out.print("*");  
                }   
                System.out.println();  
                }   */

                
		     /*  int n = 7;

              for ( int i=0; i<n; i++){
                for ( int j=0; j<n; j++){
                    if ( j==3 && i>=0 || i==3 && j>=0 || j==0 && i<=2 ||
                     i==0 && j>=4 || i==6 && j<=3 || j==6 && i>=4){
                        System.out.print("*");
                }
            else {
                System.out.print(" ");
            }   
                
             } 
             
             System.out.println();
             
              }    */

              

      /*   Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the input value for N

        // Upper part of the pattern
        for (int i = n; i > 0; i--) {
            // Print left side
            for (int j = n; j > 0; j--) {
                if (j >= i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            // Print spaces in the middle
            for (int j = 0; j <= n; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println(); // Move to the next line
        }

        // Middle part of the pattern
        for (int j = n; j >= 0; j--) {
            System.out.print(j + " ");
        }
        for (int j = 1; j <= n; j++) {
            System.out.print(j + " ");
        }
        System.out.println(); // Move to the next line

        // Lower part of the pattern
        for (int i = 1; i <= n; i++) {
            // Print left side
            for (int j = n; j >= 0; j--) {
                if (j >= i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            // Print right side
            for (int j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println(); // Move to the next line
        } */

        
    
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        

        int[][] arr = new int[m][n];


        compose(arr, m, n);
        display(arr, m, n);
    }


        static void compose(int[][] arr, int m, int n){

            int naturalNum = 1;


            for (int i=0; i<=m; i++){
                for ( int j=0; j<=n; j++){
                    arr[i][j] = naturalNum++;
                }
            }


        }


        static void display(int[][] arr, int m, int n ){

            for (int i=0; i<arr.length; i++){
                for ( int j=0; j<arr[0].length; j++){
                    System.out.println(arr[i][j]+" ");
        } System.out.println(); } 

    }



        

}