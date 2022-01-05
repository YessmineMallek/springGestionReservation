package com.GestionReservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.GestionReservation.Entités.Aeroport;
import com.GestionReservation.model.AeroportModel;

@RestController
@RequestMapping("/aeroports")
public class AeroportController {
	@Autowired
	private AeroportModel aeroService;
	
	@GetMapping
	public List<Aeroport> getAll()
	{
		return aeroService.getAllAeroport();
	}
	
	@PostMapping
	public void AddAeroport(@RequestBody Aeroport aeroToAdd)
	{
		aeroService.ajouterAeroport(aeroToAdd);
	}
	
	
	@DeleteMapping("/{nom}")
	public void supprimerReservation(@PathVariable String nom )
	{
		aeroService.deleteAeroport(nom);
	}

}
