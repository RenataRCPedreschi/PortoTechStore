package com.portotechstore.portotechstore.model;

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

@Entity //Indica que essa classe será uma entidade
@Table(name = "produtos") //Nome da tabela no banco de dados
public class ProdutoModel {

	//Campos da Tabela: ID,NOME,PRECO_VENDA,PRECO_CUSTO,QTDE_ESTOQUE,DATA_CADASTRO
	
	//Id do Produto
	@Id//Chave primária
	@GeneratedValue(strategy= GenerationType.IDENTITY) //Gerador automático de Ids (Ex: 1,2,3,4,5...)
	private long id;
	
	//Nome Produtos
	@NotNull //Obrigatório
	@Size(min=3,max=30) // Qtde de caracteres no nome
	private String nome;

	//Preço de Venda
	@NotNull //??????????? É apenas isso mesmo?
	private double preco_venda;
	
	//Preço de custo
	@NotNull //??????????? É apenas isso mesmo?
	private double preco_custo;
	
	//Qtde Estoque
	@NotNull //??????????? É apenas isso mesmo?
	private int qtde_estoque;
	
	//Data de Cadastro
	@Temporal(TemporalType.TIMESTAMP) //Informando que o tipo de dado é um tipo date timestamp
	private Date date = new java.sql.Date(System.currentTimeMillis());//Captura a data exata que o dado  foi inserido
<<<<<<< HEAD
=======

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco_venda() {
		return preco_venda;
	}

	public void setPreco_venda(double preco_venda) {
		this.preco_venda = preco_venda;
	}

	public double getPreco_custo() {
		return preco_custo;
	}

	public void setPreco_custo(double preco_custo) {
		this.preco_custo = preco_custo;
	}

	public int getQtde_estoque() {
		return qtde_estoque;
	}

	public void setQtde_estoque(int qtde_estoque) {
		this.qtde_estoque = qtde_estoque;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
>>>>>>> 6ae8fa3e198ece40821c1c841f2b780f697e3288
}