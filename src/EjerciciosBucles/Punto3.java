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
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in).useDelimiter("[^A-Za-z]");
        String letra;
        boolean infinito= true;
        
        System.out.println("Por favor solo digitar letras");
        System.out.println("Para salir del programa digite espacio y luego enter");
        
        while(infinito==true){
            
            System.out.println("\nIngrese una letra");
            letra=teclado.next();
            letra=letra.toUpperCase();
            
            
            if(letra.equals("")){
                break;
            }
            
            if (letra.compareTo("A")==0 || letra.compareTo("E")==0 || letra.compareTo("I")==0 || letra.compareTo("O")==0 || letra.compareTo("U")==0){
                System.out.println("vocal");
            }else{
                System.out.println("No vocal");
            }
           
             
            
        }
        
        
    }
    
}
