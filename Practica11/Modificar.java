package Archivos;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.io.FileWriter;

public class CrearArchivo {
    public void crearArchivo(){
        try{
            FileOutputStream nw= new FileOutputStream("archivo1");
            DataOutputStream Dta = new DataOutputStream(nw);
        } catch (FileNotFoundException err){
            System.out.println("Hay un error: "+err);

        }
        String nombre, apellido, telefono;
        FileWriter file;
        try{
        file = new FileWriter("archivo", true);
        PrintWriter sup = new PrintWriter(file); 
        for (int x =1; x <= 3; x++){
           nombre=(JOptionPane.showInputDialog("Nombre: \n" ));
           apellido=(JOptionPane.showInputDialog("Apellido: \n"));
           telefono=(JOptionPane.showInputDialog("Teléfono: \n"));
           sup.println(nombre+" "+ apellido+" "+telefono); 
        }
        sup.close();
        file.close();
    } catch (IOException err){
        System.out.println("Existe un error: "+err);
    }
   
}
}

