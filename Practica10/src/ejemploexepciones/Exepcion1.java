package ejemploexepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
class Exception1{
    public static void main(String[] args) {
        FileInputStream entrada= null;
        Lanzadora lanza = new Lanzadora();
        int sum;
        try{
            entrada = new FileInputStream("archivo.txt");
            while((sum = entrada.read()) != -1){
                lanza.lanzaSiNegativo(leo);
               }   System.out.println("Se encontro número negativo");
            } catch (Excepcion e){
                System.out.println("Excepción: " + e.getMessage());

            }catch (Exceptions e){
                System.out.println("Excepción: " + e.getMessage());
        }
    }
}
