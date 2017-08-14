package actividad_patrones_basicos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Simulación de creación y eliminación de clientes
 * @author jrudasc
 */

public class Index {
   
    public static void main(String[] arg) {
        
        ArrayList <Cuenta> listacuenta = new ArrayList<>();
        listacuenta.add(new Ahorro(1001,"Cuente Ahorro",250000, 12));
        listacuenta.add(new Ahorro(1002,"Cuenta Ahorro",550000,11));
        listacuenta.add(new Corriente(1101,"Cuenta Corriente",150000,10));
        listacuenta.add(new Corriente(1102,"Cuenta Corriente",350000,13));
        listacuenta.add(new Cheque(1201,"Cuenta Corriente",550000,14));
        listacuenta.add(new Cheque(1202,"Cuenta Corriente",50000,18));

        ManejadorCliente manejadorCliente = new ManejadorCliente();

        Cliente cliente1 = new Cliente("Jorge", "Rudas", 46468465, 546463 , new ArrayList <Cuenta>());
        //Cliente cliente2 = new Cliente("Alberto", "Arias", 5458, 8469876, new ArrayList((Collection) new Ahorro(100,550000)));
        
      
        
        //manejadorCliente.guardar(cliente1);
        //manejadorCliente.guardar(cliente2);
        
        manejadorCliente.eliminar(cliente1);
    }
}
