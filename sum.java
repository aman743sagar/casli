public class sum {
    public static void main(String[] args) {
        int n=5;
        int ans=sum(n);
        System.out.println(ans);
    }
    public static int sum(int n){
        if(n==0) {
            return 0;
        }
        int faith = sum(n-1);
        return faith+n;
    }
    
}
