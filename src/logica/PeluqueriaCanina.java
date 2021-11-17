
package logica;


public class PeluqueriaCanina {


    public static void main(String[] args) {
        //llamada a la controladora de logica
        Controladora control = new Controladora ();
        //prueba creando un cliente mediante constructor vacio para testear idCliente
        Cliente cli = new Cliente ();
        //seteo de atributos
        cli.setNumCliente(7635);
        cli.setNombrePerro("Wimpy");
        cli.setRaza("Cooker");
        cli.setColor("Blanco y negro");
        cli.setAlergico("true");
        cli.setAtencionEsp("true");
        cli.setNombreDuenio("Monica");
        cli.setCelDuenio("642345");
        cli.setObservaciones("Medio insoportable diria un tuerto");
        
        
        //llamada a controladora
        control.altaCliente(cli);
        
    }
    
}
