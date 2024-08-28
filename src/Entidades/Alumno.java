package Entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.swing.JOptionPane;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;


    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias= new HashSet<>();

    }

  
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia m) {
        if(m !=null){
            materias.add(m);
        }
    }

    public int cantidadMaterias() {
        System.out.println(this.apellido +" " +this.nombre + " - " + "Materias: "+materias.size());
        return materias.size();
     
    }

    public HashSet<Materia> getMateriasInscritas() {
        return materias;
    }
    
   
    @Override
    public String toString() {
        return apellido + " " + nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.materias, other.materias);
    }
    
    
    
}
