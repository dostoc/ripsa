package com.jonaky.ripsa.servicios;

import com.jonaky.ripsa.entidades.Cliente;

import java.util.List;

public interface IClienteServicio {

    // listar / buscar / guardar / eliminar

    public List<Cliente> listarClientes();

    public Cliente buscarClientePorId(Long idCliente);

    public Cliente guardarCliente(Cliente cliente);

    public void eliminarCliente(Cliente cliente);

}
