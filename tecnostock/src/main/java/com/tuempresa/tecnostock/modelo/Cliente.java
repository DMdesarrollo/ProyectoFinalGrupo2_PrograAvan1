package com.tuempresa.tecnostock.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Cliente {
    
    @Id @Column(length=10)
    private int id;
    
    @Column(length=50) @Required
    private String nombre;
    
    @Column(length=50) @Required
    private String apellido;
    
    @Column(length=30)
    private String pais;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    
    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }
}