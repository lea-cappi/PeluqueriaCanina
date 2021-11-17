
package logica;


public class PeluqueriaCanina {


    public static void main(String[] args) {
        //llamada a la controladora de logica
        Controladora control = new Controladora ();
        //prueba instanciando un cliente
        Cliente cli = new Cliente (1, 3241,"Leyla", "Terbal", "Castano", "false", "false", "Leandro", "2345234", "La mas bella del mundo");
        control.altaCliente(cli);
        
    }
    
}
