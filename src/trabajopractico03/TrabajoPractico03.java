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
public class TrabajoPractico03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Registro registro01 = new Registro();
        Trabajador trabjador01 = new Trabajador(7000,"Fermin Fernandez",33539061,LocalDate.of(1988, 03, 13),"Barrio 600 viviendas");
        Jubilado jubilado01 = new Jubilado("Tomas Fernandez",10539061,LocalDate.of(1966, 03, 13),"Barrio Uocra");
        
        registro01.procesarDatos(jubilado01);
        registro01.procesarDatos(trabjador01);
        
    }
    
}
