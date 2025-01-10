public class lowerbound {

    public static void main(String[] args) {
        
        int[] arr = {1,1,2,2,2,2,3,4,4};

    
    }
    
    /* public static  int lower(int[] arr, int nums){

        int low = arr[0];
        int ans = -1;

        int high = arr.length-1;

        while(low<=high){
            int mid = (high + low)/2;

            if (arr[mid]==nums){
                ans = mid;
                high = mid -1 ;
            }
            else if(arr[mid]>nums){
                low = mid +1;
            } else {
                high = mid -1;
            }
            

        }
        return ans;
    } */


    public static  int upper(int[] arr, int nums){

        int low = arr[0];
        int ans = -1;

        int high = arr.length-1;

        while(low<=high){
            int mid = (high + low)/2;

            if (arr[mid]==nums){
                ans = mid+1;
                low = mid + 1 ;
            }
            else if(arr[mid]>nums){
                low = mid +1;
            } else {
                high = mid -1;
            }
            

        }
        return ans;
    }


    public static void countocc(int[]arr, int nums){

        int low = arr[0];
        int high = arr.length-1;

        int ans = -1;

        while(low<=high){
            int mid = (high + low)/2;
    
                if (arr[mid]==nums){
                    ans = mid;

                    
        
        }
    }
        
    }
}
