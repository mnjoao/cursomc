package com.joao.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.joao.cursomc.domain.Categoria;
import com.joao.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	
	@Autowired
	public CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria cat1 = new Categoria(null,"nome");
		Categoria cat2 = new Categoria(null,"informatica");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
;	}

}
