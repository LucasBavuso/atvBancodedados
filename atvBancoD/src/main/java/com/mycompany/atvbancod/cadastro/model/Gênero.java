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
public class Gênero {
    private String nomeg,nomemsc,nomealb, nomeart;
    private int nmrmsc;

    public Gênero() {
        this.nomeg = null;
        this.nomemsc = null;
        this.nomealb = null;
        this.nomeart = null;
        this.nmrmsc = 0;
    }

    public Gênero(String nomeg, String nomemsc, String nomealb, String nomeart, int nmrmsc) {
        this.nomeg = nomeg;
        this.nomemsc = nomemsc;
        this.nomealb = nomealb;
        this.nomeart = nomeart;
        this.nmrmsc = nmrmsc;
    }

    public String getNomeg() {
        return nomeg;
    }

    public void setNomeg(String nomeg) {
        this.nomeg = nomeg;
    }

    public String getNomemsc() {
        return nomemsc;
    }

    public void setNomemsc(String nomemsc) {
        this.nomemsc = nomemsc;
    }

    public String getNomealb() {
        return nomealb;
    }

    public void setNomealb(String nomealb) {
        this.nomealb = nomealb;
    }

    public String getNomeart() {
        return nomeart;
    }

    public void setNomeart(String nomeart) {
        this.nomeart = nomeart;
    }

    public int getNmrmsc() {
        return nmrmsc;
    }

    public void setNmrmsc(int nmrmsc) {
        this.nmrmsc = nmrmsc;
    }
}
