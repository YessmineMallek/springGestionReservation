package com.GestionReservation.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionReservation.Dao.AvionDAO;
import com.GestionReservation.Entités.Avion;

@Service
public class AvionModel {
	
	@Autowired
	private AvionDAO avionDb;
	
	public List<Avion> getAvions()
	{
		return avionDb.findAll();
	}
	
	public void ajouterAvion(Avion avionToAdd)
	{
		 avionDb.save(avionToAdd);
	}
	public void modifierAvion(Avion avionUpdate) 
	{
		avionDb.save(avionUpdate);
	}
	public void delete(String immat)
	{
		avionDb.deleteById(immat);
	}
}
