package com.GestionReservation.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GestionReservation.Entités.Reservation;

@Repository
public interface ReservationDAO extends JpaRepository<Reservation, String> {


}
