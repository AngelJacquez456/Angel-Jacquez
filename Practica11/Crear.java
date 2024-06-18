package Archivos;

import java.util.Scanner;

public class App {
 public static void main(String[] args) {
     Scanner siu = new Scanner(System.in);
     System.out.println("Opciones");
     System.out.println("1 Crear Archivo");
     System.out.println("2 Leer Archivo");

     int opcion = siu.nextInt();
        switch(opcion){
            case 1:
                CrearArchivo ca = new CrearArchivo();
                ca.crearArchivo();
                break;
            case 2:
                LeerArchivo la = new LeerArchivo();
                la.leerArchivo();
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }
        siu.close();
 }
}
