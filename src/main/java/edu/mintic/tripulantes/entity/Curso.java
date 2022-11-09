package edu.mintic.tripulantes.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_cursos")
public class Curso {

    private @Id @GeneratedValue int idCurso;
    private String nombreCurso;
    private String descripcion;

    @OneToMany(mappedBy = "curso")
    private List<RegistroCursos> tripulantes;
    
    public Curso() {
    }

    public Curso(String nombreCurso, String descripcion, List<RegistroCursos> tripulantes) {
        this.nombreCurso = nombreCurso;
        this.descripcion = descripcion;
        this.tripulantes = tripulantes;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public List<RegistroCursos> getTripulantes() {
        return tripulantes;
    }

    public void setTripulante(List<RegistroCursos> tripulantes) {
        this.tripulantes = tripulantes;
    }

    @Override
    public String toString() {
        return "Curso [idCurso=" + idCurso + ", nombreCurso=" + nombreCurso + ", descripcion=" + descripcion
                + ", tripulantes=" + tripulantes + "]";
    }

    
}
