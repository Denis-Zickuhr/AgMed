
package agmed;

public final class Secretário {
    private String login, senha;
    
    public Secretário (String login, String senha){
        this.setLogin(login);
        this.setSenha(senha);
        
        this.login = this.getLogin();
        this.senha = this.getSenha();
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
    
    public String getLogin(){
        return login;
    }
    
    public String getSenha(){
        return senha;
    }
    
    
    
}
