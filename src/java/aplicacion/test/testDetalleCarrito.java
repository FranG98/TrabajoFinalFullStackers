/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IDetalleCarritoDAO;
import aplicacion.hibernate.dao.IProductoDAO;
import aplicacion.hibernate.dao.imp.DetalleCarritoDAOImp;
import aplicacion.hibernate.dao.imp.ProductoDAOImp;
import aplicacion.modelo.dominio.DetalleCarrito;
import aplicacion.modelo.dominio.Producto;

/**
 *
 * @author Elias Acosta
 */
public class testDetalleCarrito {
    public static void main(String[] args) {
        
        Producto unProducto = new Producto("auto", "sector", (float)33.2, (short)4, "marca", "dimension", "imagen", (float)45.5);
        IProductoDAO productoDAO = new ProductoDAOImp();
        productoDAO.agregarProducto(unProducto);
        //DetalleCarrito detCarrito = new DetalleCarrito(unProducto, 34, 34.3, 142.2,new);
        IDetalleCarritoDAO detalleCarritoDAO = new DetalleCarritoDAOImp();
        //detalleCarritoDAO.agregarDetalleCarrito(detCarrito);
    }
    
}
