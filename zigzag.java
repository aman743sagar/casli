public class zigzag {
    public static void main(String[] args) {
        int n=3 ;
        rec(n);
        
    }
    public static void rec(int n){
        if(n==0) return;
        System.out.print(n+" ");
        rec(n-1);
        System.out.print(n+" ");
        rec(n-1);
        System.out.print(n+" ");
        
    }
    
}
