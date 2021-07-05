/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agmed;

import java.util.ArrayList;
import java.util.List;

public class Dia {
    
    private String numero;
    private List<String> list = new ArrayList<>();
    
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
        c.setHora(e, s);
        list.add(c.toString());
    }
    
    public void removeConsulta(Consulta c){
        list.remove(c.toString());
    }
    
    public String getDia(){
        return numero;
    }
    
}
