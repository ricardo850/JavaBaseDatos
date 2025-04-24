package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "user" )
public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

private String nombre;

private int cedula;


    public Usuario() {
    }

    public Usuario(int id, String nombre, int cedula) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
