package com.GestionReservation.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestionReservation.Dao.ReservationDAO;
import com.GestionReservation.Entités.Reservation;
import com.GestionReservation.model.ReservationModel;


@RestController
@RequestMapping("/reservations")
public class ReservationController {
	
	@Autowired
	private ReservationModel resService;
	
	@GetMapping
	public List<Reservation> getAll()
	{
		return resService.getAll();
	}
	
	@PostMapping
	public void AddReservation(@RequestBody Reservation resToAdd)
	{
		resService.ajouterReservation(resToAdd);
	}
	
	@PutMapping
	public void mettreAjour(@RequestBody Reservation resToUpdate )
	{
		resService.mettreAJour(resToUpdate);
	}
	@DeleteMapping("/{numero}")
	public void supprimerReservation(@PathVariable String numero )
	{
		resService.supprimerReservation(numero);
	}
	
	
	

}
