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
    public void testaddFactura() {
        //INSTANCES
        Etecsa etc = new Etecsa();
        Date fechaEmision = new Date();
        Facturas factura1 = new Facturas("14", "964", 20.56, fechaEmision);

        //EJECUCION DEL METODO ADDfACTURA
        etc.addFactura(factura1);

        /*VERDADERO QUE LA LISTA YA NO ESTA VACIA*/
        org.junit.Assert.assertTrue(!etc.lista.isEmpty());

    }

    

}
