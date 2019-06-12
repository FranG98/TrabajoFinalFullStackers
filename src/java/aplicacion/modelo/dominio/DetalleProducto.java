/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;



/**
 *
 * @author Windows
 */
public class DetalleProducto {
    private Producto productoVendido;
    private Integer cantidadVendida;
    private Double precioTotal;
    private Usuario usuarioComprador;
    //Usuario que solicito la compra de Productos

    public DetalleProducto(Integer cantidadVendida, Double precioTotal) {
        productoVendido = new Producto();
        this.cantidadVendida = cantidadVendida;
        this.precioTotal = precioTotal;
        usuarioComprador = new Usuario();
    }
    
    //GETTERS Y SETTERS
    /**
     * @return the productoVendido
     */
    public Producto getProductoVendido() {
        return productoVendido;
    }

    /**
     * @param productoVendido the productoVendido to set
     */
    public void setProductoVendido(Producto productoVendido) {
        this.productoVendido = productoVendido;
    }

    /**
     * @return the cantidadVendida
     */
    public Integer getCantidadVendida() {
        return cantidadVendida;
    }

    /**
     * @param cantidadVendida the cantidadVendida to set
     */
    public void setCantidadVendida(Integer cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    /**
     * @return the precioTotal
     */
    public Double getPrecioTotal() {
        return precioTotal;
    }

    /**
     * @param precioTotal the precioTotal to set
     */
    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    /**
     * @return the usuarioComprador
     */
    public Usuario getUsuarioComprador() {
        return usuarioComprador;
    }

    /**
     * @param usuarioComprador the usuarioComprador to set
     */
    public void setUsuarioComprador(Usuario usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }
    
    
}
