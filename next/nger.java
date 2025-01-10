package next;

public class nger {

    // greatest and smallest
    
    /*  static int[] NGR(int[] arr){

        int maxEl = 0;
        int[] ngr = new int[arr.length];

        //Fill
        for(int i = 0; i<arr.length ; i--) {
            ngr[i] = maxEl;

            maxEl = Math.max(maxEl, arr[i]);
        }
        return ngr;

    }
 */
public static void main(String[] args) {


    int[]arr = {3,10,4,2,1,6,1,7,2,9,};
    NER(arr);
    

    int [] rec = NER(arr);

    printArray(rec);;
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






