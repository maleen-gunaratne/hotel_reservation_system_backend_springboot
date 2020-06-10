package com.travel.reservationsystem.hotelreservationsystem.services.impl;

import com.travel.reservationsystem.hotelreservationsystem.models.HotelDTO;
import com.travel.reservationsystem.hotelreservationsystem.models.ResConfirm;
import com.travel.reservationsystem.hotelreservationsystem.repositories.HotelRepository;
import com.travel.reservationsystem.hotelreservationsystem.repositories.ReservationRepository;
import com.travel.reservationsystem.hotelreservationsystem.services.ReservationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServicesImpl implements ReservationServices {

    @Autowired
    private ReservationRepository reservationRepository;


    public String saveReservation(ResConfirm reservationdata){

        reservationRepository.save(reservationdata);

        return  "Reservation Saved";

    }

}
