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
public class Departamento implements Serializable {

    private Propietario propietario;
    private double precioMetroCuadrado;
    private double numMetroCuadrado;
    private double cuotaMensual;
    private double costoFinal;
    private double precio;
    private Ubicacion ubicacion;
    private Ciudad ciudad;
    private String nombreEdificio;
    private String ubicacionDepartamento;
    private Constructora constructora;

    public Departamento(Propietario propietario, double precioMetroCuadrado,
            double numMetroCuadrado, double cuotaMensual, Ubicacion ubicacion,
            Ciudad ciudad, String nombreEdificio,
            String ubicacionDepartamento,
            Constructora constructora) {
        this.propietario = propietario;
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.numMetroCuadrado = numMetroCuadrado;
        this.cuotaMensual = cuotaMensual;
        this.ubicacion = ubicacion;
        this.ciudad = ciudad;
        this.nombreEdificio = nombreEdificio;
        this.ubicacionDepartamento = ubicacionDepartamento;
        this.constructora = constructora;
    }

    public void establecerPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void establecerPrecioMetroCuadrado(double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    public void establecerNumMetroCuadrado(double numMetroCuadrado) {
        this.numMetroCuadrado = numMetroCuadrado;
    }

    public void establecerCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public void establecerCostoFinal() {
        this.costoFinal = precio + (cuotaMensual * 12);
    }

    public void establecerPrecio() {
        this.precio = (numMetroCuadrado * precioMetroCuadrado);
    }

    public void establecerUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void establecerCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void establecerNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public void establecerUbicacionDepartamento(String ubicacionDepartamento) {
        this.ubicacionDepartamento = ubicacionDepartamento;
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

    public double obtenerNumMetroCuadrado() {
        return numMetroCuadrado;
    }

    public double obtenerCuotaMensual() {
        return cuotaMensual;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public Ubicacion obtenerUbicacion() {
        return ubicacion;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public String obtenerNombreEdificio() {
        return nombreEdificio;
    }

    public String obtenerUbicacionDepartamento() {
        return ubicacionDepartamento;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }
}
