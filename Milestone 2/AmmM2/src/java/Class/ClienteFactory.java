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
public class ClienteFactory {
    
    private ArrayList<Cliente> lista =new ArrayList<Cliente>();
    
    public ClienteFactory()
            {
    Cliente cliente= new Cliente();
    cliente.setUsername("ric.manc");
    cliente.setPassword("gaurru9");
    cliente.setSaldo(324.50);
    lista.add(cliente);
    
    
    Cliente cliente1= new Cliente();
    cliente1.setUsername("gluca_f");
    cliente1.setPassword("G1S0");
    cliente1.setSaldo(941.25);
    lista.add(cliente1);
    
    Cliente cliente2= new Cliente();
    cliente2.setUsername("L.marc");
    cliente2.setPassword("mybro");
    cliente2.setSaldo(1254.45);
    lista.add(cliente2);
    
}
    
}
