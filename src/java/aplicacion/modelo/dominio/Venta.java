/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * La clase venta contiene todos los atributos necesarios para registrar una venta realizada en la página
 * @author Full Stackers
 */

public class Venta {
        
    //Atributos de la clase Venta
    private String estadoVenta;
    //Estado de la venta. Tomará 3 valores "Pendiente", "Realizada" o "Cancelada"
    private Calendar fechaHoraVenta;
    //La fecha y hora de la venta realizada
    private List<Producto> productos;
    //Lista de productos que forman parte de una venta
    private Short ganancia;
    //Dinero que se recibe de la venta
    private Short codigoVenta;
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
     * @param ganancia define el dinero que se recibe por la venta
     * @param codigoVenta define el codigo identificador de la venta; Más adelante se utilizará numeros aleatorios para esto
     * @param productos define la lista de productos que se reservaron para la venta
     */
    public Venta(String estadoVenta, Calendar fechaHoraVenta, List<Producto> productos, Short ganancia, Short codigoVenta) {
        this.estadoVenta = estadoVenta;
        this.fechaHoraVenta = fechaHoraVenta;
        this.productos = productos;
        this.ganancia = ganancia;
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
    
        /**
     * @return the productos
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        //Se utiliza el SimpleDateFormat para mostrar la fecha formalmente
        return "Codigo de Venta: "+codigoVenta+" // Estado de Venta: "+estadoVenta+" // Ganancia de Venta: "+ganancia+" // Fecha y Hora de la Venta: "+sdf.format(fechaHoraVenta.getTime());
    }
}
