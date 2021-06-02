/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author nixon
 */
public class LecturaArchivoCasa {

    private ObjectInputStream entrada;
    private ArrayList<Casa> listaCasas;
    private String nombreArchivo;

    public LecturaArchivoCasa(String n) {
        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            try // abre el archivo
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } 
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo o la lista esta vacia.");

            } 
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerListaCasas() {
        // 
        listaCasas = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Casa registro = (Casa) entrada.readObject();
                    listaCasas.add(registro);
                } catch (EOFException endOfFileException) {
                    return; 
                    
                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                
                    break;
                }
            }
        }

    }

    public ArrayList<Casa> obtenerListaCasas() {

        return listaCasas;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de casas:\n";
        for (int i = 0; i < obtenerListaCasas().size(); i++) {
            Casa c = obtenerListaCasas().get(i);
            cadena = String.format("%sCasa numero (%d):\n"
                    + "Informacion del Propietario:\n"
                    + "\t> Nombres: %s\n"
                    + "\t> Apellidos: %s\n"
                    + "\t> Identificación: %s\n"
                    + "Informacion de la ubicacion:\n"
                    + "\t> Barrio: %s\n"
                    + "\t> Referencia: %s\n"
                    + "\t> Numero de casa: %s\n"
                    + "Informacion de la Ciudad:\n"
                    + "\t> Ciudad: %s\n"
                    + "\t> Provincia: %s\n"
                    + "Información de la constructora:\n"
                    + "\t> Constructora: %s\n"
                    + "\t> Id de la empresa: %s\n"
                    + "Informacion del terreno y costo:\n"
                    + "\t> Número de cuartos: %d\n"
                    + "\t> Precio por metros cuadrados: %.2f$\n"
                    + "\t> Número de metros cuadrados: %dm\n"
                    + "\t> Costo final: %.2f$\n\n", cadena, i + 1,
                    c.obtenerPropietario().getNombres(),
                    c.obtenerPropietario().getApellidos(),
                    c.obtenerPropietario().getIdentificacion(),
                    c.obtenerUbicacion().obtenerNombreBarrio(),
                    c.obtenerUbicacion().obtenerReferencia(),
                    c.obtenerUbicacion().getNumCasa(),
                    c.obtenerCiudad().obtenerCiudad(),
                    c.obtenerCiudad().obtenerNombreProvincia(),
                    c.obtenerConstructora().obtenerNombreConstructora(),
                    c.obtenerConstructora().obtenerIdEmpresarial(),
                    c.obtenerNumCuartos(),
                    c.obtenerPrecioMetroCuadrado(),
                    c.obtenerNumMetroCuadrado(),
                    c.obtenerPrecioFinal());
        }
        return cadena;
    }

    public void cerrarArchivo() {
        try 
        {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } 
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } // fin de catch
    }

}
