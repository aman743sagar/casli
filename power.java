public class power {
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans=printpower(x,n);
        System.out.println(ans);
        
    }
    public static int printpower(int x, int n){
        if(n==0){
            return 1;
        }
        int faith=printpower(x, n-1);
        return faith*x;

    }
    
}
