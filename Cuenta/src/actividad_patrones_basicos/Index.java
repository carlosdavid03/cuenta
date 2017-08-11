package actividad_patrones_basicos;

import java.util.ArrayList;
import java.util.List;

/**
 * Simulación de creación y eliminación de clientes
 * @author jrudasc
 */

public class Index {
   
    public static void main(String[] arg) {

        ManejadorCliente manejadorCliente = new ManejadorCliente();

        Cliente cliente1 = new Cliente("Jorge", "Rudas", 46468465, 546463);
        
        Cliente cliente2 = new Cliente("Alberto", "Arias", 5458, 8469876);
        
        List <Cuenta> listacuenta = new ArrayList<>();
        listacuenta.add(new Ahorro(00125,250000));
        
        //manejadorCliente.guardar(cliente1);
        //manejadorCliente.guardar(cliente2);
        
        manejadorCliente.eliminar(cliente2);
    }
}
