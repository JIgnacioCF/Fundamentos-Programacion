package practicas;
import javax.swing.JOptionPane;
/**
 *14 octubre 2020
 * @author nacho
 */
public class Practica41_Swing {
    public static void main(String[] args) {
        String s1=JOptionPane.showInputDialog("Ingresa tu edad");
        byte edad=Byte.parseByte(s1);
        if (edad>=18) {
            JOptionPane.showMessageDialog(null, "eres mayor de edad");
        }else{
            JOptionPane.showMessageDialog(null, "eres menor de edad");
        }
    }    
}
