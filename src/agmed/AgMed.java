
package agmed;


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
       Cliente joao = new Cliente("João", "095.123.309-41", "Rua verde, 96" , "tel: 9994155515");
       joao.novaEntrada("12022002", "internado", "12");
       joao.novaEntrada("12022002", "solto", "13");
       joao.novaEntrada("12022002", "internado", "14");
       joao.novaEntrada("12022002", "internado", "15");
       joao.novaEntrada("12032002", "morto", "06");
       joao.novaEntrada("12032002", "coração extraido", "07");
       joao.novaEntrada("12042002", "recussitou", "03");
       joao.novaEntrada("12032002", "pulmão extraido", "08");
       
       
       
       
       
       
        Consulta cons = new Consulta(joao);
        cons.setConsulta(12, 30, 5, 1, 2021);
        System.out.println(cons.getConsulta());

        Medico matt = new Medico("João", "095.123.309-41", "Rua verde, 96", "tel: 9994155515", "crm", "esp", "fun");

        Agenda agen = new Agenda(matt);

        agen.addConsulta(cons);
        System.out.println();
        System.out.println();

        agen.imprimeConsultas();
        System.out.println();
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(cons.toString());

        System.out.println(joao.getHistoricoMedico());
        
        System.out.println(joao.getHistoricoMedico("12032002"));
      
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

