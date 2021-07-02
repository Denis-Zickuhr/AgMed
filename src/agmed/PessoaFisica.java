
package agmed;


public abstract class PessoaFisica {

    protected String nome;
    private String cpf;
    private String endereco;
    private String contato;

    public PessoaFisica(String nome, String cpf, String endereco, String contato) {

        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;

    }
    @Override
    public String toString() {
        return "PessoaFisica{"
                + "nome='" + nome + '\''
                + ", cpf='" + cpf + '\''
                + ", endereço='" + endereco
                + "', contato='" + contato
                + "'}";
    }

    public boolean setNome(String nome) {
        if (!nome.isEmpty()){
            this.nome = nome;
            return true;
        }else
            return false;
    }

    public boolean setCPF(String cpf){
        if (cpf.length() == 11){
            this.cpf = cpf;
            return true;
        }else
            return false;
        
    }

    public boolean setEndereco(String endereco) {
        if (!endereco.isEmpty()){
            this.endereco = endereco;
            return true;
        }else
            return false;
    }
    public boolean setContato(String contato) {
        if (!contato.isEmpty()){
            this.contato = contato;
            return true;
        }else
            return false;
    }
    public String getNome() {
        return this.nome;
    }
    public String getCPF() {
        return this.cpf;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public String getContato() {
        return this.contato;
    }
    
}

