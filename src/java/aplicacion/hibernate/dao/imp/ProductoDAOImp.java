/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IProductoDAO;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Full Stackers
 */
public class ProductoDAOImp implements Serializable, IProductoDAO{

   @Override
    public void agregarProducto(Producto producto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(producto);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificarProducto(Producto producto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(producto);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminarProducto(Producto producto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(producto);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Producto> obtenerProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
