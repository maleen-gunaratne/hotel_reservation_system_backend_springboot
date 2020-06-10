package com.travel.reservationsystem.hotelreservationsystem.models;

import javax.persistence.*;

@Entity
@Table(name="hotel")
public class HotelDTO {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="hotelcode")
    private String hotelcode;

    @Column(name="hotelname")
    private String hotelname;

    @Column(name="hotelwebsiteurl")
    private String hotelwebsiteurl;

    @Column(name="cityid")
    private Integer cityid;

    @Column(name="locationid")
    private Integer locationid;

    @Column(name="yearbuilt")
    private String yearbuilt;

    @Column(name="hotelrank")
    private String hotelrank;

    @Column(name="childrenallowed")
    private String childrenallowed;

    @Column(name="totalfloors")
    private String totalfloors;

    @Column(name="totalguestrooms")
    private String totalguestrooms;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelcode() {
        return hotelcode;
    }

    public void setHotelcode(String hotelcode) {
        this.hotelcode = hotelcode;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public String getHotelwebsiteurl() {
        return hotelwebsiteurl;
    }

    public void setHotelwebsiteurl(String hotelwebsiteurl) {
        this.hotelwebsiteurl = hotelwebsiteurl;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    public String getYearbuilt() {
        return yearbuilt;
    }

    public void setYearbuilt(String yearbuilt) {
        this.yearbuilt = yearbuilt;
    }

    public String getHotelrank() {
        return hotelrank;
    }

    public void setHotelrank(String hotelrank) {
        this.hotelrank = hotelrank;
    }

    public String getChildrenallowed() {
        return childrenallowed;
    }

    public void setChildrenallowed(String childrenallowed) {
        this.childrenallowed = childrenallowed;
    }

    public String getTotalfloors() {
        return totalfloors;
    }

    public void setTotalfloors(String totalfloors) {
        this.totalfloors = totalfloors;
    }

    public String getTotalguestrooms() {
        return totalguestrooms;
    }

    public void setTotalguestrooms(String totalguestrooms) {
        this.totalguestrooms = totalguestrooms;
    }



}
