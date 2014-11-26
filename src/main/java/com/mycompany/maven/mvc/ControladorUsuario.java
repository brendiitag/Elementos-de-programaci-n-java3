/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven.mvc;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")    
public class ControladorUsuario {
    
    //primero hacemos el get
    @RequestMapping(value="/malo", method=RequestMethod.GET, headers={"Accept=text/html"})
    public@ResponseBody String usuarioConGet(){
        
        return "Este es mi primer controller con un json";
    }
    //crear un metodo get para dos usuarios que me devuelva todosssss
    
    @RequestMapping(value="/usuario",method=RequestMethod.GET,headers={"Accept=Application/json"})
    public @ResponseBody String obtenerMuchos()throws Exception{
        //VAMOS A USAR LA IMPLEMENTACION DE JASON PARA JAVA DE FASTERXML O CODEHOUSE

        
        return GenerarUsuarios.obtenerUsuario();

}
    
}

