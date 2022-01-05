package com.GestionReservation.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GestionReservation.Entités.Aeroport;

@Repository
public interface AeroportDAO extends JpaRepository<Aeroport, String>{

}
