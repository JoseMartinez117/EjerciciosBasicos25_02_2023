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
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double limitin=0, limitsu=0, total=0, cont=0, acum=0, num=0;
        boolean infinito =true;
        
        do{
            System.out.println("Digite los limites");
            System.out.print("Superior: ");
            limitsu=teclado.nextDouble();
            System.out.print("Inferior: ");
            limitin=teclado.nextDouble();
            
            if(limitin>limitsu){
                System.out.println("Ingrese bien los limites\n");
            }            
        }while(limitin>limitsu);
        
        while(infinito==true){
            
            System.out.print("\nDigite un numero: ");
            num=teclado.nextDouble();
            
            if(num==0){
                break;
            }          
            if(num>limitin && num<limitsu){
                total=total+num;
            }
            
            if(num<limitin || num>limitsu){
                cont++;
            }
        
            if(num==limitin || num==limitsu){
                acum++;
                System.out.println("Ese numero es el de un intervalo");
            }
        }
        
        System.out.println("La suma total de los numeros dentro de los limites es "+total);
        System.out.println("La cantidad de numeros digitados fuera de los limites fue de "+cont);
        System.out.println("La cantidad de veces que se digito un numero igual a un intervalo fue "+acum);
        
        
    }
    
}
