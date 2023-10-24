
package calculadora;
import java.util.Scanner;

public class Calculadora {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
         while(true){
             double []numeros ={20.5, 40.6,78.4,94.7,55.3,22.6,84.3};
         
        System.out.println("Calculadora");
        System.out.println("Elije la opcion que requieres hacer");
        System.out.println("1. Sumar");
        System.out.println("2.Multiplicar");
       
       
      
       int opcion = scanner.nextInt();
       
       switch (opcion){
           
       case 1:
           double S=0;
           System.out.println("Elegiste Sumar");
           
       for (int i=0; i<numeros.length; i++){
           S=S+numeros[i];}
           System.out.println("Total es:" + S);
           break;
          
       case 2:
           double M=0;
           System.out.println("Elegiste Multiplicar");
           
        for (int i=0; i<numeros.length; i++){
            M=M*numeros[i];}
           System.out.println("Total eds:" + M);
        break;   
       default:
           System.out.println("Elige opcion");
        
        
    }
         }
    }
}