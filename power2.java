public class power2 {
    public static void main(String[] args) {
        long x=2;
        long n=11;
        long ans=getpower(x,n);
        System.out.println(ans);

    }
    public static long getpower(long x, long n){
        if(n==0){
             return 1;
        }
    
    long faith=getpower(x,n/2);
    long ans= faith*faith;
    if(n%2!=0){
        ans=ans*x;
    }
    return ans;
}
    
}
