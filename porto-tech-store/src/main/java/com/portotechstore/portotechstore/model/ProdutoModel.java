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

@Entity //indica que essa classe será uma entidade
@Table(name="produtos") //Nome da tabela no banco de dados

public class ProdutoModel {

	////ID_PRODUTO,NOME_PRODUTO,PRECO_VENDA,PRECO_CUSTO,QTDE_ESTOQUE,DATA_CADASTRO
	
	@Id //Chave primaria
	@GeneratedValue(strategy= GenerationType.IDENTITY) // gerador automático de Ids(Ex: 1,2,3,4,5..)
	private long id;
	 
	//Nome Produto
	@NotNull // Obrigatório
	@Size(min=3,max=30) //qtde de caracteres do nome
	private String nome;
	
	//Preço de Venda
	@NotNull ///????? 
	private double preco_venda;
	
	//Preço de Custo
	@NotNull 
	private double preco_custo;
	
	//Qtde Estoque
	@NotNull
	private double qtde_estoque;
	
	//Data do Cadastro
		
	@Temporal(TemporalType.TIMESTAMP) //Informando que o tipo de dado é um tipo date timestamp
    private Date date = new java.sql.Date(System.currentTimeMillis());
	
	//save
	
	
}
