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
public class Ahorro extends Cuenta {
    
    private int id_ahorro;

    public Ahorro(int id_ahorro, int cantidap) {
        super(cantidap);
        this.id_ahorro = id_ahorro;
    }

    public int getId_ahorro() {
        return id_ahorro;
    }

    public void setId_ahorro(int id_ahorro) {
        this.id_ahorro = id_ahorro;
    }
    
    
    
    
}
