/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author ciber
 */
public class Habitacion {
    
        private int numDisp;
        private int dispFinal;
	private Map<Integer,Dispositivo> dispositivos = new HashMap<>();
	private String nombre;
	private static int habitacionId;
	private int id;

	public Habitacion(String nombre){
		habitacionId++;
		this.nombre = nombre;
		id = habitacionId;
	}

	public void addDevice(Dispositivo dispositivo){
		dispositivos.put(dispositivo.getId(),dispositivo);
                  numDisp++;
                 dispFinal=dispositivo.getId();
                
	}

	public Dispositivo getDispositivo(int dispositivoId){
		return dispositivos.get(dispositivoId);
	}

	public int getId(){
		return this.id;
	}

	public String getNombre(){
		return this.nombre;
	}
	
	public void removeDispositivo(int dispositivoId){
    	if(dispositivos.get(dispositivoId) != null){
    		dispositivos.remove(dispositivoId);
		}
	}
        public void apagar(){
         Set<Integer> keys = dispositivos.keySet();
         for(Integer key:keys){
            getDispositivo(key).turnOff();
        }
            System.out.println(getNombre()+ " dispositivos apagados" );
        }
        public void encender(){
        Set<Integer> keys = dispositivos.keySet();
         for(Integer key:keys){
            getDispositivo(key).turnOn();
        }
         System.out.println(getNombre()+ " dispositivos encendidos" );
    }
}

