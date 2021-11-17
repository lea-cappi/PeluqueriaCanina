
package persistencia;

import logica.Cliente;


public class ControladoraPersistencia {
    //llamada e instanciado a ClienteJpaController con metodo constructor que setea UP
    ClienteJpaController cliJPA = new ClienteJpaController ();
    
    //metodo de alta
    public void altaCliente (Cliente cli) {
        cliJPA.create(cli);
    
    }
    
}
