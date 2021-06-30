package agmed;
import agmed.gui.*;
import java.util.*;

public class AgMed {
    
    public static Set<Secretario> userList = new LinkedHashSet<>();
    
    public static void preset(){
        
        Secretario augusto = new Secretario("Augusto", "augusto123");
        Secretario denis = new Secretario("Denis", "denis123");
        userList.add(denis);
        userList.add(augusto);

    }
    public static void main(String[] args){
        
        preset();
    
        LoginView tela = new LoginView();
        tela.setVisible(true); 
         
    }
    
}
