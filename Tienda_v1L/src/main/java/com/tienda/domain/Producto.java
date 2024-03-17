/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author alexa
 */
@Data
@Entity
@Table(name = "producto")

public class Producto {

    @ManyToAny
    @JoinColumn(name = "id_categoria")
    Categoria categoria;
    private static final long serialVersionUID = 1L; //para poder hacer el ciclo de la sumatoria de la categoria.

    @Id //id categoria es la llave de la tabla categoria. 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Los valores generados que estrategia usan, identico a la BD 
    @Column(name = "id_producto") //decir cual es el nombre en la base de datos. Se hace la asociación 
    private long idProducto;
    private long idCategoria;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String ruta_imagen;
    private boolean activo;

    public Producto() {
    }

    public Producto(String descripcion, boolean activo) {

        this.descripcion = descripcion;
        this.activo = activo;
    }

}
