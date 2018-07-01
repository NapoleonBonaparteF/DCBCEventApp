package com.dcbc.scs_admin.dcbceventapp;



public class Event {
    private String to;
    private String from;
    private String subject;
    private String message;
    private boolean flag;

    public Event(String to, String from, String subject, String message, String flag){
        this.to = to;
    }

    public void flagCurrentMessage(){
        this.flag = true;
    }

    public void unflagCurrentMessage(){
        this.flag = false;
    }

    public String toString() {
        return this.to + " " + this.from + " " + this.subject+ " " + this.message;
    }

    public String getTitle() {
        return subject;
    }

    public String getMailer() {
        return from;
    }
    public String getReciever() {
        return to;
    }

    public String getMessage() {
        return message;
    }

    public Boolean getFlag() {
        return flag;
    }
}
