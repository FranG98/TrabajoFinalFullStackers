/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.DetalleCarrito;
import java.util.List;

/**
 *
 * @author Windows
 */
public interface IDetalleCarritoDAO {
    
    public void agregarDetalleCarrito(DetalleCarrito detalleProducto);
    public void eliminarDetalleCarrito(DetalleCarrito detalleCarrito);
    public List<DetalleCarrito>obtenerDetalleCarrito();
}
