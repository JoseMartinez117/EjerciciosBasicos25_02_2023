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
public class EjerciciosBasicos25_02_2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double num=0, num1=0;
        
        System.out.println("Ingrese los dos numeros a comparar: ");
        System.out.print("#1: ");
        num=teclado.nextDouble();
        System.out.print("#2: ");
        num1=teclado.nextDouble();
        
        if(num>num1){
            System.out.println(num+" es mayor que "+num1);
            
        }else if(num<num1){
            System.out.println(num1+" es mayor que "+num);
            
        }else if(num==num1){
            System.out.println("los numeros son iguales");
        }
        
        
        
        
    }
    
}
