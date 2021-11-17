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
public class Cadastrar {
    private String nomeu, email;

    public Cadastrar() {
        this.nomeu = null;
        this.email = null;
    }

    public Cadastrar(String nomeu, String email) {
        this.nomeu = nomeu;
        this.email = email;
    }

    public String getNomeu() {
        return nomeu;
    }

    public void setNomeu(String nomeu) {
        this.nomeu = nomeu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
