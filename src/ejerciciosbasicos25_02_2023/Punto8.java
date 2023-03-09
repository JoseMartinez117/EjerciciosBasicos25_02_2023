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
public class Punto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double l=0, l2=0, l3=0;
        
        System.out.println("Ingrese los 3 lados del triangulo");
        System.out.print("Lado 1: ");
        l=teclado.nextDouble();
        System.out.print("Lado 2: ");
        l2=teclado.nextDouble();
        System.out.print("Lado 3: ");
        l3=teclado.nextDouble();     
        
        if(l3==(l+l2)){
            System.out.println("Es un triangulo rectangulo");
        }else if(l==l2 && l==l3 && l2==l3){
            System.out.println("Es un triangulo equilatero");
            
        }else if (l!=l2 && l!=l3 && l2!=l3){
            System.out.println("Es un triangulo escaleno");
        
        }else{
            System.out.println("Es un trangulo isoceles");
        }
        
        
        
        
        
    }
    
}
