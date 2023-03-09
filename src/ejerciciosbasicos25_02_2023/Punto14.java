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
public class Punto14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dia;
        
        System.out.println("Ingrese el dia en el que se realizo la llamada");
        System.out.println("1->Lunes");
        System.out.println("2->Martes");
        System.out.println("3->Miercoles");
        System.out.println("4->Jueves");
        System.out.println("5->Viernes");
        System.out.println("6->Sabado");
        System.out.println("7->Domingo");
        dia=teclado.next();
        
        
        switch ((String)dia){
            case "1":
                System.out.println("Lunes");
                break;
        
            case "2":
                System.out.println("Martes");
                break;
            case "3":
                System.out.println("Miercoles");
                break;
            case "4":
                System.out.println("Jueves");
                break;
            case "5":
                System.out.println("Viernes");
                break;                
            case "6":
                System.out.println("Sabado");
                break;
            case "7":
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error");
                break;
                
        }
    }
    
}
