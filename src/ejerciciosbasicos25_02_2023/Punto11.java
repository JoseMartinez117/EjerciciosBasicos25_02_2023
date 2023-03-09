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
public class Punto11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int est=0, costo=0;
        
        System.out.println("Cuantos estudiantes van a viajar? ");
        est=teclado.nextInt();
        
        if(est>=100){
            costo=est*65;
            System.out.println("El costo del viaje sera "+costo+"\ny el estudiante debera pagar 65 euros");
        }else if(est>=50 && est<=90){
            costo=est*70;
            System.out.println("El costo del viaje sera "+costo+"\ny el estudiante debera pagar 70 euros");
        }else if(est>=30 && est<=49){
            costo=est*95;
            System.out.println("El costo del viaje sera "+costo+"\ny el estudiante debera pagar 95 euros");
        }else if(est<30 && est>0){
            costo=est*4000;
            System.out.println("El costo del viaje sera "+costo+"\ny el estudiante debera pagar 4000 euros");
        }else{
            System.out.println("Ningun alumno ira de viaje");
        }
                
                
                
                
        
        
        
    }
    
}
