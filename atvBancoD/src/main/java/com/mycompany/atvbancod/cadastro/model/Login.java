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
public class Login {
    private String nomeu, email;
    private int codigo;

    public Login() {
        this.nomeu = null;
        this.email = null;
        this.codigo = 0;
    }

    public Login(String nomeu, String email, int codigo) {
        this.nomeu = nomeu;
        this.email = email;
        this.codigo = codigo;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
