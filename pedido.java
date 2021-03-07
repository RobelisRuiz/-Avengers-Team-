import java.util.Scanner;


public class pedido {
    
    //ATRIBUTOS
                private String seleccion;
		
                private Scanner sc = new Scanner(System.in);
    public pedido(){

}
    public pedido (String seleccion){
        
        this.seleccion=seleccion;

    }
    
    
    //metodos especiales : usuario y contraseña
    
    public String seleccion (){
    
   
    String sele = this.seleccion  ;
     return sele; 
    
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
   
   
    } 
