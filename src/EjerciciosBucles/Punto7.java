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
public class Punto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costo=0, meses=0;
        
        System.out.println("Digite el valor de la compra");
        costo=teclado.nextDouble();
        System.out.println("Digite la cantidad de meses");
        meses=teclado.nextDouble();
        
        for(int i=1; i<meses; i++){
            costo=costo*2;
        
        }
        System.out.println("Usted tendra que pagar un total de "+costo+" euros en el mes "+meses);
        
        
    }
    
}
