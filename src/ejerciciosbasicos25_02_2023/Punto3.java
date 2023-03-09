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
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       double num1=0, num2=0, resul=0;
       
        System.out.println("Ingrese los 2 numeros para dividir en este orden A/B");
        System.out.print("A: ");
        num1=teclado.nextDouble();
        System.out.print("B: ");
        num2=teclado.nextDouble();
        
        if(num2==0){
            System.out.println("MATH ERROR");
        }else{
        
        resul=num1/num2;
        
        System.out.println("EL resultado es: "+resul);
        
        }
    }
    
}
