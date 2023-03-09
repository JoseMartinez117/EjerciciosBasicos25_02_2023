/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosBucles;

/**
 *
 * @author josem
 */
public class Punto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       
        int hora=0, minuto=0, segundo=0;
        boolean infinito=true;
        
        while(infinito==true){
            minuto=0;
            
            while(minuto<60){
                segundo=0;
                
                while(segundo<60){
                    Thread.sleep(1*1000);
                    segundo++;
                    System.out.println(hora+" : "+minuto+" : "+segundo);
                }
                minuto++;
            }
            hora++;
        }
        
        
        
        
    }
    
}
