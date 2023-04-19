
package area_triangulo;

import javax.swing.JOptionPane;


public class Area_Tgrafica {

    
    public static void main(String[] args) {
        double base, altura;
        double AreaTotal;
        
        base=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor de la base..."));
        altura=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor de la altura..."));
        
        AreaTotal=base*altura/2;
        JOptionPane.showMessageDialog(null,"El valor del area total del triangulo es...:"+AreaTotal);
    }
    
}
