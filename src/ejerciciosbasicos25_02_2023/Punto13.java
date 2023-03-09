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
public class Punto13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         int num=0;
         
         System.out.println("Digite un numero del 1 al 6");
         num=teclado.nextInt();
         
         if(num<1 || num>6){
             System.out.println("ERROR: numero incorrecto");
             System.exit(0);
         }
         
         switch(num){
             case 1:
                 System.out.println("Seis");
             case 2:
                 System.out.println("Cinco");
             case 3:
                 System.out.println("Cuatro");         
             case 4:
                 System.out.println("Tres");
             case 5:
                 System.out.println("Dos");
             case 6:
                 System.out.println("Uno");
         }
    }
    
}
