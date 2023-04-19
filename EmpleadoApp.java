


public class EmpleadoApp {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Fernando","Ureña",23,800);
        Empleado empleado2 = new Empleado("Angelica","Lopez",25,1000);
        //Mostrar contenido empleado1
        empleado1.getNombre();
        System.out.println("El salario del empleado1 es: "+empleado1.getSalario());
        //Modificamos la edad del empleado1
        empleado1.setEdad(32);
        empleado1.plus(200);
        //Se incrementa 200 el salario del empleado1
        //Mostramos salario incrementado 
        System.out.println("El salario actual del empleado1 es: "+empleado1.getSalario());
        //Modificamos el nombre del empleado2
        empleado2.setNombre("Jessika");
        empleado2.plus(100);
        //Mostramos el salario nuevo
        System.out.println("El salario del empleado2 es: "+empleado2.getSalario());
    }
}
