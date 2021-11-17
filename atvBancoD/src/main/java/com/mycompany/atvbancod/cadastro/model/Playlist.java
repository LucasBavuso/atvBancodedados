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
public class Playlist {
    private String nomep,nomemsc,criador,nomeart;
    private int IDP, nmrmscp;        

    public Playlist() {
        this.nomep = null;
        this.nomemsc = null;
        this.criador = null;
        this.nomeart = null;
        this.IDP = 0;
        this.nmrmscp = 0;
    }

    public Playlist(String nomep, String nomemsc, String criador, String nomeart, int IDP, int nmrmscp) {
        this.nomep = nomep;
        this.nomemsc = nomemsc;
        this.criador = criador;
        this.nomeart = nomeart;
        this.IDP = IDP;
        this.nmrmscp = nmrmscp;
    }

    public String getNomep() {
        return nomep;
    }

    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    public String getNomemsc() {
        return nomemsc;
    }

    public void setNomemsc(String nomemsc) {
        this.nomemsc = nomemsc;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public String getNomeart() {
        return nomeart;
    }

    public void setNomeart(String nomeart) {
        this.nomeart = nomeart;
    }

    public int getIDP() {
        return IDP;
    }

    public void setIDP(int IDP) {
        this.IDP = IDP;
    }

    public int getNmrmscp() {
        return nmrmscp;
    }

    public void setNmrmscp(int nmrmscp) {
        this.nmrmscp = nmrmscp;
    }
}
