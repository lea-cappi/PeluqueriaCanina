
package logica;

import persistencia.ControladoraPersistencia;


public class Controladora {
    //llamar a la controladora de la persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();
    
    
    //pivot con metodo alta cliente de persistencia
    public void altaCliente (Cliente cli) {
        controlPersis.altaCliente(cli);
    }
    //metodo pivot alta de interfaz grafica
    public void altaCliente (int numCliente, String nombrePerro, String raza, String color, String alergico, String atencionEsp, String nombreDuenio, String celDuenio, String observaciones) {
        //instanciamos Cliente con el constructor vacio
        Cliente cli = new Cliente();
        //seteamos atributos
        cli.setNumCliente(numCliente);
        cli.setNombrePerro(nombrePerro);
        cli.setRaza(raza);
        cli.setColor(color);
        cli.setAlergico(alergico);
        cli.setAtencionEsp(atencionEsp);
        cli.setNombreDuenio(nombreDuenio);
        cli.setCelDuenio(celDuenio);
        cli.setObservaciones(observaciones);
        //llamada al pivot con metodo alta de persistencia
        controlPersis.altaCliente(cli);
    }
    
    
}
