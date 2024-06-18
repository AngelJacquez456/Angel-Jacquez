package Practica12;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class NuevoContacto {
public void NuevoContacto() {

String nombre, apellido, telefono;
int edad;
FileWriter ps;
try{
    ps = new FileWriter("agenda", true);
    PrintWriter sup = new PrintWriter(ps);
    nombre=(JOptionPane.showInputDialog("Nombre: "));
    direccion=(JOptionPane.showInputDialog("Direccion: "));
    telefono=(JOptionPane.showInputDialog("Teléfono: "));
    edad=Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
    sup.println(nombre+" "+direccion+" "+telefono+" "+edad);
    s.close();
} catch (IOException e) {
    JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
}

}
}