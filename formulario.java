import java.util.Scanner;


public class formulario {
    
    //ATRIBUTOS
        private String nombre;
        private String apellido;
        private String telefono;
        private String direccion;
      
   private Scanner sc = new Scanner(System.in);
    public formulario(){

}
    public formulario (String nombre,String apellido,String telefono,String direccion){
        
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.direccion=telefono;
    }
    
    

    //metodos especiales : usuario y contraseña
    
    public String nombre(){
    
   
    String name = this.nombre ;
     return name; 
    
    }
    
    public String apellido(){
    
   
    String ape = this.apellido ;
     return ape; 
    
    } 

 public String telefono (){
    
   
    String tele = this.telefono ;
     return tele; 
    
    } 

 public String direccion(){
    
   
    String ape = this.apellido ;
     return ape; 
    
    } 

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}