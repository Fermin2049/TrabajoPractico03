/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico03;

import java.time.LocalDate;

/**
 *
 * @author Orlando
 */
public class Jubilado extends Persona {
    Jubilado(String nombre,long dni,LocalDate fechaNacimiento,String domicilio){
        super(nombre,dni,fechaNacimiento,domicilio);
    }
    @Override
    public void cobrar(){
        System.out.println("Cobrando mi jubilacion");
    }
}
