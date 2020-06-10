package com.travel.reservationsystem.hotelreservationsystem.services.impl;

import com.travel.reservationsystem.hotelreservationsystem.models.HotelDTO;
import com.travel.reservationsystem.hotelreservationsystem.repositories.HotelRepository;
import com.travel.reservationsystem.hotelreservationsystem.services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServicesImpl implements HotelServices {



    @Autowired   //AUTOWIRED ANNOTAION USE BECAUES IT NEED AS SERVICE
    private HotelRepository hotelRepository;

    @Override
    public List<HotelDTO> findAllHotels() {
        List<HotelDTO> allhotels = hotelRepository.findAll();

        return  allhotels;
    }


    public String[] findHotelNames(){
        String[] hotelNames =  hotelRepository.findHotelNames();
        return hotelNames;
    }

    public String[] findCountryNames(){
        String[] countryNames =  hotelRepository.findCountryNames();
        return countryNames;
    }

    public String[] findCityNames(){
        String[] cityNames =  hotelRepository.findCityNames();
        return cityNames;

    }

}
