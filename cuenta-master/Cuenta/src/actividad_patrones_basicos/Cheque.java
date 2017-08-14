/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_patrones_basicos;

import java.util.Scanner;

/**
 *
 * @author Sala 8
 */
public class Cheque extends Cuenta{
    
    private int id_cheque;
    private String nom_cheque;

    public Cheque(int id_cheque, String nom_cheque, int cantidap, int id_transacion) {
        super(cantidap, id_transacion);
        this.id_cheque = id_cheque;
        this.nom_cheque = nom_cheque;
    }

    public int getId_cheque() {
        return id_cheque;
    }

    public void setId_cheque(int id_cheque) {
        this.id_cheque = id_cheque;
    }

    public String getNom_cheque() {
        return nom_cheque;
    }

    public void setNom_cheque(String nom_cheque) {
        this.nom_cheque = nom_cheque;
    }


    @Override
    public int getCantidap() {
        return cantidap;
    }

    @Override
    public void setCantidap(int cantidap) {
        this.cantidap = cantidap;
    }

   @Override
    public void retirar(){
         
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Escriba el valor que va a retirar: ");

        double total;
        total = cantidap;
        double valor_retiro = teclado.nextInt();
        total=total-valor_retiro;
        
        System.out.println("El total en la cuenta es: " + total);
          
    }
    
    
    
    
}
