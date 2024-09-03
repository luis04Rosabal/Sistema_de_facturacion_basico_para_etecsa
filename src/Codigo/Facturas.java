/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Codigo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author luis
 */
public class Facturas {
  private String idFactura;
  private String idCliente;
  private double monto;
  private Date fechaDeEmision;
  private String estado;
  

    public Facturas(String idFactura, String idCliente, double monto, Date fechaDeEmision, String estado) {
        this.idFactura = idFactura;
        this.idCliente = idCliente;
        this.monto = monto;
        this.fechaDeEmision = fechaDeEmision;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFechaDeEmision() {
        return fechaDeEmision;
    }

    public void setFechaDeEmision(Date fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
    }

   

    @Override
    public String toString() {
        return idFactura;
    }
   
}
