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
public class Punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base=0, exponente=0, total=1;
        
        System.out.println("Digite");
        System.out.print("Base: ");
        base=teclado.nextInt();
        
        do{
            System.out.print("Exponente: ");
            exponente=teclado.nextInt();
            
            if(exponente<0){
                System.out.println("\nDigite un exponente positivo mayor");
            }
            if(exponente==0){
                System.out.println("El resultado es 1");
                System.exit(0);
            }
        }while(exponente<0);
        
        
        for(int i=0; i<exponente; i++){
           total=total*base;
            
        }
        System.out.println("El resultado de la potencia es"+total);
        
        
        
    }
    
}
