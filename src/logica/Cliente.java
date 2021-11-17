
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//clase entidad, relacion o tabla en base de datos
@Entity
public class Cliente implements Serializable {
    
    //declaracion de atributos de la clase
    //primary key
    @Id
    //autoincremental
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCliente;
    //atributos o campos
    @Basic
    private int  numCliente;
    private String nombrePerro;
    private String raza;
    private String color;
    private String alergico;
    private String atencionEsp;
    private String nombreDuenio;
    private String celDuenio;
    private String observaciones;
    
    //metodo constructor vacio
    public Cliente() {
    }
    //metodo constructor
    public Cliente(int idCliente, int numCliente, String nombrePerro, String raza, String color, String alergico, String atencionEsp, String nombreDuenio, String celDuenio, String observaciones) {
        this.idCliente = idCliente;
        this.numCliente = numCliente;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEsp = atencionEsp;
        this.nombreDuenio = nombreDuenio;
        this.celDuenio = celDuenio;
        this.observaciones = observaciones;
    }
    //getters y setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencionEsp() {
        return atencionEsp;
    }

    public void setAtencionEsp(String atencionEsp) {
        this.atencionEsp = atencionEsp;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
