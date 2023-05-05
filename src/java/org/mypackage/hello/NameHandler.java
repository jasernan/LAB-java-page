/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author julia
 */
public class NameHandler {
    
private String name;
private String fecha;

    public NameHandler() {
        name = null;
        fecha = null;
    }

/** Creates a new instance of NameHandler */ 

//int hora, minutos, segundos;
//hora = calendario.get(Calendar.HOUR_OF_DAY);
//minutos = calendario.get(Calendar.MINUTE);
//segundos = calendario.get(Calendar.SECOND);

    public String calcularEdad(String fecha){
        String[] partes = fecha.split(" ");
        int year = Integer.parseInt(partes[2]);
        Calendar fechaHoy = Calendar.getInstance();
        int yearActual = fechaHoy.get(Calendar.YEAR);
        int edad = yearActual-year;
        
          String xEdad = edad+"";
        return xEdad;
        
    }
public String getName() { 
    Calendar calendario = Calendar.getInstance();
    int hora, minutos, segundos;
    hora = calendario.get(Calendar.HOUR_OF_DAY);
    minutos = calendario.get(Calendar.MINUTE);
    segundos = calendario.get(Calendar.SECOND);
    if((hora >= 6 && minutos <=59)&&(hora <= 11 && minutos <=59)){
            return "buenos dias " + name;
        }else if((hora >= 12 && minutos <=59)&&(hora <= 17 && minutos <=59)){
            return "buenas tardes " + name;
        }else{
            return "buenas noches " + name;
        } 
} 
public void setName(String name) { 
    this.name = name; 
} 

    public String getFecha() {
        return calcularEdad(fecha);
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
