public class bssearchspace {
    public static void main(String[] args) {
        
        System.out.println(reachcenter(200, 2));

    }

    
    static boolean check(int speed, int distance, int time ){

        int dis_tra = speed * time;

        return ( dis_tra >= distance);
         
    }


    static int reachcenter( int distance, int time){
        
        int low = 0;
        int high = 200;

        int ans = 0;

        while( low<=high){

            int mid = high + low / 2;
            
            if (check(mid,distance,time)){
                ans = mid;
                high = mid-1;

            }

            else {
                low = mid +1;

            }
        }
      
      
        return ans;

    }
}
