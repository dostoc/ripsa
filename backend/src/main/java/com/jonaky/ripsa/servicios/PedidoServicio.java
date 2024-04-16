package com.jonaky.ripsa.servicios;

import com.jonaky.ripsa.entidades.Pedido;
import com.jonaky.ripsa.repocitorios.PedidoRepocitorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PedidoServicio implements IPedidoServicio{

    @Autowired
    public PedidoRepocitorio pedidoRepocitorio;
    @Override
    public List<Pedido> listarPedidos() {
        return pedidoRepocitorio.findAll();
    }

    @Override
    public Pedido buscarPedidoPorID(Long id) {
        return pedidoRepocitorio.findById(id).orElse(null);
    }

    @Override
    public Pedido guardarPedido(Pedido pedido) {
        return pedidoRepocitorio.save(pedido);
    }

    @Override
    public void eliminarPedido(Pedido pedido) {
        pedidoRepocitorio.delete(pedido);
    }
}
