
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class arrayss {
     // 2D aaray
    public static void main(String[] args) {
        
       

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        

        int[][] arr = new int[m][n];


      compose(arr, m, n);
    display(arr, m, n); 
      // System.out.println(summat(arr, m, n));
        //    rowwise(arr, m, n);
         //colWiseSort(arr);
         //print2DArray(arr); 
       // transp(arr);
       // printtranspose(transp(arr));
        flatten(arr);
    System.out.println();
    
    }

 static void compose(int[][] arr, int m, int n){

     int naturalNum=1;


    for (int i=0; i<m; i++){
        for ( int j=0; j<n; j++){
            arr[i][j] = naturalNum++;
        }
    }


}


static void display(int[][] arr, int m, int n ){

    for (int i=0; i<arr.length; i++){
        for ( int j=0; j<arr[0].length; j++){
            System.out.print(arr[i][j]+" ");
} System.out.println(); } 

}

        static int summat(int[][] arr, int m, int n){
            int sum = 0;


            for ( int i=0; i<m; i++){
                for ( int j =0; j<n; j++){
                    sum+=arr[i][j];
                }
            }
                        return sum;

            
        }

        static void rowwise(int[][] arr, int m, int n){

            for ( int i=0; i<arr.length; i++){
                Arrays.sort(arr[i]);   }


        }

        static void colWiseSort(int[][] arr) {

            Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
    
        }


        static void print2DArray(int[][] arr) {

            for(int i = 0 ; i < arr.length ; i++) {
                for(int j = 0 ; j < arr[0].length ; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
    
        }
    

        static int[][] transp(int[][] arr){

            int[][] trans = new int[arr[0].length][arr.length];
                       
            for ( int i=0; i<arr.length; i++){
                for (int j=0; j<arr[0].length; j++){
                        trans[j][i] = arr[i][j];
                }
            }  
            return trans;
        }


        static void printtranspose(int[][] arr) {

            for(int i = 0 ; i < arr.length ; i++) {
                for(int j = 0 ; j < arr[0].length ; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
    
        }




        static void flatten( int[][] arr){
            int row = arr.length;
            int col = arr[0].length;

            int[] oned = new int[col*row];

            for ( int i =0; i<arr.length;  i++){
                for ( int j =0; j<arr[0].length; j++){
                    oned [col * i+j] = arr[i][j];
                }
            }

            for ( int i =0; i<oned.length; i++){
                System.out.print(oned[i]+" ");
            }
        }



        
    }
    
        




    
    

