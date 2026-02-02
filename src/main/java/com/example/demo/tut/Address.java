package com.example.demo.tut;

import jakarta.persistence.*;
import org.hibernate.annotations.CollectionId;

import javax.annotation.processing.Generated;
import java.util.Date;


@Entity
@Table(name="StudentAddress")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_id")
    private int AddressId;
    @Column(length = 50,name = "STREET")
    private String street;
    @Column(length = 100)
    private  String city;
    private boolean isOpen;

    @Transient
    private double x;
    @Temporal(TemporalType.DATE)
    private Date addedDate;


    @Lob
    private byte[]image;


    public  Address(){
        super();
    }

    public  Address(int AddressId,String street,String city,boolean isOpen,double x,Date addedDate){
        this.AddressId=AddressId;
        this.street=street;
        this.city=city;
        this.isOpen=isOpen;
        this.x=x;
        this.addedDate=addedDate;
    }


    public int getAddressId(){
        return  AddressId;
    }
    public  void setAddressId(int addressId){
        this.AddressId=addressId;
    }

    public  String getStreet(){
        return  street;
    }
    public  void setStreet(String street){
        this.street=street;
    }

    public String getCity(){
        return  city;
    }
    public  void setCity(String street){
        this.street=street;
    }

    public boolean getOpen(){
        return  isOpen;
    }
    public  void setOpen(boolean isOpen){
        this.isOpen=isOpen;
    }

    public  Date getAddedDate(){
        return  addedDate;
    }
    public  void setAddedDate(Date addedDate){
        this.addedDate=addedDate;
    }

    public  double getX(){
        return x;
    }
    public void setX(double x){
        this.x=x;
    }


}
