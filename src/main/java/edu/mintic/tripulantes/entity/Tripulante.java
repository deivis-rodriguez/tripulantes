package edu.mintic.tripulantes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Tripulante {
    private @Id @GeneratedValue int idTripulante;
    private String nombre;
    private String curso;

    public Tripulante() {
    }

    public Tripulante(String nombre, String curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getCurso(){
        return this.curso;
    }
    public int getIdTripulante(){
        return this.idTripulante;
    }

}
