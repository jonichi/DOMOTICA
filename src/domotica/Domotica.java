/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domotica;

import modelo.AC;
import modelo.AdminCasa;
import modelo.AdminDisp;
import modelo.AdminUsuarios;
import modelo.Area;
import modelo.Casa;
import modelo.Foco;
import modelo.Habitacion;
import modelo.TV;
import modelo.Usuario;

/**
 *
 * @author ciber
 */
public class Domotica {
    
    public static void main(String[] args) {
    Casa casa = new Casa("prueba");
    AdminCasa adminCasa = new AdminCasa();
    Area plantaBaja = new Area("planta baja");
    adminCasa.agregarArea(casa,plantaBaja);
    Habitacion sala = new Habitacion("sala");
    adminCasa.agregarHabitacion(casa,plantaBaja.getId(), sala);
    Habitacion cocina = new Habitacion("cocina");
    adminCasa.agregarHabitacion(casa,plantaBaja.getId() , cocina);
    Habitacion comedor = new Habitacion("comedor");
    adminCasa.agregarHabitacion(casa,plantaBaja.getId(), comedor);
    
    Area plantaAlta = new Area("planta alta");
    adminCasa.agregarArea(casa, plantaAlta);
    Habitacion recamara = new Habitacion("Recamara");
    adminCasa.agregarHabitacion(casa,plantaAlta.getId(), recamara);
    Habitacion baño = new Habitacion("Baño");
    adminCasa.agregarHabitacion(casa,plantaAlta.getId() ,baño);
    
    AdminDisp adminDisp = new AdminDisp();
    TV tvSala = new TV ("S/N","S/N");
    Foco focoSala = new Foco("S/N","S/N");
    adminDisp.agregarDisposp(casa,plantaBaja.getId(),sala.getId(), tvSala);
    adminDisp.agregarDisposp(casa,plantaBaja.getId(),sala.getId(), focoSala);
     
    AC acCocina = new AC("S/N","S/N");
    Foco focoCocina = new Foco("S/N","S/N");
    adminDisp.agregarDisposp(casa,plantaBaja.getId(),cocina.getId(), acCocina);
    adminDisp.agregarDisposp(casa,plantaBaja.getId(),cocina.getId(), focoCocina);
    
    Foco focoComedor = new Foco("S/N","S/N");
    adminDisp.agregarDisposp(casa,plantaBaja.getId(),comedor.getId(),focoComedor);
    
    TV tvRecamara = new TV ("S/N","S/N");
    Foco focoRecamara = new Foco("S/N","S/N");
    adminDisp.agregarDisposp(casa,plantaAlta.getId(),recamara.getId(), tvRecamara);
    adminDisp.agregarDisposp(casa,plantaAlta.getId(),recamara.getId(), focoRecamara);
    
    Foco focoBaño = new Foco("S/N","S/N");
    adminDisp.agregarDisposp(casa,plantaAlta.getId(),baño.getId(), focoBaño);
   
    AdminUsuarios adminUsuario = new AdminUsuarios();
    adminUsuario.añadirUsuario("residente", "usuario");
    Usuario usuario=adminUsuario.getUsuario(1);
    
    usuario.apagarArea(casa,plantaAlta.getId());
    }
    
}
