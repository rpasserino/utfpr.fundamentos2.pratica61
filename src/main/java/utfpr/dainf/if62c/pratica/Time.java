/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.HashMap;

/**
 *
 * @author lucifersam
 */
public class Time {
    private HashMap<String, Jogador> time = new HashMap<>();
    
    public Time(){
          
    }
    
    public void addJogador(String chave, Jogador valor){
        time.put(chave, valor);
    }
    
    public HashMap getJogadores(){
        return time;
    }
}