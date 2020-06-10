package com.travel.reservationsystem.hotelreservationsystem.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="blackoutgroup")

public class BlackoutGroup {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="blackoutperiodfrom")
    private Date blackoutfrom;

    @Column(name="blackoutperiodto")
    private Date blackoutto;

    @Column(name="roomid")
    private Integer roomid;

    @Column(name="hotelid")
    private Integer hotelid;

    @Column(name="blackoutreason")
    private String blackoutreason;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBlackoutfrom() {
        return blackoutfrom;
    }

    public void setBlackoutfrom(Date blackoutfrom) {
        this.blackoutfrom = blackoutfrom;
    }

    public Date getBlackoutto() {
        return blackoutto;
    }

    public void setBlackoutto(Date blackoutto) {
        this.blackoutto = blackoutto;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getBlackoutreason() {
        return blackoutreason;
    }

    public void setBlackoutreason(String blackoutreason) {
        this.blackoutreason = blackoutreason;
    }





}
