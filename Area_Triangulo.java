
package area_triangulo;

import java.util.Scanner;


public class Area_Triangulo {

   
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double base, altura;
        double AreaTotal;
        
        System.out.print("Ingrese el valor de la base...");
        base=datos.nextDouble();
        System.out.print("Ingrese el valor de la altura...");
        altura=datos.nextDouble();
        
        AreaTotal=base*altura/2;
        System.out.println("El valor del area total del triangulo es...:"+AreaTotal);
      
    }
    
}
