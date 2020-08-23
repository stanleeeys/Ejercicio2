/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stanley
 */
public class estudiante  extends persona{
    private int Matricula;
    private String Carrera;
    
    public estudiante 
     (String Nombre, String Direccion, String FechaNC, String Genero, int Edad, int Matricula, String Carrera){
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.FechaNC = FechaNC;
        this.Genero = Genero;
        this.Edad = Edad;
        this.Matricula = Matricula;
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return "estudiante{" +"Nombre=" + Nombre + ", Direccion=" + Direccion + ", FechaNC=" + FechaNC + ", Genero=" + Genero + ", Edad=" + Edad + "Matricula=" + Matricula + ", Carrera=" + Carrera + '}';
    }
    
}
