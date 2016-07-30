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
public class OggettiFactory {
    
    private ArrayList<Oggetti> lista =new ArrayList<Oggetti>();
    
    public OggettiFactory(){
    
    Oggetti oggetto= new Oggetti();
    oggetto.setNome("T-shirt");
    oggetto.setFoto("img/T-shirt.jpg");
    oggetto.setQuantità(23);
    oggetto.setPrezzo(19);
    lista.add(oggetto);
    
    Oggetti oggetto1= new Oggetti();
    oggetto1.setNome("Polo");
    oggetto1.setFoto("img/Polo.jpg");
    oggetto1.setQuantità(5);
    oggetto1.setPrezzo(25);
    lista.add(oggetto1);
    
    Oggetti oggetto2= new Oggetti();
    oggetto2.setNome("Canottiera");
    oggetto2.setFoto("img/Canottiera.jpg");
    oggetto2.setQuantità(15);
    oggetto2.setPrezzo(12);
    lista.add(oggetto2);
    
    Oggetti oggetto3= new Oggetti();
    oggetto3.setNome("Scollo a V");
    oggetto3.setFoto("img/V.jpg");
    oggetto3.setQuantità(11);
    oggetto3.setPrezzo(16);
    lista.add(oggetto3);
    
    Oggetti oggetto4= new Oggetti();
    oggetto4.setNome("Collo a dolcevita");
    oggetto4.setFoto("img/Dolcevita.jpg");
    oggetto4.setQuantità(5);
    oggetto4.setPrezzo(18);
    lista.add(oggetto4);
    
    
    
    
}
    
}
