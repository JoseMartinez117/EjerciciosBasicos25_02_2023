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
public class Punto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x=0, espaciob=0, i=0, fila, j=0;
        
        
        System.out.println("Digite el limite del triangulo de pascal");
        x=teclado.nextInt();
        
        System.out.println("//////////////////////////////////////////");
        
        for(fila=0; fila<=x; fila++){
         espaciob=x-fila;
         
            for(i=0; i<=espaciob; i++){
                System.out.print(" ");  // "    "
                
            }
            
            for(j=1; j<fila;j++){
                System.out.print(j);
            }
            
            for(int h=fila; h>=1; h--){
                System.out.print(h);
            
            }
            
            System.out.println("");

            
            
       
         
        }

        
        

                
        
        
        
    }
    
}
