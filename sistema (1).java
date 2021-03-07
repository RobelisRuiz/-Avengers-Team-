import java.util.Date;
import java.util.Scanner;

public class sistema {

 public static void main(String[] args) {
  
   Scanner teclado = new Scanner(System.in);
    java.util.Date fecha = new Date();
   
                int numerodecuenta=0;
		int pass=0;
		int intentos=1;
		int maximo=1;
			
				while((numerodecuenta !=1809)||(pass!=1234)&& (intentos<maximo)){
					
					System.out.print("introduzca su usuario: ");
					numerodecuenta=teclado.nextInt();
					System.out.print("Introduzca su pass:");
					pass=teclado.nextInt();
					
					if (numerodecuenta==1809){
						System.out.println("login y pass, correctos...");
						intentos=intentos-maximo;
                                          
                                         
                               
					}
				
					intentos++;	
			}
                                
                                
                   Scanner sc =new Scanner(System.in);               
                
                  
                 String nombre;
                 String apellido;
                 String nacionalidad;
                 String articulo;
                 String direccion;
                 String contraseña;
                 int seleccion;
                 int telefono;             
                                
                                
                                
                                
                                
                
           System.out.println("BIENVENIDO A DOMICILIO PANAMÁ");
   System.out.println("Elige una opción: \n1: CAMBIAR CONTRASEÑA \n2: LLENAR FORMULARIO  \n3: PEDIDO \n4: SALIR ");
   int operacion=sc.nextInt();                     
                                
                          switch   (operacion) {
                   case 1 -> {
                       System.out.println("BIENVENIDO A CAMBIAR CONTRASEÑA");
                       
                     System.out.println("Ingrese su nueva contraseña");
                      String contraseñanueva=sc.next();
                      contraseña=contraseñanueva;
                       System.out.println("SU NUEVA CONTRASEÑA ES :" +contraseña);  
                       break;
         }

                   case 2 -> {
                       System.out.println("BIENVENIDO A LLENAR FORMULARIO");
                       
			System.out.println(" Ingrese su nombre");
                        nombre= sc.next();
                        
                        System.out.println(" Ingrese su apellido");
                        apellido = sc.next();
                        
                        System.out.println(" Ingrese su telefono(sin guion)");
                        telefono = sc.nextInt();
                        
                        System.out.println(" Ingrese su dirección");
                        direccion = sc.next();
                        
                        System.out.println("MUY BIEN, YA TENEMOS SU INFORMACIÓN");
                        
                                    System.out.println("DATOS PERSONALES");
                         
                                  
                                 System.out.println("Su nombre es :" +nombre);
                                 System.out.println("Su apellido es :" +apellido);
                                 System.out.println("Su telefono es :" +telefono);
                                 System.out.println("Su direccion es :" +direccion);
                                 
                                
                       System.out.println("MUY BIEN, YA TENEMOS SU INFORMACIÓN");
                        break;
                       
         }

                   case 3 -> {
                       System.out.println("BIENVENIDO A PEDIDO");
                      
                       System.out.println("SELECCIONE UN PLATO");
                       
                       System.out.println("Elige una opcion: \n1: SANCOCHO PRECIO: 3.50 BALBOAS \n2: ARROZ CON POLLO 2.00 BALBOAS   \n3: JUGO DE NARANJA(VASO GRANDE) 1.00 BALBOA \n4: CHICA DE MARACUYA(VASO GRANDE) 1.00 ");
                       
                       seleccion= sc.nextInt();
                       
                    switch (seleccion) {
                        case 1 -> System.out.println(" Usted eligio la opcion 1: SANCOCHO PRECIO: 3.50 BALBOAS");
                        
                        case 2 -> System.out.println(" Usted eligio la opcion 2: ARROZ CON POLLO 2.00 BALBOAS ");
                        
                        case 3 -> System.out.println(" Usted eligio la opcion 3: JUGO DE NARANJA(VASO GRANDE) 1.00 BALBOA ");
                        
                        case 4 -> System.out.println(" Usted eligio la opcion 4: CHICA DE MARACUYA(VASO GRANDE) 1.00 ");
                        
                    }
                       
                    System.out.println("Su orden fue completada con éxito y la misma sera enviada  a su domicilio a la hora:");
                        System.out.println (fecha);
                 
                        
                       } 
           
                   
                   
                   case 4 ->  {
                        
                       boolean salir = true;
                       
                       {
}
                       
                       
         }
   
                   default -> System.out.println("Solo numeros entre 1 y 4");     
   } 
                 
               }             		
			
	} 