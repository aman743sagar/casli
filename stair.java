import java.util.ArrayList;

public class stair {
    public static void getstairpath(int n, String ans, ArrayList<String> collect){
    if(n<0){
        return;
    }
    if(n==0){
        collect.add(ans);
        return;
    }
    getstairpath(n-1, ans+1, collect);
    getstairpath(n-2, ans+2, collect);// recursion call and wait 
    getstairpath(n-3, ans+3, collect);

}
public static void main(String[] args) {
    
    ArrayList<String> collect= new ArrayList<>();
    int n=4;
    getstairpath(n, "", collect);   
    System.out.println(collect);
}
}
        

    

