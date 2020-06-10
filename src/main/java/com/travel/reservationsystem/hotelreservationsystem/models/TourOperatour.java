package com.travel.reservationsystem.hotelreservationsystem.models;

import javax.persistence.*;


@Entity
@Table(name="touroperator")
public class TourOperatour {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="touroperatorname")
    private  String touroperatorname ;

    @Column(name="telephone")
    private String telephone;

    @Column(name="email")
    private  String email;

    @Column(name="status")
    private String status;

    @Column(name="paymenttype")
    private String paymenttype;

    @Column(name="cardtype")
    private  String cardtype;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTouroperatorname() {
        return touroperatorname;
    }

    public void setTouroperatorname(String touroperatorname) {
        this.touroperatorname = touroperatorname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }




}



/*

  id integer NOT NULL,
  telephone character varying(20),
  fax character varying(20),
  email character varying(100),
  rateregionid integer,
  alerttype character varying(10),
  blockorders character varying(10),
  paymenttype character varying(10),
  invoicedaysbeforearrival integer,
  cardtype character varying(20),
  cardholdername character varying(150),
  cardnum character varying(20),
  cardexpirydate character varying(10),
  cv2num character varying(5),
  status character varying(1),
  addressid integer,
  billaddressid integer,
  creditcardtypeid integer,
  name character varying(100) NOT NULL,
  blackoutgroupid integer,
  dedicatedinvrates character varying(2),
  confmailtype character varying, -- H - HTML mail format P - PDF mail format
  confres character varying(1) DEFAULT 'Y'::character varying,
  confreqres character varying(1) DEFAULT 'Y'::character varying,
  reqres character varying(1) DEFAULT 'Y'::character varying,
  modres character varying(1) DEFAULT 'Y'::character varying,
  cancres character varying(1) DEFAULT 'Y'::character varying,
  cancreqres character varying(1) DEFAULT 'Y'::character varying,
  xmlrestimeout integer DEFAULT 30,
  blockthirdparty character varying(1) DEFAULT 'N'::character varying,
  accountid character varying(20),
  markettype character varying(10) NOT NULL DEFAULT 'BB'::character varying,
  allownonref character varying(2)

 */