
 
package beauty;

import java.util.Scanner;


public class Beauty {

    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        int op;
        
       
        System.out.print("Ingrese el numero de la opción");
        op=lectura.nextInt();
        
        
        switch(op){
            case 1:{
                System.out.println("Usted eligio Bolso");
          
                break;
            }
            case 2:{
                System.out.println("Usted eligio Zapatos");
                break;
            }
            case 3:{
                System.out.println("Usted eligio Blusas");
                break;
            }
            case 4:{
                System.out.println("Usted eligio pantalones y leggins");
                break;
            }
            case 5:{
                System.out.println("Usted eligio vestidos y faldas");
                break;
                
            }
            default:
                System.out.println("Usted marco una opción invalida");
        }
        
        
        
    }
    
}
