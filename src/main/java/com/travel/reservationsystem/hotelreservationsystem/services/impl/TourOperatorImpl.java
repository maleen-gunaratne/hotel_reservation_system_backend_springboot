package com.travel.reservationsystem.hotelreservationsystem.services.impl;


import com.travel.reservationsystem.hotelreservationsystem.repositories.TourOperatorRepository;
import com.travel.reservationsystem.hotelreservationsystem.services.HotelServices;
import com.travel.reservationsystem.hotelreservationsystem.services.TourOperatorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourOperatorImpl  implements TourOperatorServices {


    @Autowired
    private TourOperatorRepository tourOperatorRepository;

    public List<Object[]> findTouroperatorNames(){
        List<Object[]> hotelNames =  tourOperatorRepository.findTouroperatorNames();
        return hotelNames;
    }
}
