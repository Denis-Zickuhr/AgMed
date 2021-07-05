
package agmed;
import java.util.*;
import agmed.Agenda;

public class Consulta implements Comparable<Consulta>{
    
    private String consulta, paciente, saida, entrada;
    private final String cpf;
    private long id;
    
    
    public Consulta(Cliente paciente){
        this.paciente = paciente.getNome();
        this.cpf = paciente.getCPF();
    } 
    
    public String setData(int dia, int mes, int ano){
        
        if (ano > 2020 && ano < 2100){
            if(mes == 2){
                
                if(dia > 0 && dia <= 28){
                    return dia + "/" + mes + "/" + ano;
                    
                }else{
                    return "Data inválida";
                }
                              
            }else{
                if (mes==1 | mes==3 | mes==5 | mes==7 | mes==8 | mes==10 | mes==12){
                    if(dia > 0 && dia <= 31){
                        return  dia + "/" + mes + "/" + ano;
                        
                    }else{
                        return "Data inválida";
                    }
                }else{
                    if (mes==4 | mes==6 | mes==9 | mes == 11){
                        if(dia > 0 && dia <= 30){
                        return dia + "/" + mes + "/" + ano;
                        
                    }else{
                        return "Data inválida";
                    }
                    }else{
                        return "Data inválida";
                    }
                }
            }
        }else{
                       
            return "Data inválida";
        }
        
     }
    
    public void setHora(String entrada, String saida){
        this.saida = saida;
        this.entrada = entrada;
    }

    public String getConsulta(){
        return consulta;
    }
    
    public String getPaciente(){
        return paciente;
    }
    
    public String getCPF(){
        return cpf;
    }
    
    public long getID(){
        return id;
    }
    
    @Override public String toString(){
        return "Paciente: " + this.getPaciente() + ", " +
        "Entrada: "+ entrada + " Saída: " + saida;
    }
    
    @Override   
    public int compareTo(Consulta con){
        if(id > con.getID())
            return 1;
	else 
            return -1;
    }
    
    public String getSaida(){
        return saida;
    }
    
    public String getEntradaSaida(){
        return entrada;
    }
    
}













