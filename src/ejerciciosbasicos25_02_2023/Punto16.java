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
public class Punto16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int pais=0, peso=0, euro=0;
       double total=0;
       
        System.out.println("Destino del paquete?");
        System.out.println("1->America del norte");
        System.out.println("2->America central");
        System.out.println("3->America del sur");
        System.out.println("4->Europa");
        System.out.println("5->Asia");
        pais=teclado.nextInt();
        
        switch(pais){
            case 1:
                euro=2400;
                System.out.println("\nCual es el peso del paquete?");
                System.out.println("Recuerde que el peso no puede ser superior a 5KG");
                peso=teclado.nextInt();
                if(peso<5){
                total=peso*euro;
                }else{
                    System.out.println("\nLo sentimos no podemos transportar el paquete");
                }
                System.out.println("\nEl costo total es "+total);
                break;
            case 2:
                euro=2000;
                System.out.println("\nCual es el peso del paquete?");
                System.out.println("Recuerde que el peso no puede ser superior a 5KG");
                peso=teclado.nextInt();
                if(peso<5){
                total=peso*euro;
                }else{
                    System.out.println("\nLo sentimos no podemos transportar el paquete");
                }
                System.out.println("\nEl costo total es "+total);                
                break;
            case 3:
                euro=2100;
                System.out.println("\nCual es el peso del paquete?");
                System.out.println("Recuerde que el peso no puede ser superior a 5KG");
                peso=teclado.nextInt();
                if(peso<5){
                total=peso*euro;
                }else{
                    System.out.println("\nLo sentimos no podemos transportar el paquete");
                }
                System.out.println("\nEl costo total es "+total);                
                break;
            case 4:
                euro=1000;
                System.out.println("\nCual es el peso del paquete?");
                System.out.println("Recuerde que el peso no puede ser superior a 5KG");
                peso=teclado.nextInt();
                if(peso<5){
                total=peso*euro;
                }else{
                    System.out.println("\nLo sentimos no podemos transportar el paquete");
                }
                System.out.println("\nEl costo total es "+total);                
                break;
            case 5:
                euro=1800;
                 System.out.println("\nCual es el peso del paquete?");
                System.out.println("Recuerde que el peso no puede ser superior a 5KG");
                peso=teclado.nextInt();
                if(peso<5){
                total=peso*euro;
                }else{
                    System.out.println("\nLo sentimos no podemos transportar el paquete");
                }
                System.out.println("\nEl costo total es "+total);               
                break;
            default:
                System.out.println("Dijito de manera erronea el pais");
            
                
        }
        
        
       
       
       
    }
    
}
