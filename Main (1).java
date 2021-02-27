import java.util.Scanner;
public class Main {

 public static void main(String[] args) {
  
   Scanner sn =new Scanner(System.in);
   
   System.out.println("BIENVENIDO A CALCULADOR");
   System.out.println("Elige una opción: \n1: Suma \n2: Resta \n3: Multiplicación \n4: División ");
   
   int operacion=sn.nextInt();
  
   switch   (operacion) {
                   case 1 -> {
                       int num1,num2,suma;
                       System.out.println(" BIENVENIDO A SUMA");
                       System.out.println("Ingresa el primer numero");
                       num1=sn.nextInt();
                       System.out.println("Ingresa el segundo numero");
                       num2=sn.nextInt();
                       suma=num1+num2;
                       System.out.println("El resultado de la suma es:  "+suma);
         }

                   case 2 -> {
                       System.out.println("BIENVENIDO A RESTA");
                       int Res1,Res2,resta;
                       System.out.println ("Ingresa el primer numero");
                       Res1=sn.nextInt();
                       System.out.println ("Ingrese el segundo numero");
                       Res2=sn.nextInt();
                       resta=Res1-Res2;
                       System.out.println("El resultado de la resta es:"+resta);
         }

                   case 3 -> {
                       System.out.println("BIENVENIDO A DIVISION");
                       int Div1,Div2,Division;
                       System.out.println("Ingresa el primer numero");
                       Div1 = sn.nextInt ();
                       System.out.println("Ingresa el segundo numero");
                       Div2 = sn.nextInt ();
                       Division = Div1/Div2;
                       System.out.println("El resultado de la división es:"+Division);
         }
                   
                   case 4 -> {
                       System.out.println(" BIENVENIDO A MULTIPLICACION");
                       int Mul1,Mul2,Multiplicacion;
                       System.out.println("Ingresa el primer numero");
                       Mul1 = sn.nextInt ();
                       System.out.println("Ingresa el segundo numero");
                       Mul2 = sn.nextInt ();
                       Multiplicacion=Mul1*Mul2;
                       System.out.println("El resultado de la multiplicación es : "+Multiplicacion);
         }
                   case 5 -> {
                       boolean salir = true;
         }

                   default -> System.out.println("Solo numeros entre 1 y 4");
                       
               }
               
      
   
   } 
  
 }
