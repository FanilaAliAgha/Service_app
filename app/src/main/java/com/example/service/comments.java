package com.example.service;

public class comments {
    int pic;
    String uname;
    int one;
    int two;
    int three;
    int four;
    int five;
    String comment;

    public comments(int pic, String uname, int one, int two, int three, int four, int five, String comment) {
        this.pic = pic;
        this.uname = uname;
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.comment = comment;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public int getThree() {
        return three;
    }

    public void setThree(int three) {
        this.three = three;
    }

    public int getFour() {
        return four;
    }

    public void setFour(int four) {
        this.four = four;
    }

    public int getFive() {
        return five;
    }

    public void setFive(int five) {
        this.five = five;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
