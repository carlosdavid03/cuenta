package actividad_patrones_basicos;


import java.util.List;

/**
 * Esta clase encapsula las propiedades y comportamientos de un cliente
 * @author jrudascas
 */
public class Cliente {

    public Cliente(){
    }
    private String nombres;
    private String apellidos;
    private int cedula;
    private int saldoCuentaAhorros;
    List <Cuenta> cantidap;
    

    public Cliente(String nombres, String apellidos, int cedula, int saldoCuentaAhorros, List<Cuenta> cantidap) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.saldoCuentaAhorros = saldoCuentaAhorros;
        this.cantidap = cantidap;
    }

 
   
    /**
     * Este metodo permite realizar un debito sobre el saldo de su cuenta
     * @param monto Monto a debitar
     */
    
   public void retirarDineroCA(int monto) {
        saldoCuentaAhorros = saldoCuentaAhorros - monto;
    }

    public String toString() {
        //return nombres + " " + apellidos;
        return String.format("%030d;%30s;%30s;%030d", cedula, nombres, apellidos, saldoCuentaAhorros);
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public int getSaldoCuentaAhorros() {
        return saldoCuentaAhorros;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setSaldoCuentaAhorros(int saldoCuentaAhorros) {
        this.saldoCuentaAhorros = saldoCuentaAhorros;
    }
}