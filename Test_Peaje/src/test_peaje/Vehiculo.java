/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_peaje;

/**
 *
 * @author ignac
 */
    public abstract class Vehiculo {

    private String placa;
    
    

    public Vehiculo(String placa){
        this.placa = placa;
    }
    
 
    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placanew){
        this.placa = placanew;
    }
    

    public abstract int calcularPeaje();
}
