import java.util.ArrayList;

public class getmaze {
    public static void main(String[] args){
    int n=4;
    int m=4;
    int sc=0;
    int sr=0;
    ArrayList<String> path =getmaze(sr,sc,n,m);///funcation call
    System.out.println(path); 
    
}
public static ArrayList<String> getmaze(int sr, int sc, int dr, int dc){
      if(sr==dr-1 || sc==dc-1){// sr>dr || sc>dc        invaldi condition
        ArrayList<String> base= new ArrayList<>();
        base.add("");
        return base;
     }
     if(sr==dr&& sc==dc){
        return new ArrayList<>(null);
      }
          ArrayList<String> f1= getmaze(sr, sc+1, dr, dc);// horizontal par call
          ArrayList<String> f2= getmaze(sr+1, sc, dr, dc);// vertical par call
          ArrayList<String> myans= new ArrayList<>();
             for(String s:f1) myans.add("h"+s); //add h  and for each loop
                for(String s:f2) myans.add("v"+s); //add v
                return myans;


                
    }
}   

    

