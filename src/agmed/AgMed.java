package agmed;
import agmed.gui.*;
import java.util.*;

public class AgMed {
    
    public static Set<Secretário> userList = new LinkedHashSet<>();
    
    public static void preset(){
        
        Secretário augusto = new Secretário("Augusto", "augusto123");
        Secretário denis = new Secretário("Denis", "denis123");
        userList.add(denis);
        userList.add(augusto);

    }
    public static void main(String[] args){
        
        preset();
    
        LoginView tela = new LoginView();
        tela.setVisible(true); 
         
    }
    
}
