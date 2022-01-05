package com.GestionReservation.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionReservation.Dao.ReservationDAO;
import com.GestionReservation.Entités.Reservation;
@Service
public class ReservationModel {
	@Autowired
	private ReservationDAO reservationBD;
	
	public List<Reservation>getAll()
	{
		return this.reservationBD.findAll();
	}
	public void ajouterReservation(Reservation resToAdd)
	{
		this.reservationBD.save(resToAdd);
	}
	public void mettreAJour(Reservation resevationToChange)
	{
		this.reservationBD.save(resevationToChange);
	}
	public void supprimerReservation(String numero)
	{
		this.reservationBD.deleteById(numero);
	}
}
