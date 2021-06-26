
package agmed;

public class Secretário {
    private String login, senha;
    
    public Secretário (){}
    
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
    
    public String getLogin(){
        return login;
    }
    
    public String getSenha(){
        return senha;
    }
    
    
    
}
