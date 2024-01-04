package com.farmacia.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo categoria é obrigatorio !!")
	@Size(min = 5, max = 100, message = "O atributo categoria deve conter no mínimo 05 e no máximo 100 caracteres")
	@Column(length = 100)
	private String nome;

	@Size(max = 1000, message = "O atributo texto deve conter no máximo 1000 caracteres")
	private String icone;

	@NotBlank(message = "O atributo descrição é obrigatório!")
	private String descricaoCategoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIcone() {
		return icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

	public String getDescricao() {
		return descricaoCategoria;
	}

	public void setDescricao(String descricao) {
		this.descricaoCategoria = descricao;
	}

}
