
package persistencia;

import logica.Cliente;


public class ControladoraPersistencia {
    //llamada e instanciado a ClienteJpaController con metodo constructor que setea UP
    ClienteJpaController cliJPA = new ClienteJpaController ();
    
    //metodo de alta
    public void altaCliente (Cliente cli) {
        try {
            cliJPA.create(cli);
        }
        catch (Exception e) {
            System.out.println("No se pudo crear el cliente.");
        }
    
    }
    
}
