
package logica;

import persistencia.ControladoraPersistencia;


public class Controladora {
    //llamar a la controladora de la persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();
    
    
    //pivot con metodo alta cliente de persistencia
    public void altaCliente (Cliente cli) {
        controlPersis.altaCliente(cli);
    }
    
    
}
