package com.edufgs.minhasfinancas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Diz pada o JPA que é uma entidade
@Table(name = "usuario", schema = "financas") //Definição da tabela que vai criar no banco de dados. Vai ter o nome e o schema que vai estar no banco de dados
//Usando o Lombok em vez de digitar o set e get entre outros
@Data //Já tem tudo que get, set, constructor, entre outros. Mas tambem pode colocar um por um.(@Setter, @Getter, .....)
@Builder //Construir um objeto mais facil
@NoArgsConstructor //Cria um construtor sem argumento 
@AllArgsConstructor //Cria um construtor com argumento
public class Usuario {
	
	//Mapeamento das colunas
	@Id //Diz que é o Id primario
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Indica que o provedor de persistência deve atribuir chaves primárias para a entidade usando uma coluna de identidade do banco de dados.
	private Long id;
	
	//Mapeamento das colunas
	@Column(name = "nome")
	private String nome;
	
	//Mapeamento das colunas
	@Column(name = "email")
	private String email;
	
	//Mapeamento das colunas
	@Column(name = "senha")
	@JsonIgnore //Diz para não mandar a senha via JSON
	private String senha;
	
}
