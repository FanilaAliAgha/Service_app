package com.example.service;

public class notification {


    String nmsg;
    String time;


    public notification(String nmsg, String time) {
        this.nmsg = nmsg;
        this.time = time;
    }


    public String getNmsg() {
        return nmsg;
    }

    public void setNmsg(String nmsg) {
        this.nmsg = nmsg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
