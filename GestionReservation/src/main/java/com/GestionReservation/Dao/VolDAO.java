package com.GestionReservation.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GestionReservation.Entités.Vol;
@Repository
public interface VolDAO extends JpaRepository<Vol, Integer>{

}
