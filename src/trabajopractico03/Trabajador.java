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
public class Trabajador  extends Persona implements Pasivo {
    double sueldo;

    Trabajador(double sueldo,String nombre,long dni,LocalDate fechaNacimiento,String domicilio){
        super(nombre,dni,fechaNacimiento,domicilio);
        this.sueldo=sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
     
    
    @Override
    public void cobrar(){
        System.out.println("Monto a cobrar: " + sueldo);
    }
    @Override
    public double hacerAportes(){
        return sueldo * 0.11;
    }
    
    
}
