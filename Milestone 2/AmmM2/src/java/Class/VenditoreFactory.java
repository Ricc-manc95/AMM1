/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.ArrayList;

/**
 *
 * @author Utente
 */
public class VenditoreFactory {
    
        private ArrayList<Venditore> lista =new ArrayList<Venditore>();
    
    public VenditoreFactory(){
        
    Venditore venditore= new Venditore();
    venditore.setUsername("p.marc");
    venditore.setPassword("darkzouls");
    venditore.setSaldo(450.67);
    lista.add(venditore);
    
    
    Venditore venditore1= new Venditore();
    venditore1.setUsername("Shtef75");
    venditore1.setPassword("Shcusi");
    venditore1.setSaldo(923.73);
    lista.add(venditore1);
    
    
}
    
}
