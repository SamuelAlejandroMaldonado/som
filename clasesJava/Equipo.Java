package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alsmg
 */
public class Equipo {

    private String nombreEquipo;
    private String categoria;
    private jugador[] jugadores;

    public Equipo(String nombreEquipo, String categoria, jugador[] jugadores) {
        this.nombreEquipo = nombreEquipo;
        this.categoria = categoria;
        this.jugadores = jugadores;
    }

   

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public jugador[] getJugadores() {
        return jugadores;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setJugadores(jugador[] jugadores) {
        this.jugadores = jugadores;
    }

   public void imprimirE()
   {
        System.out.println(this.nombreEquipo);
         System.out.println(this.categoria);
          for(int i=0;i<this.jugadores.length;i++)
       
         {
             this.jugadores[i].Impri();         
         }
    
   }
            }
