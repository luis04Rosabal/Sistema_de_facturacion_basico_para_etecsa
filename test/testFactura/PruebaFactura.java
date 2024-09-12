package testFactura;

import etecsa.Etecsa;
import etecsa.Facturas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import junit.framework.Assert;
import org.junit.Test;

public class PruebaFactura {

  

    @Test
    public void testUpdateFactura() {
        //VARS
        double montoAntiguo = 0;
        double montoActualizado = 0;

        //INSTANCES
        Etecsa etc = new Etecsa();
        Date fechaEmision = new Date();
        Facturas factura2 = new Facturas("1010", "203", 20.56, fechaEmision);
        etc.addFactura(factura2);

        /*TOMAR VALOR DEL MONTO DE LA FACTURA EN LA LISTA*/
        montoAntiguo = etc.lista.get(0).getMontoFactura();

        /*UPDATE MONTO DE LA FACTURA Y RETOMAR VALOR DE FACTURA*/
        etc.lista.get(0).setMontoFactura(38.99);
        montoActualizado = etc.lista.get(0).getMontoFactura();

        /*ES FALSO QUE SON IGUALES LOS VALORES ANTES
         Y DESPUES DE ACTUALIZAR*/
        org.junit.Assert.assertFalse(montoAntiguo == montoActualizado);
    }

}
