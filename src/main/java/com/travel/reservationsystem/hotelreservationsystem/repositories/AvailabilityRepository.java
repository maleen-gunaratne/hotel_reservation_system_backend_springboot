package com.travel.reservationsystem.hotelreservationsystem.repositories;

import com.travel.reservationsystem.hotelreservationsystem.models.HotelDTO;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AvailabilityRepository {

    public static final String FIND_HOTELNAMES = "SELECT hotelname FROM hotel";


    List<HotelDTO> findAll();


    @Query(value = FIND_HOTELNAMES, nativeQuery = true)
    public List<Object[]> findHotelNames();
}
