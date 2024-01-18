import java.util.ArrayList;

public class stair2 {
  public static void main(String[] args) {
    int n=4;
    ArrayList<String> path= getStrai(n);
  
    System.out.println(path);
  }
    public static ArrayList<String> getStrai(int n){
     if(n<=0){           
      ArrayList<String> base = new ArrayList<>();
    if(n==0){
      
        base.add("");
    }
         return base;
   }
            ArrayList<String> f1= getStrai(n-1);
             ArrayList<String> f2= getStrai(n-2);
             ArrayList<String> f3= getStrai(n-3);
             ArrayList<String> myans= new ArrayList<>();
             for(String s : f1) myans.add(1+s);
                for(String s : f2) myans.add(2+s);
                for(String s : f3) myans.add(3+s);
                return myans;
 }    
}

    

