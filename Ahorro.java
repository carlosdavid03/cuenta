/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_patrones_basicos;
import java. util. Scanner;
/**
 *
 * @author Fuller 101
 */
public class Ahorro extends Cuenta {
    
    private int id_ahorro;
    private String nom_ahorro;

    public Ahorro(int id_ahorro, String nom_ahorro, int cantidap, int id_transacion) {
        super(cantidap, id_transacion);
        this.id_ahorro = id_ahorro;
        this.nom_ahorro = nom_ahorro;
    }

    public int getId_ahorro() {
        return id_ahorro;
    }

    public void setId_ahorro(int id_ahorro) {
        this.id_ahorro = id_ahorro;
    }

    public String getNom_ahorro() {
        return nom_ahorro;
    }

    public void setNom_ahorro(String nom_ahorro) {
        this.nom_ahorro = nom_ahorro;
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
        total=total-valor_retiro;
        
        System.out.println("El total en la cuenta es: " + total);
          
    }
    
}
