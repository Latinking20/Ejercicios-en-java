
package menu_interactivo;

import javax.swing.JOptionPane;


public class Fashion {
    public static void blusas(){
        String color;
        String diseño, nombre, documento;

        JOptionPane.showMessageDialog(null,"Ingresaste a la seccion blusas");
         nombre=JOptionPane.showInputDialog(null,"Ingrese nombre del cliente..");
         documento=JOptionPane.showInputDialog(null,"Ingrese su numero de cedula..");
         color=JOptionPane.showInputDialog(null,"Ingrese de que color lo quiere");
         diseño=JOptionPane.showInputDialog(null,"Ingrese el diseño que quiere..");
        int pedido=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su pedido"));
        float total=pedido*25000;
        JOptionPane.showMessageDialog(null,"El monto de tu pedido es..."+total);

    }
    public static void bolsos(){
        String color;
        String diseño, nombre, documento;
        JOptionPane.showMessageDialog(null,"Ingresaste a la sección bolsos");
        nombre=JOptionPane.showInputDialog(null,"Ingrese nombre del cliente..");
        documento=JOptionPane.showInputDialog(null,"Ingrese su numero de cedula..");
        color=JOptionPane.showInputDialog(null,"Ingrese de que color lo quiere");
        diseño=JOptionPane.showInputDialog(null,"Ingrese el diseño que quiere..");
        int pedido=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su pedido.."));
        float total=pedido*120000;
        JOptionPane.showMessageDialog(null,"El monto de tu pedido es..."+total);
    }
    public static void faldas(){
        String color;
        String diseño, nombre, documento;
        JOptionPane.showMessageDialog(null,"Ingresaste a la sección faldas");
        nombre=JOptionPane.showInputDialog(null,"Ingrese nombre del cliente..");
        documento=JOptionPane.showInputDialog(null,"Ingrese su numero de cedula..");
        color=JOptionPane.showInputDialog(null,"Ingrese de que color lo quiere");
        diseño=JOptionPane.showInputDialog(null,"Ingrese el diseño que quiere..");
        int pedido=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su pedido.."));
        float total=pedido*30000;
        JOptionPane.showMessageDialog(null,"El monto de tu pedido es..."+total);
    }
    public static void maquillaje(){
        String nombre, documento, tipo;
        JOptionPane.showMessageDialog(null,"Ingresaste a la sección maquillaje");
        nombre=JOptionPane.showInputDialog(null,"Ingrese nombre del cliente..");
        documento=JOptionPane.showInputDialog(null,"Ingrese su numero de cedula..");
        tipo=JOptionPane.showInputDialog(null,"Ingrese el tipo de maquillaje que desea.");
        int pedido=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su pedido"));
        float total=pedido*240000;
        JOptionPane.showMessageDialog(null,"El monto de tu pedido es..."+total);
        
    }
    public static void zapatos(){
        String color;
        String diseño, nombre, documento;
        JOptionPane.showMessageDialog(null,"Ingresaste a la sección de calzado");
        nombre=JOptionPane.showInputDialog(null,"Ingrese nombre del cliente..");
        documento=JOptionPane.showInputDialog(null,"Ingrese su numero de cedula..");
        color=JOptionPane.showInputDialog(null,"Ingrese de que color lo quiere");
        diseño=JOptionPane.showInputDialog(null,"Ingrese el diseño que quiere..");
        int pedido=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su pedido.."));
        float total=pedido*65000;
        JOptionPane.showMessageDialog(null,"El monto de tu pedido es..."+total);
    }
    public static void salir(){
        
        JOptionPane.showMessageDialog(null,"Presiona <ENTER> Para salir");
    }
      
    
}
