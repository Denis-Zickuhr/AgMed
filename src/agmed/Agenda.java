package agmed;
import java.util.*;

public class Agenda {
    private String Medico;
    
    public Agenda(Medico medico){
        this.Medico = Medico;
    }

    public String getMedico() {
        return Medico;
    }
    
    List<Consulta> consultas = new ArrayList<>();
    
    public void addConsulta(Consulta cons){
        consultas.add(cons);
    }
    
    public List<Consulta> getConsultas() {
		return this.consultas;
	}
    
    public void imprimeConsultas() {
		System.out.println("\nConsultas :\n");
		for(Consulta consultas : getConsultas()) {
			System.out.println(consultas.getConsulta());
		}
	}
    
}

