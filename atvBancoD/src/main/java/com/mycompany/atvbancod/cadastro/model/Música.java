/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atvbancod.cadastro.model;

import java.sql.Date;

/**
 *
 * @author marlu
 */
public class Música {
    private String nomemsc,ISRC,produtores,nomeart, duração;
    private Date datamsc; 

    public Música() {
        this.nomemsc = null;
        this.ISRC = null;
        this.produtores = null;
        this.nomeart = null;
        this.duração = null;
        this.datamsc = null;
    }

    public Música(String nomemsc, String ISRC, String produtores, String nomeart, String duração, Date datamsc) {
        this.nomemsc = nomemsc;
        this.ISRC = ISRC;
        this.produtores = produtores;
        this.nomeart = nomeart;
        this.duração = duração;
        this.datamsc = datamsc;
    }

    public String getNomemsc() {
        return nomemsc;
    }

    public void setNomemsc(String nomemsc) {
        this.nomemsc = nomemsc;
    }

    public String getISRC() {
        return ISRC;
    }

    public void setISRC(String ISRC) {
        this.ISRC = ISRC;
    }

    public String getProdutores() {
        return produtores;
    }

    public void setProdutores(String produtores) {
        this.produtores = produtores;
    }

    public String getNomeart() {
        return nomeart;
    }

    public void setNomeart(String nomeart) {
        this.nomeart= nomeart;
    }

    public String getDuração() {
        return duração;
    }

    public void setDuração(String duração) {
        this.duração = duração;
    }

    public Date getDatamsc() {
        return datamsc;
    }

    public void setDatamsc(Date datamsc) {
        this.datamsc = datamsc;
    }
}
