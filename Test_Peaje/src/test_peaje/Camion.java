/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_peaje;

/**
 *
 * @author ignac
 */

public class Camion extends Vehiculo{
    private int n_ejes;
    
    public Camion(String placa, int n_ejes){
        super(placa);
        this.n_ejes = n_ejes;
    }
    
    public int getNumeroEjes(){
        return this.n_ejes;
    }
    public void setNumeroEjes(int new_ejes){
        this.n_ejes = new_ejes;
    }
    @Override
    public int calcularPeaje(){
        return 5000 * this.n_ejes;
    }
    
}

