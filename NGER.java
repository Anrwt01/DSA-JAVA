public class NGER {

    
    public static void main(String[] args) {


        int [] arr = {4,5,7,9,6,2,4};
        NER(arr);

        int [] rec = NER(arr);

        printArray(rec);
       
    }

        static int[] NER(int[] arr){
            int me = 0;
            int [] temp = new int[arr.length];

            for ( int i= arr.length-1; i > 0; i-- ){

                temp [i] = me;

                me = Math.max(me, arr[i]);

        
            }
            return temp;



        }
        
        static void printArray(int[] arr) {

            for(int i = 0 ; i < arr.length ; i++) {
                System.out.print(arr[i] + " ");
            }
        
            System.out.println();
        }
        
    
}


