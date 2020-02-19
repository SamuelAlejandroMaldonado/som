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
public class Campeonato {
    private String nombreCampeonato;
    private Equipo[] equipos;
 
    public Campeonato(String nombreCampeonato, Equipo[] equipos) {
        this.nombreCampeonato = nombreCampeonato;
        this.equipos = equipos;
    }

    public String getNombreCampeonato() {
        return nombreCampeonato;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public void impCampeonato()
    {System.out.println(this.nombreCampeonato);
    for(int i=0;i<this.equipos.length;i++)
    {
     this.equipos[i].imprimirE();
    }
    }
    
}
