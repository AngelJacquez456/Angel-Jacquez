package Practica12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Agenda {
    public static void main(String[] args) {
        NuevoArchivo na = new NuevoArchivo();
        NuevoContacto nc = new NuevoContacto(); 
       
        while (true) {
            int op = 0;
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu de Opciones\n"
            + "1 Nuevo Archivo\n"
            + "2 Nuevo Contacto\n"

        
        switch (op) {
            case 1:
                ca.crearArchivo();
                break;
        
            case 2:
            ac.agregarContactos();
        }
    }
}
        }
