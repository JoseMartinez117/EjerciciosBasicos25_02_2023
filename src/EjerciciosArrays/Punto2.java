/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Punto2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num[]= new int[10];
        
        System.out.println("Ingrese los 10 datos");
        
        for(int i=0; i<num.length; i++){           
            System.out.print("dato #"+(i+1)+": ");
            num[i]=teclado.nextInt();
        }
        
        Arrays.sort(num);
        System.out.println("///////////////////////////////////////");
        
       for(int i=0; i<num.length; i++){
           if(i==0){
               System.out.println(num[i]+" Minimo");
               continue;
           }
           
           if(i==9){
             System.out.println(num[i]+" Maximo");
             break;
           }
           
           System.out.println(num[i]);
           
           
           
       } 

        
        
        
        
    }
    
}
