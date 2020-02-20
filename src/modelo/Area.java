/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashMap;
import java.util.Set;

public class Area{
    private int numHabitaciones;
    private int habitacionFinal;
    private String areaName;
    private static int areaId;
    private int id;
    public HashMap<Integer,Habitacion> habitaciones = new HashMap<>();

    public Area(String areaName){
        areaId++;
        id=areaId;
    	this.areaName=areaName;
    }

    public void setAreaName(String areaName){
    	this.areaName=areaName;
    }

    public String getAreaName(){
    	return areaName;
    }

    public int getId(){
    	return id;
    }
    public Habitacion getHabitacion(int habitacionId){
        return habitaciones.get(habitacionId);
    }

    public void addHabitacion(Habitacion newHabitacion){
    	habitaciones.put(newHabitacion.getId(), newHabitacion);
        numHabitaciones++;
        habitacionFinal=newHabitacion.getId();
    }

    public void removeHabitacion(int habitacionId){
    	if(habitaciones.get(habitacionId) != null){
    		habitaciones.remove(habitacionId);
    	}
    }
    
    public void apagar(){
        Set<Integer> keys = habitaciones.keySet();
         for(Integer key:keys){
            getHabitacion(key).apagar();
        }
         System.out.println(getAreaName()+" habitaciones apagadas");
        }
    
    
    public void encender(){
         Set<Integer> keys = habitaciones.keySet();
         for(Integer key:keys){
            getHabitacion(key).encender();
        }
         System.out.println(getAreaName()+" habitaciones apagadas");
    
    }
}