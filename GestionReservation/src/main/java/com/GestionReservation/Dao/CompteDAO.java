package com.GestionReservation.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GestionReservation.Entités.Compte;
@Repository
public interface CompteDAO extends JpaRepository<Compte, String> {

}
