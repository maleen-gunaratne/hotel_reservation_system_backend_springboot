package com.travel.reservationsystem.hotelreservationsystem.repositories;

import com.travel.reservationsystem.hotelreservationsystem.models.HotelDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TourOperatorRepository  extends JpaRepository<HotelDTO,Integer> {

    public static final String FIND_TOUROPERATOR_NAMES = "SELECT touroperatorname FROM touroperator";

    @Query(value = FIND_TOUROPERATOR_NAMES, nativeQuery = true)
    public List<Object[]> findTouroperatorNames();



}
