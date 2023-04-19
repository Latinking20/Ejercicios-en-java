/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        
        String nombre;
        int edad;
        char sexo;
        double sueldo;
        boolean estado;
        // Entrada de datos
        System.out.print("Ingrese nombre del empleado...");
        nombre=datos.nextLine();
        System.out.print("Ingrese su edad..");
        edad=datos.nextInt();
        System.out.print("Ingresa tu sexo M=Masculino - F=Femenino...");
        sexo=datos.next().charAt(0);
        System.out.print("Ingrese su sueldo...");
        sueldo=datos.nextDouble();
        System.out.print("Ingrese su estado True=Activo - False=Inactivo...");
        estado=datos.nextBoolean();
        
        //Salida de datos
        System.out.println("Tu nombre es "+nombre);
        System.out.println("Tu edad es "+edad);
        System.out.println("Tu sexo es "+sexo);
        System.out.println("Tu sueldo es "+sueldo);
        System.out.println("Tu estado es "+estado);
        
        
        
        
    }
    
}
