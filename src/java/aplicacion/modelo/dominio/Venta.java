/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.util.Calendar;

/**
 *
 * @author Full Stackers
 */
public class Venta {
    
    private String estadoVenta;
    private Calendar fechaHoraVenta;
//    private List<Producto> productos;
    private Short ganancia;
    private Short codigoVenta;

    public Venta(String estadoVenta, Calendar fechaHoraVenta, Short ganancia, Short codigoVenta) {
        this.estadoVenta = estadoVenta;
        this.fechaHoraVenta = fechaHoraVenta;
//        this.productos = productos;
        this.ganancia = ganancia;
        this.codigoVenta = codigoVenta;
    }

    /**
     * @return the estadoVenta
     */
    public String getEstadoVenta() {
        return estadoVenta;
    }

    /**
     * @param estadoVenta the estadoVenta to set
     */
    public void setEstadoVenta(String estadoVenta) {
        this.estadoVenta = estadoVenta;
    }

    /**
     * @return the fechaHoraVenta
     */
    public Calendar getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    /**
     * @param fechaHoraVenta the fechaHoraVenta to set
     */
    public void setFechaHoraVenta(Calendar fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    /**
     * @return the ganancia
     */
    public Short getGanancia() {
        return ganancia;
    }

    /**
     * @param ganancia the ganancia to set
     */
    public void setGanancia(Short ganancia) {
        this.ganancia = ganancia;
    }

    /**
     * @return the codigoVenta
     */
    public Short getCodigoVenta() {
        return codigoVenta;
    }

    /**
     * @param codigoVenta the codigoVenta to set
     */
    public void setCodigoVenta(Short codigoVenta) {
        this.codigoVenta = codigoVenta;
    }
    
    
}
