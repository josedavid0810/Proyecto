/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.domain;

/**
 *
 * @author valed
 */

import java.io.Serializable;
import lombok.Data;
import jakarta.persistence.*;

import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name="pedido")
public class Pedido implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_pedido")
    private Long idPedido;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String ruta_imagen;
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    Categoria categoria;

    public Pedido() {
    }

    public Pedido(String pedido, boolean activo) {
        this.descripcion = pedido;
        this.activo = activo;
    }

    public void setRutaImagen(String cargaImagen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
