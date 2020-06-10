package com.travel.reservationsystem.hotelreservationsystem.repositories;

import com.travel.reservationsystem.hotelreservationsystem.models.HotelDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<HotelDTO,Integer> {


    public static final String FIND_HOTELNAMES = "SELECT hotelname FROM hotel";
    public static final String FIND_CITYNAMES = "SELECT cityname FROM city";
    public static final String FIND_COUNTRYNAMES = "SELECT countryname FROM country";


    List<HotelDTO> findAll();

    @Query(value = FIND_HOTELNAMES, nativeQuery = true)
    public String[] findHotelNames();

    @Query(value = FIND_CITYNAMES, nativeQuery = true)
    public String[]  findCityNames();

    @Query(value = FIND_COUNTRYNAMES, nativeQuery = true)
    public String[]  findCountryNames();


}
