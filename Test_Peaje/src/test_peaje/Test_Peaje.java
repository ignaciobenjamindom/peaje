/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test_peaje;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author ignac
 */
public class Test_Peaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        String separar = "ICCI";
        String texto = separar.repeat(10);       
        Peaje miPeaje = new Peaje();
        
        
        
        
        do{
            try {
                
                System.out.println(texto);
                System.out.println("Menu principal: Ingresa un numero para elejir");
                System.out.println(texto);
                System.out.println("1) Auto: 10000");
                System.out.println("2) Moto: 5000");
                System.out.println("3) Camion: 5000 por numero de ejes");
                System.out.println("4) Finalizar");
                System.out.println(texto);
                int num = teclado.nextInt();
            
                teclado.nextLine(); 
                
                if(num == 4){
                    
                    break;
                    
                }
                if(num == 1){
                    
                    
                    System.out.print("Ingrese la placa del auto: ");
                    String patenteCarro = teclado.nextLine();
                    
                    Carro registro_auto = new Carro(patenteCarro);
                    
                    miPeaje.registrarVehiculo(registro_auto);
                    
                    System.out.println("¡Listo, se registro perfectamente el auto!");
                    
                }
                if(num == 2){
                    System.out.print("Ingrese la placa de la moto: ");
                    String patenteCarro = teclado.nextLine();
                    
                    Moto registro_moto = new Moto(patenteCarro);
                    
                    miPeaje.registrarVehiculo(registro_moto);
                    
                    System.out.println("¡Listo, se registro perfectamente la moto!");
      
                }
                if(num == 3){
                    System.out.print("Ingrese la placa del camion: ");
                    String patenteCamion = teclado.nextLine();
                    
                    System.out.print("Ingrese los ejes del camion: ");
                    int n_ejes = teclado.nextInt();
                    teclado.nextLine();
                    
                    Camion registro_Camion = new Camion (patenteCamion,n_ejes);
                   
                    miPeaje.registrarVehiculo(registro_Camion);
                    System.out.println("¡Listo, se registro perfectamente el camion!");
                    
                }
                
            }
            catch (Exception e){
                System.out.println("debes escoger un numero");
                teclado.nextLine();

                
            }
            
        }while(true);
        miPeaje.mostrarReporte();
    }
     
}
