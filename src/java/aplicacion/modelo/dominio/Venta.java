/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * La clase venta contiene todos los atributos necesarios para registrar una venta realizada en la página
 * @author Full Stackers
 */

public class Venta implements Serializable{
        
    //Atributos de la clase Venta
    private String estadoVenta;
    //Estado de la venta. Tomará 3 valores "Pendiente", "Realizada" o "Cancelada"
    private Date fechaHoraVenta;
    //La fecha y hora de la venta realizada
    private Set<DetalleCarrito> productos;
    //Lista de productos que forman parte de una venta
    private Integer codigoVenta;
    //Codigo que identifica a cada venta
    
    /**
     * Constructor sin parametros
     */
    public Venta() {
    }
 
    /**
     * Constructor parametrizado de la clase Venta
     * @param estadoVenta define el estado actual de la venta: "Pendiente", "Realizada" o "Cancelada"
     * @param fechaHoraVenta define la fecha y hora en la cual se realizo la venta; Se utiliza el tipo Calendar ya que trabaja con ambas
     * @param codigoVenta define el codigo identificador de la venta; Más adelante se utilizará numeros aleatorios para esto
     */
    public Venta(String estadoVenta, Date fechaHoraVenta, Integer codigoVenta) {
        this.estadoVenta = estadoVenta;
        fechaHoraVenta = new Date();
        productos = new HashSet<>();
        this.codigoVenta = codigoVenta;
    }

    //METODOS GETTER & SETTER
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
    public Date getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    /**
     * @param fechaHoraVenta the fechaHoraVenta to set
     */
    public void setFechaHoraVenta(Date fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    /**
     * @return the codigoVenta
     */
    public Integer getCodigoVenta() {
        return codigoVenta;
    }

    /**
     * @param codigoVenta the codigoVenta to set
     */
    public void setCodigoVenta(Integer codigoVenta) {
        this.codigoVenta = codigoVenta;
    }
    
        /**
     * @return the productos
     */
    public Set<DetalleCarrito> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(Set<DetalleCarrito> productos) {
        this.productos = productos;
    }
     
    //Metodo toString
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        //Se utiliza el SimpleDateFormat para mostrar la fecha formalmente
        return "Codigo de Venta: "+codigoVenta+" // Estado de Venta: "+estadoVenta+" // Fecha y Hora de la Venta: "+sdf.format(fechaHoraVenta.getTime());
    }

}
