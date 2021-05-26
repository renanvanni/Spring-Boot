package org.generation.blogpessoal.repository;

import java.util.List;

import org.generation.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//serve para avisar que essa pasta é um repositório
public interface PostagemRepository extends JpaRepository<Postagem, Long>{//postagem é da classe model e long tem que ser escrito Long no estilo primitivo

	public List<Postagem> findAllByTitleContainingIgnoreCase(String title);//containing serve como o like e tráz tudo o que essa variável title tem no banco de dados/IgnoreCase serve para não ligar se as letras são maiúsculas ou minusculas
	
}
