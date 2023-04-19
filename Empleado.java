
public class Empleado {
    //Atributos
    
   private String nombre;
   private String apellido;
   private int edad;
   private double salario;
   
   //Metodos
   //Muestra el contenido de la variable nombre
   public String getNombre(){
       return nombre;
   }
   
   //Modifica el nombre del empleado
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   //Muestra el contenido de la variable edad
   public int getEdad(){
       return edad;
   }
   //Modifica el contenido de la variable edad
   public void setEdad(int edad){
       this.edad = edad;
   }
   //Muestra el contenido de la variable salario
   public double getSalario(){
       return salario;
   }
   
   public boolean plus(double sueldoPlus){
       boolean aumento=false;
       if(edad>40 && compruebaNombre()){
           salario+=sueldoPlus;
           aumento = true;
       }
         return aumento;
   }
    private boolean compruebaNombre(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
    //Constructor
      public Empleado(){
          this.nombre="";
          this.apellido="";
          this.edad=0;
          this.salario=0;
      }
      //Constructor con 4 parametros
      public Empleado(String nombre, String apellido, int edad, double salario){
          this.nombre=nombre;
          this.apellido=apellido;
          this.edad=edad;
          this.salario=salario;
      }
}

