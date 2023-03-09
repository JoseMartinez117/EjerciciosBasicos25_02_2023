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
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String a;
        
        System.out.println("Ingrese una letra: ");
        a=teclado.next();
        
        if(a.length()!=1){
            System.out.println("digitaste una palabra no una letra");
        }else if(a.compareTo("A")>=0 && a.compareTo("Z")<=0){
            System.out.println("La letra Es mayuscula");
        }else{
            System.out.println("La letra no es mayuscula");
        }
        
        
        
        
    }
    
}
