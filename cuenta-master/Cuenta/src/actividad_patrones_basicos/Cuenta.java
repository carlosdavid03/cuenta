/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_patrones_basicos;

/**
 *
 * @author Fuller 101
 */
public abstract class Cuenta extends Transaccion {
    
    public int cantidap;

    public Cuenta(int cantidap, int id_transacion) {
        super(id_transacion);
        this.cantidap = cantidap;
    }

    public int getCantidap() {
        return cantidap;
    }

    public void setCantidap(int cantidap) {
        this.cantidap = cantidap;
    }
    
    public void depositar(){   
        
    }
    public void retirar(){
          
    }
  
}
