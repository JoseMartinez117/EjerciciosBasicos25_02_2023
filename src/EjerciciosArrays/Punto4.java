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
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][]=new int[4][5];
        int suma[]=new int[5];
        int sumac[]=new int[5];
        int total=0;
       
        
        
        for(int i=0; i<4; i++){
            System.out.println("Ingrese los valores de la fila #"+(i+1));
            for(int j=0; j<5; j++){
                int num = (int)(Math.random()*999+100);
                if(i==3 && j==4){
                    System.out.print("\nDato# "+(j+1)+" sera tomado como el resultado total de las sumas.");
                    break;
                    
                }
                    matriz[i][j]=num;
                    System.out.println("Dato# "+(j+1)+" es "+num);
                    
            }
        }
        System.out.println("");
        
                
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
            
            if(i==4){
            suma[i]=suma[i]+0;
            break;
            }    
                
            suma[i]=suma[i]+matriz[i][j];
            
            }
        }
        
        for(int j=0; j<5; j++){
            for(int i=0; i<4; i++){
            
            sumac[j]=sumac[j]+matriz[i][j];
            
            }
        }
        
        
        System.out.println("\nSuma total de las columnas");
        
        for(int u=0;u<5;u++){
            System.out.print("["+sumac[u]+"]");
        }
         System.out.println("");
         System.out.println("\nSuma total de las filas");
        for(int u=0; u<4; u++){
            System.out.println("["+suma[u]+"]");
        }
       
        
        for(int h=0; h<5; h++){
            
         total=total+(suma[h]+sumac[h]);   
        }
        
        matriz[3][4]=total;
        
        System.out.println("\nLa matriz organizada graficamente se ve asi");
        for(int[] i: matriz){
          for(int j: i){
              System.out.print("["+j+"]");
          
          }
            System.out.println("");
        }
        
        
        
        
    }
    
}
