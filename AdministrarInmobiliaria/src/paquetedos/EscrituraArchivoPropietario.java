/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author nixon
 */
public class EscrituraArchivoPropietario {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Propietario registro;
    private ArrayList<Propietario> listaPropietarios;

    public EscrituraArchivoPropietario(String n) {
        nombreArchivo = n;
        establecerListaPropietarios();
     
        try 
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
        
            if (obtenerListaPropietarios().size() > 0) {
                for (int i = 0; i < obtenerListaPropietarios().size(); i++) {
                    establecerRegistro(obtenerListaPropietarios().get(i));
                    establecerSalida();
                }
            }
        } 
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo o la lista esta vacia.");
        } 
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRegistro(Propietario n) {
        registro = n;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registro); 
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    public void establecerListaPropietarios() {
        LecturaArchivoPropietario l = new LecturaArchivoPropietario(
                obtenerNombreArchivo());
        l.establecerListaPropietarios();
        listaPropietarios = l.obtenerListaPropietarios();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Propietario> obtenerListaPropietarios() {
        return listaPropietarios;
    }


    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try 
        {
            if (salida != null) {
                salida.close();
            }
        } 
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");

        } 
    }

}
