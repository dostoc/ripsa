package com.jonaky.ripsa.repocitorios;

import com.jonaky.ripsa.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepocitorio extends JpaRepository<Cliente,Long> {
}
