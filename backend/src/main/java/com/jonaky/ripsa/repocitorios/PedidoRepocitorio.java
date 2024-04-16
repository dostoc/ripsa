package com.jonaky.ripsa.repocitorios;

import com.jonaky.ripsa.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepocitorio extends JpaRepository<Pedido, Long> {
}
