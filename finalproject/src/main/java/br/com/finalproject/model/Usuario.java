package br.com.finalproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_USUARIO")
public class Usuario {
	@Column(name="id")
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nome", length = 100)
	private String nome;
	
	@Column (name="racf", length = 10)
	private String racf;
	
	@Column(name="senha",length = 20)
	private String senha;
	
	@Column(name="foto", length = 100)
	private String foto;
	
	
	
	
	
	
}
