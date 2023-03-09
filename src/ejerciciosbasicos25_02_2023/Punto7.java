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
public class Punto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       double x=0, x1=0, y=0, y1=0, r1=0, r2=0, d=0;
       
        System.out.println("Digite los puntos centrales y el radio de la primera circunferencia y");
        System.out.print("X: ");
        x=teclado.nextDouble();
        System.out.print("Y: ");
        x=teclado.nextDouble();
        System.out.print("R: ");
        r1=teclado.nextDouble();
        
        System.out.println("Digite los puntos centrales y el radio de las segunda circunferencia");
        System.out.print("X1: ");
        x1=teclado.nextDouble();
        System.out.print("Y1: ");
        y1=teclado.nextDouble();
        System.out.print("R: ");
        r2=teclado.nextDouble();
        
        d=Math.sqrt((Math.pow((x-x1), 2))+(Math.pow((y-y1), 2)));
        
        System.out.println("////////////////////////////////////////////////////////////////////");
        if(d>(r1+r2)){
            System.out.println("\nExteriores");
        }
        
        if(d==(r1+r2)){
            System.out.println("\nTangentes Exteriores");
        }
        
         if(d<(r1+r2)&& d>(r1-r2)){
            System.out.println("\nSecantes");
        }       
         
        if(d>0 && d<(r1-r2)){
            System.out.println("\nInteriores");
        
        }
        
        if(d==(r1+r2)){
            System.out.println("\nTangentes interiores");
        }
        
        if(d==0){
            System.out.println("\nConcentricas");
        }
        
    }
    
}
