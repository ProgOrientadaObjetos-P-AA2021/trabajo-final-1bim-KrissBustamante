/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;
import java.io.Serializable;
/**
 *
 * @author reroes
 */
public class Constructora implements Serializable {

    private String Constructora;
    private String id;

    public Constructora(String nombreConstructora, String idEmpresarial) {
        this.Constructora = nombreConstructora;
        this.id = idEmpresarial;
    }

    public void establecerNombreConstructora(String nombreConstructora) {
        this.Constructora = nombreConstructora;
    }

    public void establecerIdEmpresarial(String idEmpresarial) {
        this.id = idEmpresarial;
    }

    public String obtenerNombreConstructora() {
        return Constructora;
    }

    public String obtenerIdEmpresarial() {
        return id;
    }
}
