package edu.mintic.tripulantes.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.mintic.tripulantes.entity.Tripulante;
import edu.mintic.tripulantes.repository.TripulanteRepository;

@RestController
public class TripulanteController {

    private TripulanteRepository repository;

    public TripulanteController(TripulanteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/tripulantes")
    public List<Tripulante> listaTripulantes(){
        return repository.findAll();
    }

    @PostMapping("/tripulantes")
    public Tripulante crearTripulante(@RequestBody Tripulante tripulante){
        return repository.save(tripulante);
    }

}