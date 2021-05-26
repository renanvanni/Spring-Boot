package org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity //entidade, ou seja, fala para o programa trabalhar com tabelas
@Table(name = "tb_postagem")//cria essa tabela no MySQL
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //identifica id como chave primária
	private long id;
	
	@NotNull //não deixa o campo ser vazio
	@Size(min = 5, max = 100)//determina o tamanho min e max do titulo
	private String title;
	
	@NotNull
	@Size(min = 10, max = 500)
	private String text;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis()); //ao programa rodar, essa linha tráz exatamente a data e hora da postagem

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
