package com.example.service;

public class orderthings {

    int pic;
    String oname;
    String odetail;
    String onumber;
    String date;
    String time;

    public orderthings(int pic, String oname, String odetail, String onumber, String date, String time) {
        this.pic = pic;
        this.oname = oname;
        this.odetail = odetail;
        this.onumber = onumber;
        this.date = date;
        this.time = time;
    }


    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getOdetail() {
        return odetail;
    }

    public void setOdetail(String odetail) {
        this.odetail = odetail;
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
