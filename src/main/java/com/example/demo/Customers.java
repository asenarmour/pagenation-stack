package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {

    @Id
    int cnum;
    int rating,snum;
    String cname, city;

    public int getCnum() {
        return cnum;
    }

    public void setCnum(int cnum) {
        this.cnum = cnum;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Customers(int cnum, int rating, int snum, String cname, String city) {
        this.cnum = cnum;
        this.rating = rating;
        this.snum = snum;
        this.cname = cname;
        this.city = city;
    }
    public Customers(){
        super();
    }
}
