public class RECURSION2 {

    public static void main(String[] args) {
        String s = "car";
       // printsubseq(s, " ");
       //coinToss(3, " ");
      // generateperen(3, 0, 0, " ");
     permutation("abc", " ");   
    }

    static void printsubseq( String que, String ans){

        if ( que.length()==0){
            System.out.println(ans);
            return;
        }


        char a = que.charAt(0);
        // for including
        printsubseq(que.substring(1), ans+a);
        // for excluding
        printsubseq(que.substring(1), ans);
    }


    static void coinToss( int n, String ans){
        if ( n==0){
             System.out.println(ans);
             return;
        }

        coinToss(n-1, ans+"H ");
        coinToss(n-1, ans+"T ");
    }

    static void generateperen( int n, int l, int r, String ans){
        if( n==l && l==r){
            System.out.println(ans);
            return;
        }
        if ( l>n || r>l) 
        return;

        generateperen(n, l+1, r, ans+"{ ");
        generateperen(n, l, r+1, ans+"} ");
    }

    static void permutation(String que, String ans){
        if ( que.length()==0){
            System.out.println(ans);
            return;
        }

        for ( int i=0; i<que.length(); i++){
            char a = que.charAt(0);
            String s1 = que.substring(0, i);
            String s2 = que.substring(i+1);
            permutation(s1+s2, ans+a);
        }
    }
    
}
