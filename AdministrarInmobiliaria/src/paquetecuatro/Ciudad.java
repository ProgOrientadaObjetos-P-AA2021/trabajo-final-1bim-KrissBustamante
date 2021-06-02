/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecuatro;
import java.io.Serializable;
/**
 *
 * @author reroes
 */
public class Ciudad implements Serializable {

    private String nombreCiudad;
    private String nombreProvincia;

    public Ciudad(String nombreCity, String nombreProvincia) {
        this.nombreCiudad = nombreCity;
        this.nombreProvincia = nombreProvincia;
    }

    public void establecerNombreCiudad(String nombre) {
        this.nombreCiudad = nombre;
    }

    public void establecerNombreProvincia(String nombreP) {
        this.nombreProvincia = nombreP;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public String obtenerNombreProvincia() {
        return nombreProvincia;
    }

}