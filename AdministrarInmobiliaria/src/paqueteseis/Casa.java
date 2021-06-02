/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;
 
import java.io.Serializable;
import paquetedos.Propietario;
import paquetetres.Ubicacion;
import paquetecuatro.Ciudad;
import paquetecinco.Constructora;

/**
 *
 * @author reroes
 */
public class Casa implements Serializable {

    private Propietario propietario;
    private double precioMetroCuadrado;
    private int numMetroCuadrado;
    private double precioFinal;
    private Ubicacion ubicacion;
    private Ciudad ciudad;
    private int numCuartos;
    private Constructora constructora;

    public Casa(Propietario propietario, double precioMetroCuadrado, int numMetroCuadrado,
            Ubicacion ubicacion, Ciudad ciudad, int numCuartos, Constructora constructora) {
        this.propietario = propietario;
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.numMetroCuadrado = numMetroCuadrado;
        this.ubicacion = ubicacion;
        this.ciudad = ciudad;
        this.numCuartos = numCuartos;
        this.constructora = constructora;
    }

    public void establecerPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void establecerPrecioMetroCuadrado(double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    public void establecerNumMetroCuadrado(int numMetroCuadrado) {
        this.numMetroCuadrado = numMetroCuadrado;
    }

    public void establecerPrecioFinal() {
        this.precioFinal = precioMetroCuadrado * numMetroCuadrado;
    }

    public void establecerUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void establecerCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void establecerNumCuartos(int numCuartos) {
        this.numCuartos = numCuartos;
    }

    public void establecerConstructora(Constructora constructora) {
        this.constructora = constructora;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public double obtenerPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public int obtenerNumMetroCuadrado() {
        return numMetroCuadrado;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    public Ubicacion obtenerUbicacion() {
        return ubicacion;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumCuartos() {
        return numCuartos;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }
}