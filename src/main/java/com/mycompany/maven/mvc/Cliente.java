/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven.mvc;

/**
 *
 * @author T
 */
public class Cliente {

    static void add(Cliente c1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String nombre;
    private int edad;
    private float sueldo;
    private Domicilio domicilio ;

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + ", domicilio=" + domicilio + '}';
    }

    public Cliente(String nombre, int edad, float sueldo, Domicilio domicilio) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.domicilio = domicilio;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio doomicilio) {
        this.domicilio = domicilio;
    }
    
}
