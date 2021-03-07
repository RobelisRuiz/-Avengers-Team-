import java.util.Scanner;

public class cambiarcontraseña {
    
    
    // Atributos
    private int contraseña;
    
    
    private Scanner sc = new Scanner(System.in);
    //Constructor
    
    public cambiarcontraseña () {  
}
    
    public cambiarcontraseña (int contraseña ){
    
      this.contraseña=contraseña;
      
    }

    //metodos espeaciales: cambiar contraseña
    
    public int numerodecuenta(){
    
   
    int cambiar = this.contraseña  ;
     return cambiar; 
    
    }

    //  metodo get y set
    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    


}
 