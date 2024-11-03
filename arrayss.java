import java.util.Scanner;
public class arrayss {
     // 2D aaray
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

      int row = sc.nextInt();
      int column = sc.nextInt();
        
        int[][] arr = new int[row][column];

        int naturalNum = 1;

        for (int i = 0; i<row;i++ ){
            for ( int j =0; j<column; j++){
                arr[i][j] = naturalNum++;
            }
        }

        display(arr, row, column);

    }

    static void display(int[][] arr, int m, int n) {

        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
