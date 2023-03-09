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
public class Punto15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num=0;
        
        System.out.println("Digite un numero del 1 al 12");
        num=teclado.nextInt();

    switch(num){ 
       case 1:
           System.out.println("Enero");
           System.out.println("31 dias");
           break;
       case 2:
           System.out.println("Febrero");
           System.out.println("28 dias");
           break;
       case 3:
           System.out.println("Marzo");
           System.out.println("31 dias");
           break;
       case 4: 
           System.out.println("Abril");
           System.out.println("30 dias");
           break;
       case 5:
           System.out.println("Mayo");
           System.out.println("31 dias");
           break;
       case 6:
           System.out.println("Junio");
           System.out.println("30 dias");
           break;
       case 7:
           System.out.println("Julio");
           System.out.println("31 dias");
           break;
       case 8:
           System.out.println("Agosto");
           System.out.println("31 dias");
           break;
       case 9:
           System.out.println("Septiembre");
           System.out.println("30 dias");
           break;
       case 10:
           System.out.println("Octubre");
           System.out.println("31 dias");
           break;
       case 11:
           System.out.println("Noviembre");
           System.out.println("30 dias");
           break;
       case 12:
           System.out.println("Diciembre");
           System.out.println("31 dias");
           break;
       default:
           System.out.println("Error");
           break;
       
       }
    
}
}