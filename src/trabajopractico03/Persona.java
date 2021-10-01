/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico03;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Orlando
 */
public abstract class Persona {
    protected String nombre;
    protected long dni;
    protected LocalDate fechaDeNacimiento;
    protected String domicilio;
    protected LocalDate hoy =LocalDate.now();

    public Persona(String nombre, long dni, LocalDate fechaDeNacimiento, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.domicilio = domicilio;
    }
    
    public int calcularEdad(){
        long edad;
        edad=ChronoUnit.YEARS.between(fechaDeNacimiento, hoy);
        System.out.println("Edad: " + edad);
        return (int) edad;
    }
    public int calcularDiasVivido(){
        long dias;
        dias = ChronoUnit.DAYS.between(fechaDeNacimiento, hoy);
        System.out.println("Dias vividos: " + dias);
        return (int) dias;
    }
    public abstract void cobrar();

    public String getNombre() {
        System.out.println("Nombre y apellido: " + nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        System.out.println("DNI: " + dni);
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public LocalDate getFechaDeNacimiento() {
        System.out.println("Fecha de nacimiento: "+ fechaDeNacimiento );
        return fechaDeNacimiento;
        
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDomicilio() {
        System.out.println("Domicilio: " + domicilio);
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public LocalDate getHoy() {
        return hoy;
    }

    public void setHoy(LocalDate hoy) {
        this.hoy = hoy;
    }
    
}
