package com.GestionReservation.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GestionReservation.Entités.Avion;
@Repository
public interface AvionDAO extends JpaRepository<Avion, String> {

}
