package com.travel.reservationsystem.hotelreservationsystem.models;


import javax.persistence.*;

@Entity
@Table(name="room")
public class Room {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="hotelcode")
    private Integer hotelcode;

    @Column(name="roomname")
    private String roomname;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHotelcode() {
        return hotelcode;
    }

    public void setHotelcode(Integer hotelcode) {
        this.hotelcode = hotelcode;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }











}
