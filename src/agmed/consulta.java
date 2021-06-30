
package agmed;
import java.util.*;
import agmed.Agenda;

public class Consulta implements Comparable<Consulta>{
    
    private String consulta, paciente, historico;
    private final String cpf;
    private long id;
    
    
    public Consulta(Cliente paciente, Agenda agen){
        this.paciente = paciente.getNome();
        this.cpf = paciente.getCPF();
        this.historico = paciente.getHistoricoMedico();
        agen.addConsulta(this);
    }
    
    public boolean setConsulta(int hora, int min, int dia, int mes, int ano){
        String data = this.setData(dia, mes, ano);
        String horario = this.setHora(hora, min);
        
        String id = "" + ano;
        
        if (mes < 10)
            id += "0" + mes;
        else
            id += mes;
        
        if (dia < 10)
            id += "0" + dia;
        else   
            id += dia;
        
        if (hora < 10)
            id += "0" + hora;
        else
            id += hora;
        
        if (min < 10)
            id += "0" + min;
        else
            id += min;
      
        this.id = Long.parseLong(id);
        
        if (!data.equalsIgnoreCase("Data inválida"))
            if (!horario.equalsIgnoreCase("Hora inválida")){
              
                this.consulta = data + " " + horario + ".";;    
                return true;
            }else{
                this.consulta = "Hora inválida";
                return false;
            }
        else{
            this.consulta = "Data Inválida";
            return false;
            
        }
        
        
        
        
        
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
    
    public String setHora(int hora, int min){
        String aux;
        if (hora >= 0 && hora <= 24){
            if (min >=0 && min<= 60){
                aux = hora + ":" + min;
                return aux;
            }else
                return "Hora inválida";
        }else
            return "Hora inválida";
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
        return "Paciente: " + this.getPaciente() + "\n" +
        "Horário: " + this.consulta + "\n" +
        "Histórico médico: " + "\n"
        + historico;
    }
    
    @Override   
    public int compareTo(Consulta con){
        if(id > con.getID())
            return 1;
	else 
            return -1;
    }
}













