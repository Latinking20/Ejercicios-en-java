
package menu_interactivo;
import javax.swing.JOptionPane;
import static menu_interactivo.Fashion.blusas;
import static menu_interactivo.Fashion.bolsos;
import static menu_interactivo.Fashion.faldas;
import static menu_interactivo.Fashion.maquillaje;
import static menu_interactivo.Fashion.salir;
import static menu_interactivo.Fashion.zapatos;


public class Menu_interactivo {

    
    public static void main(String[] args) {
        int op=0;
       
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Menú Principal\n"+"1. blusas\n"+"2. bolsos\n"+"3. faldas\n"+"4. maquillaje\n"+"5. zapatos\n"+"6. salir\n\nSeleccione opcion.")); 
            
            switch(op){
                case 1:
                blusas();
                    break;
                            case 2:
                                bolsos();
                                break;
                                        case 3:
                                            faldas();
                                            break;
                                                    case 4: 
                                                        maquillaje();
                                                        break;
                                                        
                                                           case 5:
                                                           zapatos();
                                                           break;
                                                           
                                                                case 6:
                                                                salir();
                                                                break;
                                                    
                                                                default:
            
                                                             
       
            
                                                                    JOptionPane.showMessageDialog(null,"Algoritmo terminado");
                                                                    if(op<=0){
                                                                        JOptionPane.showMessageDialog(null,"Opción invalida");
                                                                    }else if(op>6){
                                                                        JOptionPane.showMessageDialog(null,"Opción invalida");
                                                                        break;
                                                                    }else if(op==6){
                                                                        JOptionPane.showMessageDialog(null,"Algoritmo terminado");
                                                                    }                                                                                                                                
            }
            
        }while(op<=5 || op>6);
    }
}

    
