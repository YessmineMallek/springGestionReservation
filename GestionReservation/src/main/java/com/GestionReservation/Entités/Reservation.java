package com.GestionReservation.Entités;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reservation implements Serializable {
	
	@Id
	@Column(length = 8)
	private String numero ; 
	private LocalDate date ; 
	private String client ; 
	private int confirmee;
	
	
	public Reservation() {
		super();
	}

	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getClient() {
		return client;
	}


	public void setClient(String client) {
		this.client = client;
	}


	public int getConfirmee() {
		return confirmee;
	}


	public void setConfirmee(int confirmee) {
		this.confirmee = confirmee;
	}


	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

}
