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
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int mayor=0, menor=0, same=0, cantidad=0;
        float  num=0;
        
        
        System.out.println("Digite la cantidad de numeros que desea ingresar");
        cantidad=teclado.nextInt();
        
        if(cantidad<=0){
            System.out.println("No puedes digitar esa cantidad");
            System.exit(0);
        }
        
        for(int i=0; i<cantidad; i++){
            System.out.print("Digite un numero: ");
            num=teclado.nextFloat();
            
            if(num>0){
                mayor++;
            }
            
            if(num<0){
                menor++;
            }
            
            if(num==0){
                same++;
            }
        }
    
        System.out.println("Hubo un total de ");
        System.out.println(mayor+" numeros mayores que 0");
        System.out.println(menor+" numeros menores que 0");
        System.out.println(same+" numeros iguales que 0");
    
    }
    
}
