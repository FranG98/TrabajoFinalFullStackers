/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.DetalleCarrito;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import aplicacion.hibernate.dao.IDetalleCarritoDAO;

/**
 *
 * @author Windows
 */
public class DetalleCarritoDAOImp implements Serializable, IDetalleCarritoDAO{

    @Override
    public void agregarDetalleCarrito(DetalleCarrito detalleProducto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(detalleProducto);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminarDetalleCarrito(DetalleCarrito detalleCarrito) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(detalleCarrito);
        session.getTransaction().commit();
        session.close();
    }
    
    @Override
    public List<DetalleCarrito> obtenerDetalleCarrito() {
       Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(DetalleCarrito.class);
        List<DetalleCarrito> detalles = criteria.list();
        session.close();
        return detalles;
    }

    
    
}
