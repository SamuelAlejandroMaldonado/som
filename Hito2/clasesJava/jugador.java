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
public class jugador {
  
        private String nombreCompleto;
        private String apellidos;
        private String ci;
        private int  edad;
  

    public jugador(String nombreCompleto, String apellidos, String ci, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.apellidos = apellidos;
        this.ci = ci;
        this.edad = edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCi() {
        return ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
  
   public void Impri()
   {
       System.out.println(this.nombreCompleto);
       System.out.println(this.apellidos);
       System.out.println(this.ci);
       System.out.println(this.edad);
   }
        
}
