/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atvbancod.cadastro.model;

/**
 *
 * @author marlu
 */
public class Artista {
    private String nomealb, nomemsc, nomeart;
    private int IDart;

    public Artista() {
        this.nomealb = null;
        this.nomemsc = null;
        this.nomeart = null;
        this.IDart = 0;
    }

    public Artista(String nomealb,String nomemsc, String nomeart, int IDart) {
        this.nomealb = nomealb;
        this.nomemsc = nomemsc;
        this.nomeart = nomeart;
        this.IDart = IDart;
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
        this.nomemsc = nomemsc;
    }

    public String getNomeart() {
        return nomeart;
    }

    public void setNomeart(String nomeart) {
        this.nomeart = nomeart;
    }

    public int getIDart() {
        return IDart;
    }

    public void setIDart(int IDart) {
        this.IDart = IDart;
    }
}
