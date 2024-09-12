/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etecsa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Doralis
 */
public class Etecsa {

    public List<Facturas> lista = new ArrayList<>();

    
    //Add para poderlo instanciar sin necesidad de datos
    public Etecsa() {
    }

    
    
    
    public List<Facturas> getLista() {
        return lista;
    }

    public void setLista(List<Facturas> lista) {
        this.lista = lista;
    }

    public Etecsa(List<Facturas> lista) {
        this.lista = lista;
    }

    public void addFactura(Facturas f) {
        lista.add(f);
    }

    public List<Facturas> busqueda(String idCliente) {
        List<Facturas> facturasencontradas = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (idCliente.equalsIgnoreCase(lista.get(i).getIdCliente())) {
               facturasencontradas.add(lista.get(i));
            }
        }
            return facturasencontradas;
       }
    }

