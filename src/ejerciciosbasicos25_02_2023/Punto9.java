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
public class Punto9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         int year=0;
         
         System.out.println("Digite el anio");
         year=teclado.nextInt();
         
         if(year%4==0){
             System.out.println("El anio "+year+" fue un anio bisiesto");
         }else{
             System.out.println("El anio que digito no es bisiesto");
         }
            
         
         
    }
    
}
