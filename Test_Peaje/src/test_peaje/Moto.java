/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_peaje;

/**
 *
 * @author ignac
 */
public class Moto extends Vehiculo{
    public Moto(String placa){
        super(placa);
    }
    @Override
    public int calcularPeaje(){
        return 5000;
    }
    
}
