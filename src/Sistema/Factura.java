/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sistema;

import java.util.Date;

/**
 *
 * @author luis
 */
public class Factura {
    private String idFactura;
    private String idCliente;
    private double monto;
    private double pago;
    private double resto;

    public void setResto(double resto) {
        this.resto = resto;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getResto() {
        return resto;
    }
    private Date FechaEmision;
    private boolean estado;
    private Date FechaPago;
    
    public Factura(String idFactura, String idCliente, double monto, Date FechaEmision, boolean estado) {
        this.idFactura = idFactura;
        this.idCliente = idCliente;
        this.monto = monto;
        this.FechaEmision = FechaEmision;
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

    public Date getFechaEmision() {
        return FechaEmision;
    }

    public void setFechaEmision(Date FechaEmision) {
        this.FechaEmision = FechaEmision;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(Date FechaPago) {
        this.FechaPago = FechaPago;
    }

    @Override
    public String toString() {
        return idCliente;
    }
}