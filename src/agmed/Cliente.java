    
    package agmed;
    import java.util.*;
    
    public class Cliente extends PessoaFisica{
        
        public Cliente(String nome, String cpf, String endereco, String contato){
        
            super(nome, cpf, endereco, contato);
            
        }
       
        public final Map<String, Set<String>> historicoMedico = new HashMap<>();
        public final Set<LinkedHashSet<String>> SetOfStrings = new LinkedHashSet<>();
        
        public void novaEntrada(String data, String desc, String hora){
        
            String dia = "Dia: " + data.substring(0,2)+"/"+data.substring(2,4)+"/"+data.substring(4, 8);
            
            if(!(historicoMedico.containsKey(data))){
                LinkedHashSet<String> list = new LinkedHashSet<>();
                list.add(dia);
                SetOfStrings.add(list);
                historicoMedico.put(data, list);
            }
                
            for (Iterator<LinkedHashSet<String>> it1 = SetOfStrings.iterator(); it1.hasNext();){
                
                LinkedHashSet<String> listAux = it1.next();
                
                if (listAux.contains(dia)){
                    desc = hora + "h " + desc;
                    listAux.add(desc);
                    
                    LinkedHashSet<String> list = new LinkedHashSet();
                    
                    for (Iterator<String> it2 = listAux.iterator(); it2.hasNext();) {
                        String text = it2.next();
                        if(!text.equals(dia)){
                            list.add(text);
                        }
                    }
                    

                    historicoMedico.put(data, list);
                    
                }
            }
        }
        public  void limparHistórico(){
            
            historicoMedico.clear();
            
        }
        public void limparEntrada(String data){
            
           historicoMedico.remove(data);
            
        }      
        public String getHistoricoMedico(String data){
            

            String dia = data.substring(0,2)+"/"+data.substring(2,4)+"/"+data.substring(4, 8);
                
                
            
            
            return dia + ":" + historicoMedico.get(data) + "\n";
        }
        public String getHistoricoMedico(){
            String aux = "";
            
            for (String key: historicoMedico.keySet()) {
                String dia = key.substring(0,2)+"/"+ key.substring(2,4)+"/"+key.substring(4, 8);
                aux += dia + ":" + historicoMedico.get(key) + "\n";
                
            }
            return aux;
        }
        
        public String toString(){
            return nome;
        }
        
        
}

