/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.DetalleProducto;
import java.util.List;

/**
 *
 * @author Windows
 */
public interface IDetalleProductoDAO {
    
    public void agregarDetalleProducto(DetalleProducto detalleProducto);
    public List<DetalleProducto>obtenerDetalleProducto();
}
