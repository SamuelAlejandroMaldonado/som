/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;


import clases.Campeonato;
import clases.Equipo;
import clases.jugador;

/**
 *
 * @author alsmg
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       jugador jugador1= new jugador("Nombre1","Apellido1","ci1",20);
       jugador jugador2= new jugador("Nombre2","Apellido2","ci2",20);
       jugador jugador3= new jugador("Nombre3","Apellido3","ci3",20);
       jugador[] jugadoresEquipo1 = new jugador[30];
       jugadoresEquipo1[0]=jugador1;
         jugadoresEquipo1[1]=jugador2;
         jugadoresEquipo1[2]=jugador3;
         
        Equipo equipo1 = new Equipo("not found", "varones",jugadoresEquipo1);
        Equipo[] equipos = new Equipo[1];
        equipos[0] = equipo1;
        Campeonato camp = new Campeonato("Campeonato Unifranz",equipos);
       camp.impCampeonato();
    }
    
}