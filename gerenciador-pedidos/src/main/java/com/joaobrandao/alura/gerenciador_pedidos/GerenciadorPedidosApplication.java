package com.joaobrandao.alura.gerenciador_pedidos;

import com.joaobrandao.alura.gerenciador_pedidos.model.Categoria;
import com.joaobrandao.alura.gerenciador_pedidos.model.Pedido;
import com.joaobrandao.alura.gerenciador_pedidos.model.Produto;
import com.joaobrandao.alura.gerenciador_pedidos.repository.CategoriaRepository;
import com.joaobrandao.alura.gerenciador_pedidos.repository.PedidoRepository;
import com.joaobrandao.alura.gerenciador_pedidos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GerenciadorPedidosApplication implements CommandLineRunner {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private PedidoRepository pedidoRepository;

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Categoria categoria = new Categoria(1L, "Eletrônicos");
//		Produto produto = new Produto("Carro", 35000.0);
//		Pedido pedido = new Pedido(1L, LocalDate.now());
//
//		// Salvar no banco de dados
//		produtoRepository.save(produto);
//		categoriaRepository.save(categoria);
//		pedidoRepository.save(pedido);


		System.out.println("Dados salvos com sucesso!");
// Busca todos os produtos do banco de dados
		List<Produto> produtos = produtoRepository.findAll();

// Itera sobre a lista de produtos e exibe o nome de cada um
		produtos.stream().forEach(p -> System.out.println(p.getNome()));
	}
}
