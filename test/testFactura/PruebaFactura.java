package testFactura;

<<<<<<< HEAD

=======
>>>>>>> aa7f2d9b65192f3c0095cc1bb8d020baf4d6bce4
import etecsa.Etecsa;
import etecsa.Facturas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import junit.framework.Assert;
import org.junit.Test;

<<<<<<< HEAD

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
    
    @Test
    public void testUpdateFactura(){
        //VARS
        double montoAntiguo = 0;
        double montoActualizado = 0;
        
=======
public class PruebaFactura {

  

    @Test
    public void testUpdateFactura() {
        //VARS
        double montoAntiguo = 0;
        double montoActualizado = 0;

>>>>>>> aa7f2d9b65192f3c0095cc1bb8d020baf4d6bce4
        //INSTANCES
        Etecsa etc = new Etecsa();
        Date fechaEmision = new Date();
        Facturas factura2 = new Facturas("1010", "203", 20.56, fechaEmision);
        etc.addFactura(factura2);
<<<<<<< HEAD
        
        /*TOMAR VALOR DEL MONTO DE LA FACTURA EN LA LISTA*/
        montoAntiguo = etc.lista.get(0).getMontoFactura();
        
        /*UPDATE MONTO DE LA FACTURA Y RETOMAR VALOR DE FACTURA*/
        etc.lista.get(0).setMontoFactura(38.99);
        montoActualizado = etc.lista.get(0).getMontoFactura();
        
        /*ES FALSO QUE SON IGUALES LOS VALORES ANTES
        Y DESPUES DE ACTUALIZAR*/
        org.junit.Assert.assertFalse(montoAntiguo==montoActualizado);
    }
=======

        /*TOMAR VALOR DEL MONTO DE LA FACTURA EN LA LISTA*/
        montoAntiguo = etc.lista.get(0).getMontoFactura();

        /*UPDATE MONTO DE LA FACTURA Y RETOMAR VALOR DE FACTURA*/
        etc.lista.get(0).setMontoFactura(38.99);
        montoActualizado = etc.lista.get(0).getMontoFactura();

        /*ES FALSO QUE SON IGUALES LOS VALORES ANTES
         Y DESPUES DE ACTUALIZAR*/
        org.junit.Assert.assertFalse(montoAntiguo == montoActualizado);
    }

>>>>>>> aa7f2d9b65192f3c0095cc1bb8d020baf4d6bce4
}
