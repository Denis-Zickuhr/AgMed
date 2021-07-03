package agmed;
import java.util.*;

public class AgMed {
    
    public static Set<Secretario> userList = new LinkedHashSet<>();
    public static void preset(){

           Secretario augusto = new Secretario("Augusto", "augusto123");
           Secretario denis = new Secretario("Denis", "denis123");
           Secretario a = new Secretario("1", "1");
           userList.add(a);
           userList.add(denis);
           userList.add(augusto);

        }  
    public static void main(String[] args){  
        
    }
}
