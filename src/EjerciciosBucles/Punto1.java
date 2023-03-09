/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       int numero=0, random=0, cont=0;
       
       random=(int) (Math.random()*100+1);
       
        System.out.print("Intenta adivinar el numero del 1 al 100");
        
        System.out.println(random);
       
       do{
           cont++;
           System.out.println("\nDigite un numero");
           numero=teclado.nextInt();
           
           if(numero!=random){
               System.out.println("\nNop ese no es el numero :b");
               
               if(numero<random){
                   System.out.println("El numero que tratas de adivinar es mas grande");
               }
               
               if(numero>random){
                   System.out.println("El numero que tratas de adivinar es mas pequenio");
               }
               System.out.println("Te quedan "+(10-cont)+" intentos");
           }else{
               System.out.println("Ding Ding Ding tenemos un ganador!! felicidades el numero es correcto");
               System.out.println("Te tomo "+cont+" intentos para acertar");
               System.exit(0);
           }
           
        }while(cont!=10);
        System.out.println("\nLastima se te han acabado los intentos, el numero correcto era "+random+" suerte para la proxima!!");
        
    }
    
}
