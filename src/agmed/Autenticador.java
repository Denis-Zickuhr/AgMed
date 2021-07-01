package agmed;
import java.util.*;
import agmed.Secretario;
public class Autenticador {
    
    private String login, senha;
    private boolean chaveAcesso;
    
    public Autenticador(){
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
        if ((a.getLogin() == null ? b.getLogin() == null : a.getLogin().equals(b.getLogin())) && (a.getSenha() == null ? b.getSenha() == null : a.getSenha().equals(b.getSenha()))){
            this.chaveAcesso = true;
        }
    }
    
    
}

