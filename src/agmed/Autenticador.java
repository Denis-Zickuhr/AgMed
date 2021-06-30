package agmed;
import java.util.*;
import agmed.Secretario;
public class Autenticador {
    
    private String login, senha;
    private boolean chaveAcesso;
    
    public Autenticador(String login, String senha){
        this.login = login;
        this.senha = senha;
        this.chaveAcesso = false;
    }
    
    public String getLogin(){
        return login;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public boolean getChaveAcesso(){
        return chaveAcesso;
    }
    
   public boolean setSenha(String senha){
        if (senha.length() >= 3){
            this.senha = senha;
            return true;
        }else  
            return false;
    }
    
    
    public boolean setLogin(String login){
        if (login.length() >= 3){
            this.login = login;
            return true;
        }else  
            return false;
    }
    
    
    public void compare(Secretario a, Autenticador b){
        if (a.getLogin() == b.getLogin() && a.getSenha() == b.getSenha()){
            this.chaveAcesso = true;
        }
    }
    
    
}

