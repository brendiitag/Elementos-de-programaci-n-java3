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
public class Domicilio {
    private String calle;
    private String cp;
    private String colonia;
    private String estado;

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", cp=" + cp + ", colonia=" + colonia + ", estado=" + estado + '}';
    }

    public Domicilio(String calle, String cp, String colonia, String estado) {
        this.calle = calle;
        this.cp = cp;
        this.colonia = colonia;
        this.estado = estado;
    }

    public Domicilio() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
