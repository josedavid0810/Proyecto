/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.veterinaria.service;

/**
 *
 * @author valed
 */

import com.veterinaria.domain.Pedido;
import java.util.List;

import java.util.List;

public interface PedidoService {
    // Se obtiene un listado de pedidos en un List
    public List<Pedido> getPedidos(boolean activos);
    
   // Se obtiene un Pedido, a partir del id de un pedido
    public Pedido getPedido(Pedido pedido);
    
    // Se inserta un nuevo pedido si el id del pedido esta vacío
    // Se actualiza un pedido si el id del pedido NO esta vacío
    public void save(Pedido pedido);
    
    // Se elimina el pedido que tiene el id pasado por parámetro
    public void delete(Pedido pedido);
}
