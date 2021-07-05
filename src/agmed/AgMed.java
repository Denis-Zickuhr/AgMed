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
        
         Set<Cliente> teste = new LinkedHashSet<>();
         
         Cliente c = new Cliente("a","a","a","a");
         Cliente c1 = new Cliente("a","a","a","a");
         teste.add(c);
         teste.add(c1);
         
         for(int i = 0; i < 10; i++){
             Cliente cli = new Cliente("a","a","a","a");
             teste.add(cli);
         }
         
         System.out.println(teste);
        
    }
}
