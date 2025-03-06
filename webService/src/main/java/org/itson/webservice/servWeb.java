/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package org.itson.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

/**
 *
 * @author ID145
 */
@WebService(serviceName = "servWeb")
public class servWeb {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "registrarPersona")
    public Persona registrarPersona (Persona p){
        p.setId(1001L);
        return p;
    }
    
    @WebMethod
    public Persona obtenerPersona() {

        Persona p = new Persona();
        p.setId(2002L);
        p.setNombre("Fran Doe");
        p.setEdad(22);
        return p;
    }
}
