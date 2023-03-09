/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbasicos25_02_2023;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double base=0, exponente=0, resul=0;
        
        System.out.println("Digite la base y el exponente");
        System.out.print("Base: ");
        base=teclado.nextDouble();
        System.out.print("Exponente: ");
        exponente=teclado.nextDouble();
        
        if(exponente==0){
            System.out.println("El resultado es 1");
            
        }else if(exponente<0){
            exponente=exponente*-1;
            resul=1/(Math.pow(base, exponente));
            System.out.println("El resultado de la operacion con el exponente -"+exponente+ " es "+resul);
        }else{
           resul=Math.pow(base, exponente);
            System.out.println("El resultado de la operacion con el exponente "+exponente+ " es "+resul);
        }
        
        
    }
    
}
