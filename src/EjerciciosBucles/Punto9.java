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
public class Punto9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num=0, dividiendo=2, divisor=1, cont=0;
        
        System.out.print("Digite un numero: ");
        num=teclado.nextInt();
        
        while(dividiendo<=num){
            while(divisor<=dividiendo){
                if(dividiendo%divisor==0){
                    cont++;
                }
                divisor++;
            }
            if(cont==2){
                System.out.println(dividiendo);
            
            }
            dividiendo++;
            divisor=1;
            cont=0;
            
        }
            
        
        
        
    }
    
}
