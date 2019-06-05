/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 * Clase Producto contiene los atributos que tendra cada producto registrado
 * @author Full Stackers
 */

public class Producto implements Serializable{
    private String codigo;
    //codigo: representa el codigo unico de cada producto
    private String nombreProducto;
    //nombreProducto: representa el producto
    private String rubro;
    //rubro: nombre que representa un conjunto de productos que comparten las mismas caracteristicas
    private float precio;
    //precio: representa el precio de venta del producto al publico
    private short stock;
    //stock: representa la cantidad dispronible del producto 
    
    //CONSTRUCTORES
    /**
     * constructor sin parametros
     */
    public Producto() {
    }
    
    
    /**
     * constructor parametrizado
     * @param codigo variable que almacena el codigo del producto
     * @param nombreProducto variable que almacena en nombre del producto
     * @param rubro variable que almacena el rubro del producto
     * @param precio variable que almacena el precio del producto
     * @param stock valriable que almacena el stock del producto
     */
    public Producto(String codigo, String nombreProducto, String rubro, float precio, short stock) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.rubro = rubro;
        this.precio = precio;
        this.stock = stock;
    }
    
    //GETTER AND SETTER
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the rubro
     */
    public String getRubro() {
        return rubro;
    }

    /**
     * @param rubro the rubro to set
     */
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the stock
     */
    public short getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(short stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Codigo del Producto: "+codigo+"Nombre del producto: "+nombreProducto+"Precio del Producto: "+precio+"Stock del Producto: "+stock+"Rubro del Producto: "+rubro;
    }
    
}
