/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sistema;

import java.util.List;



/**
 *
 * @author luis
 */
public class Funcion {
    List<Factura> facturas;

    public Funcion() {
    }

    public Funcion(List<Factura> facturas) {
        this.facturas = facturas;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
    
    public void addFactura(Factura f){
        facturas.add(f);
        
    }
    
    
}
