/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.proyecto;

import java.io.*;

/**
 *
 * @author dci
 */
public class ejecutarArchivos {
    public void menu ()
    {
        String ruta =new String ("E:\\pruebaArchivo\\Archivo.prueba.xml");
        abrir(ruta);
    }
    public static void abrir(String ruta)
    {
        try {
            // Ruta
            Runtime.getRuntime().exec("cmd /c start "+ruta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
