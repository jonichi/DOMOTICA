/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashMap;

/**
 *
 * @author ciber
 */
public class AdminCasa {
    public static int total_areas;
   
    public HashMap<Integer,Area> areas = new HashMap<>();
    
    
    public void agregarArea(Casa casa,Area area){
        casa.addArea(area);
        areas.put(area.getId(), area);
        total_areas++;
    }
    public void agregarHabitacion(Casa casa,int areaId,Habitacion habitacion){
        casa.getArea(areaId).addHabitacion(habitacion);
        areas.get(areaId).addHabitacion(habitacion);
       
    }
    public void removerArea(Casa casa,int areaId){
        casa.removeArea(areaId);
        if(areas.get(areaId) != null){
            areas.remove(areaId);
        }
    }
    public void removerHabitacion(Casa casa,int areaId,int habitacionId){
        casa.getArea(areaId).removeHabitacion(habitacionId);
    }
    
}
