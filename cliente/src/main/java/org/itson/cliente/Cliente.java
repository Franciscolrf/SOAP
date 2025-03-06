/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.itson.cliente;

/**
 *
 * @author ID145
 */
public class Cliente {

    public static void main(String[] args) {
        ServWeb_Service ws = new ServWeb_Service();
        ServWeb port = ws.getServWebPort();
        String response = port.hello("Fran");
        System.out.println(response);

        Persona persona = new Persona();
        persona.setNombre("Alice");
        persona.setEdad(25);

        Persona resultado = port.registrarPersona(persona);
        System.out.println("Persona registrada con ID: " + resultado.getId());

        Persona pObtenida = port.obtenerPersona();
        System.out.println("Persona obtenida: " + pObtenida.getNombre());
    }
}
