/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *Clase ProductoOferta contiene una lista de Productos en Oferta
 * @author Full Stackers
 */
public class ProductoOferta implements Serializable{
    private Set<Producto> listaProdOferta;

    public ProductoOferta() {
        listaProdOferta = new HashSet<>();
    }

    /**
     * @return the listaProdOferta
     */
    public Set<Producto> getListaProdOferta() {
        return listaProdOferta;
    }

    /**
     * @param listaProdOferta the listaProdOferta to set
     */
    public void setListaProdOferta(Set<Producto> listaProdOferta) {
        this.listaProdOferta = listaProdOferta;
    }
    
    
    
}
