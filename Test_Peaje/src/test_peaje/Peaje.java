/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_peaje;

/**
 *
 * @author ignac
 */
import java.util.ArrayList; 

public class Peaje {
    private int totalPeaje;
    private ArrayList<Vehiculo> listaVehiculos; 


    public Peaje() {
   
        this.totalPeaje = 0; 
        this.listaVehiculos = new ArrayList<>();
    }

   
    public void registrarVehiculo(Vehiculo autop) {
      
        this.listaVehiculos.add(autop);
        
     
        int valorPagar = autop.calcularPeaje();
        
     
        this.totalPeaje = valorPagar + totalPeaje;
    }


    public void mostrarReporte() {
        
        String ICCI = "ICCI ";
        String Texto = ICCI.repeat(10);
        System.out.println(Texto);
        System.out.println("ESTACIÓN DE PEAJE: La lizama");
        System.out.println("DEPARTAMENTO: Santander");
        System.out.println(Texto);
        System.out.println("LISTADO DE VEHÍCULOS QUE LLEGARON:");
        
     
        for (Vehiculo v : this.listaVehiculos) {
            System.out.println("- Placa: " + v.getPlaca() + " | Pago: $" + v.calcularPeaje());
        }
        
        System.out.println(Texto);
        System.out.println("TOTAL RECOLECTADO: $" + this.totalPeaje);
        System.out.println(Texto);
    }
}

/* 



*/