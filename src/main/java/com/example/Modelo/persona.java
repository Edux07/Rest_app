package com.example.Modelo;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class persona {

        private long id;
        private String nombre;
        private int edad;
        private double peso;

    public persona() {
    }

    public persona(long id, String nombre, int edad, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}


