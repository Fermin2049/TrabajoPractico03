/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico03;

/**
 *
 * @author Orlando
 */
public class Registro {
    public void procesarDatos(Persona persona){
        if (persona instanceof Jubilado ) {
            persona.getNombre();
            persona.getDni();
            persona.getDomicilio();
            persona.getFechaDeNacimiento();
            persona.calcularDiasVivido();
            
        }else{
            persona.getNombre();
            persona.calcularEdad();
            persona.cobrar();
            
            
        }
    }
}
