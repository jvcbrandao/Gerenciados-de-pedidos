package com.joaobrandao.alura.gerenciador_pedidos.repository;

import com.joaobrandao.alura.gerenciador_pedidos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
