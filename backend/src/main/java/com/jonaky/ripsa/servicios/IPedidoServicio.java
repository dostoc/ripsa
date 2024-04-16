package com.jonaky.ripsa.servicios;

import com.jonaky.ripsa.entidades.Pedido;

import java.util.List;

public interface IPedidoServicio {

    public List<Pedido> listarPedidos();

    public Pedido buscarPedidoPorID(Long id);

    public Pedido guardarPedido(Pedido pedido);

    public void eliminarPedido(Pedido pedido);
}
