package com.travel.reservationsystem.hotelreservationsystem.services;

import com.travel.reservationsystem.hotelreservationsystem.models.ResConfirm;
import org.springframework.stereotype.Service;


public interface ReservationServices {


    String saveReservation(ResConfirm reservationdata);
}
