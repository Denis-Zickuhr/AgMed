
package agmed;
import java.util.*;

public class AgMed {

    

    public static void main(String[] args) {
        /**  TESTE PACIENTE
        Cliente joao = new Cliente("João", "095.123.309-41", "Rua verde, 96" , "tel: 9994155515");
       
        
       joao.novaEntrada("12022002", "internado em estado grave com cancêr no pancreas");
       joao.novaEntrada("12022002", "internado em estado grave com cancêr no pulmão");
       joao.novaEntrada("12022002", "morreu");
       joao.novaEntrada("13022002", "recussitou");
       
       System.out.println(joao.getHistoricoPD("12022002")); 
       System.out.println(joao.getHistoricoPD("13022002"));
       
       System.out.println(joao.toString());
       
       joao.limparEntrada("12022002");
       
       System.out.println(joao.toString());
       **/
       
        // TESTE CONSULTA E AGENDA
       Cliente joao = new Cliente("João", "095.153.309-41", "Rua verde, 96" , "tel: 9994155515");
       
       Cliente matheus = new Cliente("matheus", "495.123.309-41", "Rua verde, 96" , "tel: 9994155515");
       
       Cliente pedro = new Cliente("pedro", "075.123.309-41", "Rua verde, 96" , "tel: 9994155515");
       
       Cliente lucas = new Cliente("lucas", "085.123.309-41", "Rua verde, 96" , "tel: 9994155515");
       
       /*
       joao.novaEntrada("12022002", "internado", "12");
       joao.novaEntrada("12022002", "solto", "13");
       joao.novaEntrada("12022002", "internado", "14");
       joao.novaEntrada("12022002", "internado", "15");
       
       
       joao.novaEntrada("12032002", "morto", "06");
       pedro.novaEntrada("12032002", "coração extraido", "07");
       lucas.novaEntrada("12042002", "recussitou", "03");
       matheus.novaEntrada("12032002", "pulmão extraido", "08");
       
       */
       
       Medico matt = new Medico("João", "095.123.309-41", "Rua verde, 96", "tel: 9994155515", "crm", "esp", "fun");

       Agenda agen = new Agenda(matt);
       
       
        Consulta cons1 = new Consulta(joao, agen);
        cons1.setConsulta(12, 30, 12, 01, 2021);
        
        Consulta cons2 = new Consulta(matheus, agen);
        cons2.setConsulta(13, 30, 25, 01, 2022);
        
        Consulta cons3 = new Consulta(pedro, agen);
        cons3.setConsulta(8, 30, 26, 01, 2021);
        
        Consulta cons4 = new Consulta(lucas, agen);
        cons4.setConsulta(9, 30, 25, 01, 2021);
        
        
        /*
        System.out.println(agen.getConsultas());
        Collections.sort(agen.consultas);
        
        System.out.println("\n" + "\n" +"\n" +"\n" );
        System.out.println(agen.getConsultas());
        */
        
        agen.imprimeConsultas();
        System.out.println("\n" + "\n" +"\n" +"\n" );
        
        
        
        agen.imprimeConsultas();
        System.out.println("\n" + "\n" +"\n" +"\n" );
        
        //System.out.println(joao.getHistoricoMedico());
       
        
        
        // TESTE AUTENTICADOR
        /*
        Secretário sec = new Secretário();
        sec.setLogin("aaa");
        sec.setSenha("aaa");
        Autenticador aut = new Autenticador("aaa", "aaa");
        
        aut.compare(sec, aut);
        
        if (aut.getChaveAcesso() == true)  
            System.out.println("aaaaaaaaaaaaaaaa");
        if (aut.getChaveAcesso() == false)
            System.out.println("bbbbbbbbbbbbbbbb");
        */
       
       
       
    }
   
}

