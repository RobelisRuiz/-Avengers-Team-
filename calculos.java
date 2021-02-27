package calculos;

import java.util.Scanner;

public class calculos {
    // ATRIBUTOS
    private int num1;
    private int num2;
    Scanner sc = new Scanner(System.in);
    
    
    
    // CONSTRUCTORES
    public calculos(){
    
    }
    
public calculos(int num1,int num2){
    this.num1=num1;
    this.num2=num2;
}

//Métodos especiales: Suma, Resta, División , Multiplicación
public int sumar(){
    int suma = this.num1  +   this.num2;
   
     return suma; 
}

public int restar(){
    int resta = this.num1  -   this.num2;
    
    return resta; 
}

public int multiplicar (){
    int multiplicacion = this.num1  *   this.num2;
    
     return multiplicacion; 
}
public int dividir(){
    int division= this.num1 / this.num2;
  
     return division;
}
// Método Get y Método Set
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}