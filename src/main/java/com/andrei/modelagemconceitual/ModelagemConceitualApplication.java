package com.andrei.modelagemconceitual;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.andrei.modelagemconceitual.domain.Categoria;
import com.andrei.modelagemconceitual.repositories.CategoriaRepository;

@SpringBootApplication
public class ModelagemConceitualApplication implements CommandLineRunner{
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	//TROCAR PORTA DO SERVIDOR:
	//DENTRO DE SRC/MAIN/RESOURCES: APPLICATION.PROPERTIES
	//server.port=${port:8081}
	public static void main(String[] args) {
		SpringApplication.run(ModelagemConceitualApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}
}
