package com.travel.reservationsystem.hotelreservationsystem.controllers;

import com.travel.reservationsystem.hotelreservationsystem.models.HotelDTO;
import com.travel.reservationsystem.hotelreservationsystem.services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController      //
@RequestMapping("/api")
public class HotelController {


    @Autowired
    private HotelServices hotelServices;

    @GetMapping("/all")
    public List<HotelDTO> allHotels(){

        return hotelServices.findAllHotels();
    }

    @GetMapping("/hotelNames")
   public  String[] findHotelNames(){

       return hotelServices.findHotelNames();
   }

    @GetMapping("/countryNames")
    public  String[] findCountryNames(){

        return hotelServices.findCountryNames();
    }

    @GetMapping("/cityNames")
    public  String[] findCityNames(){

        return hotelServices.findCityNames();
    }





}
