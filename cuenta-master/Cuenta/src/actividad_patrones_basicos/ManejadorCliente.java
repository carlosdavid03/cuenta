/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_patrones_basicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrudasc
 */
public class ManejadorCliente {

    private String ruta = "C:\\Users\\Sala 8\\Desktop\\Banco.txt";

    public List<Cliente> listarClientes() {
        List<Cliente> listarClientes = new ArrayList();

        try {
            BufferedReader br = ManejadorArchivos.abrirArchivoLectura(ruta);
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                listarClientes.add(new Cliente(campos[1].trim(), campos[2].trim(), Integer.valueOf(campos[0]), Integer.valueOf(campos[3]),));
            }

            ManejadorArchivos.cerrarArchivo();
            return listarClientes;
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean guardar(Cliente e) {
        try {
            BufferedReader br = ManejadorArchivos.abrirArchivoLectura(ruta);
            String contenido = "";
            String linea;

            while ((linea = br.readLine()) != null) {
                if (!contenido.isEmpty()) {
                    contenido = contenido + "\r\n" + linea;
                } else {
                    contenido = linea;
                }
            }

            ManejadorArchivos.cerrarArchivo();

            PrintWriter pw = ManejadorArchivos.abrirArchivoEscritura(ruta);
            if (!contenido.isEmpty()) {
                pw.println(contenido);
            }

            pw.println(e.toString());

            ManejadorArchivos.cerrarArchivo();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean eliminar(Cliente e) {
        try {
            BufferedReader br = ManejadorArchivos.abrirArchivoLectura(ruta);
            String contenido = "";
            String linea;

            while ((linea = br.readLine()) != null) {

                String[] campos = linea.split(";");
                if (!(Integer.parseInt(campos[0]) == e.getCedula())) {
                    if (!contenido.isEmpty()) {
                        contenido = contenido + "\r\n" + linea;
                    } else {
                        contenido = linea;
                    }
                }
            }

            ManejadorArchivos.cerrarArchivo();

            PrintWriter pw = ManejadorArchivos.abrirArchivoEscritura(ruta);
            pw.println(contenido);

            ManejadorArchivos.cerrarArchivo();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
