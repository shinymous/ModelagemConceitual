package com.andrei.modelagemconceitual;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.andrei.modelagemconceitual.domain.Categoria;
import com.andrei.modelagemconceitual.domain.Cidade;
import com.andrei.modelagemconceitual.domain.Cliente;
import com.andrei.modelagemconceitual.domain.Endereco;
import com.andrei.modelagemconceitual.domain.Estado;
import com.andrei.modelagemconceitual.domain.ItemPedido;
import com.andrei.modelagemconceitual.domain.Pagamento;
import com.andrei.modelagemconceitual.domain.PagamentoComBoleto;
import com.andrei.modelagemconceitual.domain.PagamentoComCartao;
import com.andrei.modelagemconceitual.domain.Pedido;
import com.andrei.modelagemconceitual.domain.Produto;
import com.andrei.modelagemconceitual.domain.enums.EstadoPagamento;
import com.andrei.modelagemconceitual.domain.enums.TipoCliente;
import com.andrei.modelagemconceitual.repositories.CategoriaRepository;
import com.andrei.modelagemconceitual.repositories.CidadeRepository;
import com.andrei.modelagemconceitual.repositories.ClienteRepository;
import com.andrei.modelagemconceitual.repositories.EnderecoRepository;
import com.andrei.modelagemconceitual.repositories.EstadoRepository;
import com.andrei.modelagemconceitual.repositories.ItemPedidoRepository;
import com.andrei.modelagemconceitual.repositories.PagamentoRepository;
import com.andrei.modelagemconceitual.repositories.PedidoRepository;
import com.andrei.modelagemconceitual.repositories.ProdutoRepository;

@SpringBootApplication
public class ModelagemConceitualApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ModelagemConceitualApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
	}
}
