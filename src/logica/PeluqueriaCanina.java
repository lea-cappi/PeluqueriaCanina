
package logica;

import igu.Principal;


public class PeluqueriaCanina {


    public static void main(String[] args) {
        //crear una instancia de controladora para inicializar la logica
        Controladora control = new Controladora ();
        //inicializar la interfaz grafica con la controladora como parametro  
        Principal princ = new Principal (control);
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
        
    }
    
}
