/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Codigo;

import java.util.List;

/**
 *
 * @author luis
 */
public class Sistema_de_facturacion_basico_para_etecsa {
    private List<Facturas> facturas;

    public Sistema_de_facturacion_basico_para_etecsa() {
    }
    
       
    public void registrarFacturas (Facturas a){
            facturas.add(a);
    }

    public Sistema_de_facturacion_basico_para_etecsa(List<Facturas> facturas) {
        this.facturas = facturas;
    }

    public List<Facturas> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Facturas> facturas) {
        this.facturas = facturas;
    }
  public Facturas BuscarFactura( String id){
      System.out.println("id resivido"+ id);
      
      for (Facturas f :facturas){
          if(f.getIdFactura().equals(id)){
              return f;
          }
              
          
      }
      return null;
  }
  public void cancelarFactura(String id){
      Facturas factura= BuscarFactura(id);
      if(factura != null){
          facturas.remove(factura);
      }
  }
}
//prueba
