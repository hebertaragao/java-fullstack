package br.com.bancodedadosfuctura.entity;

import java.util.Date;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@DynamicInsert
@DynamicUpdate

public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_pessoa")
	private Integer id;
	
	private String nome;
	
	private Double peso;
	
	@Column(name = "data_nascimento")
	private Date nascimento;
	
	@Column(name = "cor_de_pele")
	private String cutis;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getCutis() {
		return cutis;
	}

	public void setCutis(String cutis) {
		this.cutis = cutis;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", peso=" + peso + ", nascimento=" + nascimento + ", cutis="
				+ cutis + "]";
	}
	
	
	

}