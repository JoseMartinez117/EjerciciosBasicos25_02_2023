/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbasicos25_02_2023;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Punto12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tiempo=0, dia=0, turno=0, valor=0, cent=0;
        double total=0;
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("Ingrese el dia en el que se realizo la llamada");
        System.out.println("1->Lunes");
        System.out.println("2->Martes");
        System.out.println("3->Miercoles");
        System.out.println("4->Jueves");
        System.out.println("5->Viernes");
        System.out.println("6->Sabado");
        System.out.println("7->Domingo");
        dia=teclado.nextInt();
        
        if(dia==7){
            System.out.println("\nCuanto tiempo duro la llamada?");
            System.out.println("Por favor ingresar los datos en MINUTOS");
            tiempo=teclado.nextInt();
                        
            if(tiempo<=5){
                valor=tiempo;
                total=valor;
                total=total-(total*0.03);
                System.out.println("\nLa llamada salio con el valor de "+total);    
                            
            }else if(tiempo>5 && tiempo<=8){
                valor=5;
                for(int i=5; i<tiempo; i++){
                    cent=cent+80;
                    while(cent>=100){
                         valor++;
                         cent=cent-100;
                    }
                }
                total=(valor*100)+cent;   
                total=(total-(total*0.03))/100;
                System.out.println("\nLa llamada salio con el valor de "+total);    
                                  
            }else if(tiempo>8 && tiempo<=10){
                valor=7;
                cent=40;
                for(int i=8; i<tiempo; i++){
                    cent=cent+70;
                    while(cent>=100){
                        valor++;
                        cent=cent-100;
                    }
                }
                            
                total=(valor*100)+cent; 
                total=(total-(total*0.03))/100;
                           
                System.out.println("\nLa llamada salio con el valor de "+total); 

                            
             }else if(tiempo>10){
                valor=8;
                cent=tiempo-10;
                cent=(cent*50)+80;
                            
                while(cent>=100){
                    valor++;
                    cent=cent-100;
                }
                            
                total=(valor*100)+cent; 
                total=(total-(total*0.03))/100;
                            
                System.out.println("\nLa llamada salio con el valor de "+df.format(total));
            }                      
            
        
        }else if(dia>=1 && dia<=7){
                System.out.println("\nEn que turno se realizo la llamada?");
                System.out.println("1->Maniana");
                System.out.println("2->Tarde");
                turno=teclado.nextInt();
                
                switch(turno){
                    case 1:
                        System.out.println("\nCuanto tiempo duro la llamada?");
                        System.out.println("Por favor ingresar los datos en MINUTOS");
                        tiempo=teclado.nextInt();
                        
                        if(tiempo<=5){
                            valor=tiempo;
                            total=valor;
                            total=total-(total*0.15);
                            System.out.println("\nLa llamada salio con el valor de "+total);    
                            
                        }else if(tiempo>5 && tiempo<=8){
                           valor=5;
                           for(int i=5; i<tiempo; i++){
                               cent=cent+80;
                               while(cent>=100){
                               valor++;
                               cent=cent-100;
                               }
                           }
                           total=(valor*100)+cent;   
                           total=(total-(total*0.15))/100;
                           System.out.println("\nLa llamada salio con el valor de "+total);    
                                  
                        }else if(tiempo>8 && tiempo<=10){
                            valor=7;
                            cent=40;
                            for(int i=8; i<tiempo; i++){
                               cent=cent+70;
                               while(cent>=100){
                               valor++;
                               cent=cent-100;
                               }
                           }
                            
                           total=(valor*100)+cent; 
                           total=(total-(total*0.15))/100;
                           
                           System.out.println("\nLa llamada salio con el valor de "+total); 

                            
                        }else if(tiempo>10){
                            valor=8;
                            cent=tiempo-10;
                            cent=(cent*50)+80;
                            
                            while(cent>=100){
                            valor++;
                            cent=cent-100;
                            }
                            
                           total=(valor*100)+cent; 
                           total=(total-(total*0.15))/100;
                            
                            System.out.println("\nLa llamada salio con el valor de "+df.format(total));
                        }           
                
                    case 2:
                        System.out.println("\nCuanto tiempo duro la llamada?");
                        System.out.println("Por favor ingresar los datos en MINUTOS");
                        tiempo=teclado.nextInt();
                        
                        if(tiempo<=5){
                            valor=tiempo;
                            total=valor;
                            total=total-(total*0.10);
                            System.out.println("\nLa llamada salio con el valor de "+total);    
                            
                        }else if(tiempo>5 && tiempo<=8){
                           valor=5;
                           for(int i=5; i<tiempo; i++){
                               cent=cent+80;
                               while(cent>=100){
                               valor++;
                               cent=cent-100;
                               }
                           }
                           total=(valor*100)+cent;   
                           total=(total-(total*0.10))/100;
                           System.out.println("\nLa llamada salio con el valor de "+total);    
                                  
                        }else if(tiempo>8 && tiempo<=10){
                            valor=7;
                            cent=40;
                            for(int i=8; i<tiempo; i++){
                               cent=cent+70;
                               while(cent>=100){
                               valor++;
                               cent=cent-100;
                               }
                           }
                            
                           total=(valor*100)+cent; 
                           total=(total-(total*0.10))/100;
                           
                           System.out.println("\nLa llamada salio con el valor de "+total); 

                            
                        }else if(tiempo>10){
                            valor=8;
                            cent=tiempo-10;
                            cent=(cent*50)+80;
                            
                            while(cent>=100){
                            valor++;
                            cent=cent-100;
                            }
                            
                           total=(valor*100)+cent; 
                           total=(total-(total*0.10))/100;
                            
                            System.out.println("\nLa llamada salio con el valor de "+df.format(total));
                        }                                   
                
                
                
                }
                
                
                
                
                
                
                
        }else{
                System.out.println("No se ingreso de manera correcta el dia");
            }
    
}
}