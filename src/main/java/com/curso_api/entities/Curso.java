package com.curso_api.entities;

import java.math.BigDecimal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "curso_faculdade")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome_curso")
	private String nome;@Column(nullable = false)
	private String area;
	
	@JsonFormat (pattern = "dd/MM/yyyy HH:mm")
	@CreationTimestamp
	@Column(name = "data_criacao")
	private LocalDateTime dataCraiacao;
	
	@JsonFormat (pattern = "dd/MM/yyyy HH:mm")
	@UpdateTimestamp
	@Column(name = "data_atualizacao")
	private LocalDateTime dataAtualizacao;
	
	@NotBlank(message = "não pode deixar o campo em branco")
	@NotNull(message = "não pode deixar o campo nulo")
	private String usuario;
	
	@Transient
	private BigDecimal valorCurso;
	
	@OneToMany(mappedBy = "curso")
	private List<Aluno> alunos = new ArrayList(); 
	
	@PostPersist
	public void persistirDado() {
		this.nome = this.nome + "POST";
	}
	
	@PrePersist
	public void manterDado() {
		this.usuario = "Admin";
	}
	
	public Curso() {
		// TODO Auto-generated constructor stub
	}


	public Curso(String nome, String area) {
		super();
		this.nome = nome;
		this.area = area;
	}

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


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}
	

	public LocalDateTime getDataCraiacao() {
		return dataCraiacao;
	}

	public void setDataCraiacao(LocalDateTime dataCraiacao) {
		this.dataCraiacao = dataCraiacao;
	}


	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public BigDecimal getValorCurso() {
		return valorCurso;
	}

	public void setValorCurso(BigDecimal valorCurso) {
		this.valorCurso = valorCurso;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nome=" + nome + ", area=" + area + "]";
	}

}
