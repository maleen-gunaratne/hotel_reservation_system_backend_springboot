package com.travel.reservationsystem.hotelreservationsystem.controllers;


import com.travel.reservationsystem.hotelreservationsystem.models.ResConfirm;
import com.travel.reservationsystem.hotelreservationsystem.services.ReservationServices;
import com.travel.reservationsystem.hotelreservationsystem.services.TourOperatorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController      //
@RequestMapping("/api")
public class ReservationController {

    @Autowired
    private ReservationServices reservationServices;

    @PostMapping("/reservation")
    public String ReserveHotel(@RequestBody ResConfirm  reservationdata){

        return reservationServices.saveReservation(reservationdata);
    }


}
