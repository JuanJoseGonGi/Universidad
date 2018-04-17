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
public class Caja {
    double saldo;
    Producto p1;
    Producto p2;
    Producto p3;
    Producto p4;
    Producto p5;
    int ventaP1;
    int ventaP2;
    int ventaP3;
    int ventaP4;
    int ventaP5;

    public Caja() {
    }
    
    public double generarFactura() {
        double ventaTotal = 0.0;
        //TODO terminar este código
        return ventaTotal;
    }
    
    public void mostrarInventario(Producto productoAMostrar) {
        //TODO terminar este código
    }
    
    private void crearProductos() {
        p1 = new Producto(1, 50, 15000.0, "");
        p1 = new Producto(2, 5, 30000.0, "Jabón Detergente ARIEL");
        p1 = new Producto(3, 9, 40000.0, "Caja de Ron Viejo de Caldas");
        p1 = new Producto(4, 7, 99999.0, "");
        p1 = new Producto(5, 15, 34000.0, "");
    }
}
