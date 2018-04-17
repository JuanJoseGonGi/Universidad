/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

/**
 *
 * @author Juan José González G
 */
public class Producto {

    private int codigo;
    private int cantidadInventario;
    private double precio;
    private String nombre;

    public Producto() {
    }

    public Producto(int codigo, int cantidadInventario, double precio, String nombre) {
        this.codigo = codigo;
        this.cantidadInventario = cantidadInventario;
        this.precio = precio;
        this.nombre = nombre;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the cantidadInventario
     */
    public int getCantidadInventario() {
        return cantidadInventario;
    }

    /**
     * @param cantidadInventario the cantidadInventario to set
     */
    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", cantidadInventario="
                + cantidadInventario + ", precio=" + precio + ", nombre="
                + nombre + '}';
        
    }

}
