package com.travel.reservationsystem.hotelreservationsystem;

import static org.assertj.core.api.Assertions.assertThat;

import com.travel.reservationsystem.hotelreservationsystem.controllers.HotelController;
import com.travel.reservationsystem.hotelreservationsystem.controllers.ReservationController;
import com.travel.reservationsystem.hotelreservationsystem.controllers.TourOperatorController;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

    @SpringBootTest
    public class SmokeTest {

        @Autowired
        private HotelController hotelController;

        @Autowired
        private TourOperatorController tourOperatorController;

        @Autowired
        private ReservationController reservationController;


        @Test
        public void contexLoads1() throws Exception {
            assertThat(hotelController).isNotNull();
        }

        @Test
        public void contexLoads2() throws Exception {
            assertThat(tourOperatorController).isNotNull();
        }

        @Test
        public void contexLoads3() throws Exception {
            assertThat(reservationController).isNotNull();
        }


    }


