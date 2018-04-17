/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colegio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Juan José González G
 */
public class Curso {
    ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private String id;
    private String nombre;
    private int duración;

    public Curso() {
    }

    public Curso(String id, String nombre, int duración) {
        this.id = id;
        this.nombre = nombre;
        this.duración = duración;
    }

    public double getPromedio() {
        double prom = 0;
        for (Estudiante estudiante : estudiantes)
            prom += estudiante.getPromedio();
        return prom;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the duración
     */
    public int getDuración() {
        return duración;
    }

    /**
     * @param duración the duración to set
     */
    public void setDuración(int duración) {
        this.duración = duración;
    }

}
