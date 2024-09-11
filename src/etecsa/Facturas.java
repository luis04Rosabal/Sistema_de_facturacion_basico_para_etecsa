/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package etecsa;

import java.util.Date;

/**
 *
 * @author Doralis
 */
public class Facturas {
  String idfactura; 
  String idCliente;
  double montoFactura;
  Date fechaEmision;
  Date fechaPago;
  boolean estado ;

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Facturas(String idfactura, String idCliente, 
            double montoFactura, Date fechaEmision) {
        this.idfactura = idfactura;
        this.idCliente = idCliente;
        this.montoFactura = montoFactura;
        this.fechaEmision = fechaEmision;
        this.estado = false;
    }

    public String getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(String idfactura) {
        this.idfactura = idfactura;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return idCliente;
    }
    
    
  
}
