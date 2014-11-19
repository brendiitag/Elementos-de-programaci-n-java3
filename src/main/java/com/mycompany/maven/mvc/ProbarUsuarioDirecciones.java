/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven.mvc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T
 */
public class ProbarUsuarioDirecciones {
    public static void main (String[] args){
        SessionFactory factory= HibernateUtilidades.getSessionFactory();
        Session sesion= factory.openSession();
        Transaction tranza= sesion.beginTransaction();
        
        Usuario u=new Usuario();
        Direccion d=new Direccion();
        
        d.setCalle ("Calle de la amargura");
        d.setColonia("Colonia avon");
        d.setCP ("55130");
        d.setEstado("Ebriedad");
        //importante ligar al usuario anterior esta dirccion
        d.setIdUsuario(u);
        
        u.setDireccion (d);
        u.setEdad(20);
        u.setNombre("brendita");
        u.setSaldo(4002f);
        
        sesion.save (u);
        sesion.save(d);
        
        tranza.commit();
        sesion.close();
        System.out.println("todo se guardo bien!!");
        
    }
    
}
