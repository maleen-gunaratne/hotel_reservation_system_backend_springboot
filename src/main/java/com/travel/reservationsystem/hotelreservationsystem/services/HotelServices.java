package com.travel.reservationsystem.hotelreservationsystem.services;

import com.travel.reservationsystem.hotelreservationsystem.models.HotelDTO;

import java.util.List;

public interface HotelServices {

List<HotelDTO> findAllHotels();

    String[] findHotelNames();

    String[] findCountryNames();

    String[] findCityNames();

//String saveUser(HotelDTO userdata);
}
