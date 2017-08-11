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
public class Corriente extends Cuenta {
    
    public int id_corriente;

    public Corriente(int id_corriente, int cantidap) {
        super(cantidap);
        this.id_corriente = id_corriente;
    }

    public int getId_corriente() {
        return id_corriente;
    }

    public void setId_corriente(int id_corriente) {
        this.id_corriente = id_corriente;
    }
    
    
}
