package com.travel.reservationsystem.hotelreservationsystem.controllers;

import com.travel.reservationsystem.hotelreservationsystem.services.HotelServices;
import com.travel.reservationsystem.hotelreservationsystem.services.TourOperatorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TourOperatorController {

    @Autowired
    private TourOperatorServices tourOperatorServices;

    @GetMapping("/tourOpertorNames")
    public List<Object[]> findHotelNames(){

        return tourOperatorServices.findTouroperatorNames();
    }




}
