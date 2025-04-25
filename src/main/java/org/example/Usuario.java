package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios" )
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


private String NombreApellido;

private int cedula;


    public Usuario() {
    }

    public Usuario(String NombreApellido, int cedula) {
        this.NombreApellido  = NombreApellido ;
        this.cedula = cedula;
    }

    public String getNombreApellido() {
        return NombreApellido;
    }

    public void setNombreApellido(String NombreApellido) {
        this.NombreApellido = NombreApellido;
    }

    public int getId() {
        return id;
    }


    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
