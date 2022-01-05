package com.GestionReservation.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionReservation.Dao.AeroportDAO;
import com.GestionReservation.Entités.Aeroport;

@Service
public class AeroportModel {
	@Autowired
	private AeroportDAO aeroBD;
	
	public List<Aeroport> getAllAeroport()
	{
		return this.aeroBD.findAll();
	}
	public void ajouterAeroport(Aeroport aeroToAdd)
	{
		 this.aeroBD.save(aeroToAdd);
	}
	public void deleteAeroport(String nom)
	{
		this.aeroBD.deleteById(nom);
	}

}
