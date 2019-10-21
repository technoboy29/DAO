package com.crud.modelo;

public class Auto {
    private int id;
    private String marca;
    private String referencia;
    private String modelo;
    private String tipo;
    private String llantas;
    private String puertas;
    private String color;
    private String numserie;

    public Auto(){
        
    }

    public Auto(int id, String marca, String referencia, String modelo, String tipo, String llantas, String puertas, String color, String numserie) {
        this.id = id;
        this.marca = marca;
        this.referencia = referencia;
        this.modelo = modelo;
        this.tipo = tipo;
        this.llantas = llantas;
        this.puertas = puertas;
        this.color = color;
        this.numserie = numserie;
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumserie() {
        return numserie;
    }

    public void setNumserie(String numserie) {
        this.numserie = numserie;
    }
    
}
