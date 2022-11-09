package edu.mintic.tripulantes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "registroCursos")
public class RegistroCursos {

    @Id @GeneratedValue private int idRegistro;
    @ManyToOne
    @JoinColumn(name = "id_tripulante")
    private Tripulante tripulante;
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

}
