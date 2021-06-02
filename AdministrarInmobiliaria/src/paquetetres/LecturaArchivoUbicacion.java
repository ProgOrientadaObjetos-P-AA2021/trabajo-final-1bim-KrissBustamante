/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;

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
public class LecturaArchivoUbicacion {

    private ObjectInputStream entrada;
    private ArrayList<Ubicacion> listaUbicacion;
    private String nombreArchivo;

    public LecturaArchivoUbicacion(String n) {
        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            try // abre el archivo
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } // fin de try
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo.");

            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerListaUbicacion() {
        // 
        listaUbicacion = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Ubicacion registro = (Ubicacion) entrada.readObject();
                    listaUbicacion.add(registro);
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

    public ArrayList<Ubicacion> obtenerListaUbicacion() {

        return listaUbicacion;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Ubicaciones:\n";
        for (int i = 0; i < obtenerListaUbicacion().size(); i++) {
            Ubicacion p = obtenerListaUbicacion().get(i);
            cadena = String.format("%sUbicacion numero (%d):\n"
                    + "\t> Barrio: %s\n"
                    + "\t> Referencia: %s\n\n", cadena,
                    i + 1,
                    p.obtenerNombreBarrio(),
                    p.obtenerReferencia());
        }
        return cadena;
    }

    public void cerrarArchivo() {
        try // cierra el archivo y sale
        {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } // fin de catch
    }

}
