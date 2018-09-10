package com.andres.loginargumentos.models;

import java.io.Serializable;

public class Usuario implements Serializable{
    private String usuario;
    private String password;
    private String apellidoP;
    private String apellidoM;
    private String nacionalidad;

    public Usuario(String usuario,String password, String apellidoP, String apellidoM, String nacionalidad) {
        this.usuario = usuario;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.nacionalidad = nacionalidad;
        this.password= password;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

