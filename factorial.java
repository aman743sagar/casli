public class factorial {
    public static void main(String[] args) {
        int n=5;
       int ans= printfactorial(n);
       System.out.println(ans);

        
    }
    public static int  printfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
      int faith=  printfactorial(n-1);
        int s=faith*n;
        return s; 
    }

   
    
}
