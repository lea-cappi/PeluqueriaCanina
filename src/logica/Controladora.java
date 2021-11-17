
package logica;

import persistencia.ControladoraPersistencia;


public class Controladora {
    //llamar a la controladora de la persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();
    
    //prueba instanciando un cliente
    Cliente cli = new Cliente (1, 3241,"Leyla", "Terbal", "Castano", "false", "false", "Leandro", "2345234", "La mas bella del mundo");
    
    
    
    //pivot con metodo alta cliente de persistencia
    public void altaCliente (Cliente cli) {
        controlPersis.altaCliente(cli);
    }
    
    
}
