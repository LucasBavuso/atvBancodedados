
package com.mycompany.atvbancod.cadastro.model;

import java.sql.Date;

public class Album {
    private String nomealb, nomemsc, nomeart;
    private int ID, totalmsc;
    private Date dataalb;   

    public Album() {
        this.nomealb = "";
        this.nomemsc = "";
        this.nomeart = "";
        this.ID = 0;
        this.totalmsc = 0;
        this.dataalb = null;
    }

    public Album(String nomealb, String nomemsc, String nomeart, int ID, int totalmsc, Date dataalb) {
        this.nomealb = nomealb;
        this.nomemsc= nomemsc;
        this.nomeart = nomeart;
        this.ID = ID;
        this.totalmsc = totalmsc;
        this.dataalb = dataalb;
    }

    public String getNomealb() {
        return nomealb;
    }

    public void setNomealb(String nomealb) {
        this.nomealb = nomealb;
    }

    public String getNomemsc() {
        return nomemsc;
    }

    public void setNomemsc(String nomemsc) {
        this.nomemsc= nomemsc;
    }

    public String getNomeart() {
        return nomeart;
    }

    public void setNomeart(String nomeart) {
        this.nomeart = nomeart;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTotalmsc() {
        return totalmsc;
    }

    public void setTotalmsc(int totalmsc) {
        this.totalmsc = totalmsc;
    }

    public Date getDataalb() {
        return dataalb;
    }

    public void setData(Date dataalb) {
        this.dataalb = dataalb;
    }
}
