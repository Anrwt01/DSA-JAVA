public class lecture7 {
    
// bubble soting * taking largest shift it to the right hand side
//public static void bubblesout( int [] arr){

     /*   for ( int turn=1; turn < arr.length; turn++){
            for ( int i =0; i<arr.length-turn; i++){
                if ( arr[i]> arr[i+1]){
                    int temp = arr[i];
                    arr[i]= arr[i+1];
                   arr [i+1]= temp;
            }
            }

    }

    }
    static void display(int[] arr){
        for(int i:arr) System.out.print(i+" ");
        System.out.println();
    }

        public static void main(String[] args) {
        

            int[] arr = {7,8,4,5,2,9,};
           
            bubblesout(arr);
            display(arr);
        } */

/* 
    public static void main(String[] args) {
        int[] arr = {1,8,7,9,5,4,};

        for ( int i= 0; i<arr.length-1; i++){
            int small=i;
            for (int j=i+1; j<arr.length; j++){
                if ( arr[small]>arr[j]){
                    small = j;
                }   int temp = arr [small];
                arr[small]= arr[i];
                arr[i] = temp; 
            }

            
          
        }

        display(arr);

    } */
                
    

        /* static void display(int[] arr){
            for ( int j : arr) System.out.print(j+" ");

    }



        public static void main(String[] args) {
            int[] arr = {1,8,7,9,5,4,};

            for ( int i=1; i<arr.length; i++){
                int key = arr[i];
                int j = i-1;
                while ( j>0 && key < arr [j]){
                arr [j+1]= arr[j];
                --j;
                }
                arr [j+1] = key;
            }


            display(arr);
        }
}

    

}
*/}