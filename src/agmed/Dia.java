/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agmed;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Dia {
    
    private String numero;
    private List<String> list = new ArrayList<>();
    private String velha = "";
    
    public Dia(String d){
        this.numero = d;
    }
    
    public String toString(){
        return this.numero+": " + refinedList();
    }
    
    public String refinedList(){
        
        String text = "";
        
        for(String s: list){
            text = text + s + " ";
        }
        
        return text;
        
    }
    
    public void addConsulta(Consulta c, String e, String s){
        
        System.out.print("aaaa");
        removeConsulta(c);
        c.setHora(e+"h", s+"h");
        String nova = c.toString(); 
        nova = c.toString();
        nova = velha + " " + nova;
        list.add(nova);
        
    }
    
    public void removeConsulta(Consulta c){
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).contains(c.toString().substring(10, 15))){
                list.remove(list.get(i));
            }
        }
        
    }
    
    public String getDia(){
        return numero;
    }
    
    public List<String> getList(){
        return this.list;
    }
    
}
