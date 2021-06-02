/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;

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
public class LecturaArchivoConstructora {

    private ObjectInputStream entrada;
    private ArrayList<Constructora> listaConstructora;
    private String nombreArchivo;

    public LecturaArchivoConstructora(String n) {
        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            try 
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } 
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo.");

            } 
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerListaConstructora() {
        // 
        listaConstructora = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Constructora registro = (Constructora) entrada.readObject();
                    listaConstructora.add(registro);
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    // No hay datos en el archivo
                    break;
                }
            }
        }

    }

    public ArrayList<Constructora> obtenerListaConstructora() {

        return listaConstructora;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Constructoras:\n";
        for (int i = 0; i < obtenerListaConstructora().size(); i++) {
            Constructora p = obtenerListaConstructora().get(i);
            cadena = String.format("%sConstructora numero (%d):\n"
                    + "\t> Constructora: %s\n"
                    + "\t> Id Empresarial: %s\n\n", cadena,
                    i + 1,
                    p.obtenerNombreConstructora(),
                    p.obtenerIdEmpresarial());
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
        } 
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } 
    }

}
