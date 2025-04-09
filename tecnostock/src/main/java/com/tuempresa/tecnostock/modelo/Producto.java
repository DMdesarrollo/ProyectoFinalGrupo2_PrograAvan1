package com.tuempresa.tecnostock.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Producto {
    
    @Id @Column(length=10)
    private int id;
    
    @Column(length=50) @Required
    private String nombre;
    
    @Money 
    private double precioUnitario;
    
    @Stereotype("MEMO")
    private String descripcion;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }
    
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}