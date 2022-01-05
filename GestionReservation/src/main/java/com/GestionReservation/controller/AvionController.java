package com.GestionReservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestionReservation.Entités.Avion;
import com.GestionReservation.Entités.Reservation;
import com.GestionReservation.model.AvionModel;

@RestController
@RequestMapping("/avions")
public class AvionController {
	@Autowired
	private AvionModel avionService;
	
	@GetMapping
	public List<Avion> getAll()
	{
		return avionService.getAvions();
	}
	
	@PostMapping
	public void AddAvion(@RequestBody Avion avToAdd)
	{
		avionService.ajouterAvion(avToAdd);
	}
	
	@PutMapping
	public void mettreAjour(@RequestBody Avion avToUpdate )
	{
		avionService.modifierAvion(avToUpdate);
	}
	@DeleteMapping("/{immat}")
	public void supprimerReservation(@PathVariable String immat )
	{
		avionService.delete(immat);
	}	

}
