/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Venta;
import java.util.List;

/**
 *
 * @author Full Stackers
 */
public interface IVentaDAO {
    
    public void crearVenta(Venta venta);
    
    public List<Venta> obtenerVentas();
}
