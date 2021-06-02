/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;


import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Ubicacion implements Serializable {

    private int numCasa;
    private String nombreBarrio;
    private String referencia;

    public Ubicacion(int numCasa, String nombreBarrio, String referencia) {
        this.numCasa = numCasa;
        this.nombreBarrio = nombreBarrio;
        this.referencia = referencia;
    }

    public void establecerNombreBarrio(String nombreBarrio) {
        this.nombreBarrio = nombreBarrio;
    }

    public void establecerReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void establecerNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public String obtenerNombreBarrio() {
        return nombreBarrio;
    }

    public String obtenerReferencia() {
        return referencia;
    }

    public int obtenerNumCasa() {
        return numCasa;
    }

}