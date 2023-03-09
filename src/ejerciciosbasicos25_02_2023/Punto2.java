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
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num=0;
        
        System.out.println("Ingrese un numero");
        num=teclado.nextDouble();
        
        num=num%2;
        
        if(num==0){
            System.out.println("El numero digitado es par");
        }else{
            System.out.println("El numero digitado es impar");
            
        }
        
    }
    
}
