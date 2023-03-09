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
public class Punto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         double base=0, tipo=0, tam=0;
         String venta;
         
         System.out.println("Digite el precio base del kilo de uva");
         base=teclado.nextDouble();
         
         System.out.println("Que tipo de uva se vendera? A o B?");
         venta=teclado.next();
         venta=venta.toUpperCase();
         
         
         switch ((String)venta) {
         
             case"A":
                 System.out.println("de que tamanio son las uvas?");
                 System.out.println("1->Tipo 1");
                 System.out.println("2->Tipo 2");
                 tam=teclado.nextDouble();
                 
                 if(tam==1){
                     System.out.println("Cuantas se vendieron? ");
                     tipo=teclado.nextDouble();
                        while(tipo>=5){
                          base++;
                          tipo=tipo-5;
                        }                    
                    tipo=tipo*20;
                     System.out.println("La venta total sera "+base+" euros con "+tipo+" centavos"); 
                     
                 }else if(tam==2){
                     System.out.println("Cuantas se vendieron? ");
                     tipo=teclado.nextDouble();
                     tipo=tipo*30;
                     
                     while(tipo>=100){
                     base++;
                     tipo=tipo-100;
                     }
                     System.out.println("La venta total sera "+base+" euros con "+tipo+" centavos"); 
                 }
                 break;
             case "B":
                 System.out.println("de que tamanio son las uvas?");
                 System.out.println("1->Tipo 1");
                 System.out.println("2->Tipo 2");
                 tam=teclado.nextDouble();
                 
                 if(tam==1){
                     System.out.println("Cuantas se vendieron? ");
                     tipo=teclado.nextDouble();
                     tipo=tipo*30;
                     
                     while(tipo>=100){
                     base--;
                     tipo=tipo-100;
                     }
                     System.out.println("La venta total sera "+base+" euros con "+tipo+" centavos"); 
                     
                 }else if(tam==2){
                    System.out.println("Cuantas se vendieron? ");
                     tipo=teclado.nextDouble();
                     tipo=tipo*50;
                     
                     while(tipo>=100){
                     base--;
                     tipo=tipo-100;
                     }
                     System.out.println("La venta total sera "+base+" euros con "+tipo+" centavos");
                 }    
                 break;
         }
         
         
         
         
    }
    
}
