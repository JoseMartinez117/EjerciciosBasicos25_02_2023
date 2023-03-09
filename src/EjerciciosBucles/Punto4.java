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
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int x=0, y=0;
        
        System.out.println("Ingrese dos numeros");
        System.out.print("#1: ");
        x=teclado.nextInt();
        System.out.print("#2: ");
        y=teclado.nextInt();
        
        
        if((x%2)!=0){
            x++;
            
        } 
        
        for(int i=x; i<=y; i=i+2){
            System.out.println(i);
        
        }
        
        
    }
    
}
