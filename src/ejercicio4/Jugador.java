/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Juan José González G
 */
class Jugador {

    private String nombre;
    private String apellido;
    private int numero;
    private String posicion;
    private double estatura;
    private double peso;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int numero, String posicion, double estatura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.posicion = posicion;
        this.estatura = estatura;
        this.peso = peso;
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

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the posicion
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    /**
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido
                + ", numero=" + numero + ", posicion=" + posicion
                + ", estatura=" + estatura + ", peso=" + peso + '}';
    }
}
