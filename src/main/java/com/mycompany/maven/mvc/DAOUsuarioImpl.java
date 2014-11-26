/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven.mvc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T
 */
public class DAOUsuarioImpl {
    
    public String obtenerTodos() throws Exception{
        SessionFactory factory=HibernateUtilidades.getSessionFactory();
        Session sesion= factory.openSession();
        Transaction tranza= sesion.beginTransaction();
        
        Criteria cri=sesion.createCriteria(Usuario.class);
        ArrayList<Usuario> usuarios= (ArrayList<Usuario>)cri.list();
        Map<String, ArrayList<Usuario>> singletonMap =Collections.singletonMap("usuarios",usuarios);
        //System.out.println(usuarios.get(0).getDireccionList().get(0).getEstado());
        ObjectMapper mapper=new ObjectMapper();
        
        tranza.commit();
        sesion.close();
        
        return mapper.writeValueAsString(singletonMap);
    }
    
}
