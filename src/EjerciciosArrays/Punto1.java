/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad=0;
        
        System.out.println("Ingrese la cantidad del vector");
        cantidad=teclado.nextInt();
        int num[]= new int[cantidad];
        
        System.out.println("Ingrese dato");
        for(int i=0; i<cantidad; i++){
            
            System.out.print("dato #"+(i+1)+": ");
            num[i]=teclado.nextInt();
        }
        
        System.out.println("Los datos ingresados, puestos desde el final al inicio");
        for(int i=(cantidad-1); i>=0; i--){
            
            System.out.println(num[i]);
        }
       
    }
    
}
