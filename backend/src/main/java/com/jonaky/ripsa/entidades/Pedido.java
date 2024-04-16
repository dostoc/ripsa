package com.jonaky.ripsa.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pedido {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",  strategy = "uuid2")
    private Long id;

    @ManyToOne
    private Cliente cliente;

    private List<Producto> listaDeProductos;

    // realizar un enum para revisar estados del pedido preparado - facturado - despachado etc...

}
