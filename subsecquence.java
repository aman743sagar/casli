import java.util.ArrayList;

public class subsecquence {
    public static void main(String[] args) {
        String str="abcdef";
         ArrayList<String> collect= new ArrayList<>();
        gs(str,"",collect);
        collect.remove(0);
        System.out.println(collect);

        
    }
    public static void gs(String str,String ans,ArrayList<String>collect){
        if(str.length()==0){
        
        collect.add(ans);
        return;


    }
    char ch=str.charAt(0);
    String ros=str.substring(1);
    gs(ros, ans, collect);//excluate
    gs(ros, ans+ch, collect);// include
    
    }
    
}
