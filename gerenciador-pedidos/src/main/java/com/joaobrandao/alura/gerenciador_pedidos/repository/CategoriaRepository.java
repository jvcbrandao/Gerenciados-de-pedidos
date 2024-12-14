package com.joaobrandao.alura.gerenciador_pedidos.repository;

import com.joaobrandao.alura.gerenciador_pedidos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
