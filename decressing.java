public class decressing {
    public static void main(String[] args) {
        int n=5;
        printdecressing(n);
    }
    public static void printdecressing(int n){
        if(n==0){
            return ;
        }
          System.out.println(n);
          printdecressing(n-1);//faith

    }
}
