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
public class Punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad=0;
        float nota=0;
        String sexo;
        
        System.out.println("Ingrese los datos: ");
        System.out.print("Edad: ");
        edad=teclado.nextInt();
        System.out.print("Nota: ");
        nota=teclado.nextFloat();
        System.out.println("Por favor escriga F para Femenino o M para Masculino");
        sexo=teclado.next();
        sexo=sexo.toUpperCase();
        
        
        
        if(sexo.length()!=1){
            System.out.println("Digito de manera erronea el genero");
            System.exit(0);
        }else if(sexo.compareTo("F")==0 && sexo.compareTo("M")==0){
           
            System.out.println("Digito de manera erronea la letra");
            
        }else{
        
            
            switch((String)sexo){
                case "F":
                    if(nota<5 && edad<18){
                        System.out.println("No fuiste aceptada");
                    }else if(nota>=5 && edad>=18){
                        System.out.println("Felicidades cumples con los estandares de la empresa :D");
                    }else{
                        System.out.println("No cumples con los estandares de la emprea");
                    }
                    break;
                    
                case "M":
                    
                    if(sexo.compareTo("F")==0){
                        System.out.println("");
                    }else{
                        if(nota<5 && edad<18){
                            System.out.println("No fuiste aceptado");
                        }else if (nota>=5 && edad>=18){
                            System.out.println("Felicidades entras a la lista de esperar, te llamaremos pronto :D");
                        }else{
                            System.out.println("No cumples con los estandares de la empresa");
                        }
                    }
                    break;
            }
        }
        
        
    }
    
}
