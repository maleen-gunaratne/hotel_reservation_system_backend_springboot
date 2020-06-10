package com.travel.reservationsystem.hotelreservationsystem.models;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="resconfirm")
public class ResConfirm {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="reservationno")
    private String reservationno;

    @Column(name="touroperatorname")
    private String touroperatorname;

    @Column(name="hotelname")
    private String hotelname;

    @Column(name="roomname")
    private String roomname;

    @Column(name="city")
    private String city;

    @Column(name="country")
    private String country;

    @Column(name="checkin")
    private Date checkin;

    @Column(name="checkout")
    private Date checkout;

    @Column(name="noofchildren")
    private Integer noofchildren;


    @Column(name="noofadults")
    private Integer noofadults;

    @Column(name="totalrate")
    private Integer totalrate;

    @Column(name="totalnoofrooms")
    private Integer totalnoofrooms;

    @Column(name="paymentmethod")
    private String paymentmethod;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReservationno() {
        return reservationno;
    }

    public void setReservationno(String reservationno) {
        this.reservationno = reservationno;
    }

    public String getTouroperatorname() {
        return touroperatorname;
    }

    public void setTouroperatorname(String touroperatorname) {
        this.touroperatorname = touroperatorname;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public Integer getNoofchildren() {
        return noofchildren;
    }

    public void setNoofchildren(Integer noofchildren) {
        this.noofchildren = noofchildren;
    }

    public Integer getNoofadults() {
        return noofadults;
    }

    public void setNoofadults(Integer noofadults) {
        this.noofadults = noofadults;
    }

    public Integer getTotalrate() {
        return totalrate;
    }

    public void setTotalrate(Integer totalrate) {
        this.totalrate = totalrate;
    }

    public Integer getTotalnoofrooms() {
        return totalnoofrooms;
    }

    public void setTotalnoofrooms(Integer totalnoofrooms) {
        this.totalnoofrooms = totalnoofrooms;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }






}
