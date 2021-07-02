package agmed;
import java.util.*;

public class Agenda {
    private final String medico;
    
    public Agenda(Medico medico){
        this.medico = medico.getNome();
    }

    public String getMedico() {
        return medico;
    }
    
    List<Consulta> consultas = new ArrayList<>();
    
    public void addConsulta(Consulta cons){
        consultas.add(cons);
    }
    
    public List<Consulta> getConsultas() {
        return this.consultas;
    }
    
    public void imprimeConsultas() {
	Collections.sort(consultas);
                	
        
        System.out.println("\nConsultas :\n");
	for(Consulta consultas : getConsultas()) {
            System.out.println(consultas.toString() + "\n");
		}
	}
    
    public String toString(){
        return medico;
    }
    
}

