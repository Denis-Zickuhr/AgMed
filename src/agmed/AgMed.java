package agmed;
import agmed.gui.*;
import java.util.*;
import agmed.Secretario;
import agmed.Autenticador;


public class AgMed {
    
    public static Set<Secretario> userList = new LinkedHashSet<>();
    
    
    
    public static void preset(){
        
        Secretario augusto = new Secretario("Augusto", "augusto123");
        Secretario denis = new Secretario("Denis", "denis123");
        Secretario a = new Secretario("123", "123");
        userList.add(a);
        userList.add(denis);
        userList.add(augusto);

    }
    public static void main(String[] args){
        
        preset();
    
        LoginView tela = new LoginView();
        tela.setVisible(true); 
         
    }
    
}
