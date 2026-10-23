/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_peaje;

/**
 *
 * @author ignac
 */
 public class Carro extends Vehiculo {
    public Carro(String placa){
        super(placa);
    }
    
    @Override
    public int calcularPeaje(){
        return 10000;
    }
 }