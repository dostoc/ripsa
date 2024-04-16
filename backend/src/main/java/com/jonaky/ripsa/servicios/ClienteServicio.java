package com.jonaky.ripsa.servicios;

import com.jonaky.ripsa.entidades.Cliente;
import com.jonaky.ripsa.repocitorios.ClienteRepocitorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteServicio implements IClienteServicio {

    @Autowired
    private ClienteRepocitorio clienteRepocitorio;

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepocitorio.findAll();
    }

    @Override
    public Cliente buscarClientePorId(Long idCliente) {
        return clienteRepocitorio.findById(idCliente).orElse(null);
    }

    @Override
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepocitorio.save(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteRepocitorio.delete(cliente);
    }
}
