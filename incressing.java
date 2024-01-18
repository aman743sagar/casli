public class incressing {
    
    public static void main(String[] args) {
        int n=5;
        printinecressing(n);
    }
    public static void printinecressing(int n){
        if(n==0){
            return ;
        }
        printinecressing(n-1);
          System.out.println(n);
         // printinecressing(n-1);//faith

}
}
