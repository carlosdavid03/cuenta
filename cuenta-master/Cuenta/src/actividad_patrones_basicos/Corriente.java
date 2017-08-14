/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_patrones_basicos;

import java.util.Scanner;

/**
 *
 * @author Fuller 101
 */
public class Corriente extends Cuenta {
    
    private int id_corriente;
    private String nom_corriente;

    public Corriente(int id_corriente, String nom_corriente, int cantidap, int id_transacion) {
        super(cantidap, id_transacion);
        this.id_corriente = id_corriente;
        this.nom_corriente = nom_corriente;
    }

    public int getId_corriente() {
        return id_corriente;
    }

    public void setId_corriente(int id_corriente) {
        this.id_corriente = id_corriente;
    }

    public String getNom_corriente() {
        return nom_corriente;
    }

    public void setNom_corriente(String nom_corriente) {
        this.nom_corriente = nom_corriente;
    }

    public int getCantidap() {
        return cantidap;
    }

    public void setCantidap(int cantidap) {
        this.cantidap = cantidap;
    }

    
    @Override
    public void depositar(){
        
       int total= cantidap;
        total=cantidap+total;
        
        System.out.println("El total en la cuenta es:" + total);
        
    }

    @Override
    public void retirar(){
         
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Escriba el valor que va a retirar: ");

        double total;
        total = cantidap;
        double valor_retiro = teclado.nextInt();
        total=valor_retiro-total;
        
        System.out.println("El total en la cuenta es: " + total);
          
    }
    public void consultar_saldo(){
           
    }
    
}
