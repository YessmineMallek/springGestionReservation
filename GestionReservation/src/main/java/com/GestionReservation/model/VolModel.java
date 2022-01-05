package com.GestionReservation.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionReservation.Dao.VolDAO;
import com.GestionReservation.Entités.Vol;

@Service
public class VolModel {
	@Autowired
	private VolDAO volbd;
	
	public List<Vol> getAll()
	{
		return this.volbd.findAll();
	}
	public void ajouterVol(Vol volToAdd)
	{
		this.volbd.save(volToAdd);
	}
	public void modifierVol(Vol volToDelete)
	{
		this.volbd.save(volToDelete);
	}
	public void delete(int code)
	{
		this.volbd.deleteById(code);
	}

}
