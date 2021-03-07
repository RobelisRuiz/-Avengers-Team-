import java.util.Scanner;


public class ingresar {
    
    //ATRIBUTOS
                private int numerodecuenta=0;
		 private int pass=0;
		 private int intentos =1;
		private int maximo =1;
      
                Scanner sc = new Scanner(System.in);
    public ingresar(){

}
    public ingresar(int numerodecuenta,int pass){
        
        this.numerodecuenta=numerodecuenta;
        this.pass=pass;
    }
    
    

    //metodos especiales : usuario y contraseña
    
    public int numerodecuenta(){
    
   
    int usuario = this.numerodecuenta  ;
     return usuario; 
    
    }
    
    public int pass(){
    
   
    int contra = this.pass  ;
     return contra; 
    
    } 

    // metodo get y set
    public int getNumerodecuenta() {
        return numerodecuenta;
    }

    public void setNumerodecuenta(int numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }  
    
}
