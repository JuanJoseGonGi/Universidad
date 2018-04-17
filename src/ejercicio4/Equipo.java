/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Arrays;

/**
 *
 * @author Juan José González G
 */
public class Equipo {

    private Jugador team[] = new Jugador[11];
    private String nombre;
    private char division;
    private String nombreCiudad;
    private String colorCamiseta;

    public Equipo() {
    }

    public Equipo(String nombre, char division, String nombreCiudad, String colorCamiseta) {
        this.nombre = nombre;
        this.division = division;
        this.nombreCiudad = nombreCiudad;
        this.colorCamiseta = colorCamiseta;
    }

    public int numeroJugadores() {
        int c_jug = 0;
        for (Jugador jugador : this.team)
            if (jugador == null)
                break;
            else
                c_jug++;
        return c_jug;
    }

    public void adicionarJugador(Jugador jugador) {
        if (this.team.length < 11)
            this.team[numeroJugadores()] = jugador;
    }

    public void eliminarJugador(int numJugador) {
        Jugador temp[] = new Jugador[11];
        for (int i = 0; i < this.team.length; i++)
            if (this.team[i] != null)
                if (this.team[i].getNumero() == numJugador)
                    i--;
                else
                    temp[i] = team[i];
        this.team = temp;
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
     * @return the division
     */
    public char getDivision() {
        return division;
    }

    /**
     * @param division the division to set
     */
    public void setDivision(char division) {
        this.division = division;
    }

    /**
     * @return the nombreCiudad
     */
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    /**
     * @param nombreCiudad the nombreCiudad to set
     */
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    /**
     * @return the colorCamiseta
     */
    public String getColorCamiseta() {
        return colorCamiseta;
    }

    /**
     * @param colorCamiseta the colorCamiseta to set
     */
    public void setColorCamiseta(String colorCamiseta) {
        this.colorCamiseta = colorCamiseta;
    }

    @Override
    public String toString() {
        return "Equipo{" + "team=" + Arrays.toString(team) + ", nombre=" + nombre
                + ", division=" + division + ", nombreCiudad=" + nombreCiudad
                + ", colorCamiseta=" + colorCamiseta + '}';
    }

}
