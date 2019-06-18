/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IDetalleProductoDAO;
import aplicacion.modelo.dominio.DetalleProducto;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Windows
 */
public class DetalleProductoDAOImp implements Serializable, IDetalleProductoDAO{

    @Override
    public void agregarDetalleProducto(DetalleProducto detalleProducto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(detalleProducto);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<DetalleProducto> obtenerDetalleProducto() {
       Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(DetalleProducto.class);
        List<DetalleProducto> detalles = criteria.list();
        session.close();
        return detalles;
    }
    
}
