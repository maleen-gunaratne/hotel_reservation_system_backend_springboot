package com.travel.reservationsystem.hotelreservationsystem.repositories;

import com.travel.reservationsystem.hotelreservationsystem.models.HotelDTO;
import com.travel.reservationsystem.hotelreservationsystem.models.ResConfirm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<ResConfirm,Integer> {


}
