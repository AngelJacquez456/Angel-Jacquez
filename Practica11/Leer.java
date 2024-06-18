package Archivos;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class LeerArchivo {
    public void leerArchivo(){
        try{
            FileReader archivo = new FileReader("archivo");
            BufferedReader lectura = new BufferedReader(archivo);
            String lnea;
            while((lnea = lectura.readLine()) != null){
                System.out.println(lnea);
            }
            lectura.close();
        }   catch (FileNotFoundException err){
            System.out.println("Error: "+err);
        }   catch (IOException err){
            System.out.println("Error: "+err);
        }
    }
}