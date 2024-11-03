public class binarysearch {
    public static void main(String[] args) {
        
    }
    


     public static  int binarysrch(int[] arr, int nums){

        int low = arr[0];

        int high = arr.length-1;

        while(low<=high){

            int mid = high+low/2;

            if( arr[mid]==nums){
                return mid;
            }

            else if( arr[mid]>nums){
                low = mid +1;

              }  else {
                high = mid -1;
                }
                   
            
        }
        return -1;


        }

}

