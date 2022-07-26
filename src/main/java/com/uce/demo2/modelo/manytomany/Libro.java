package com.uce.demo2.modelo.manytomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {
	
	@Id
	@Column(name = "lib_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lib_seq_id")
	@SequenceGenerator(name = "lib_seq_id", sequenceName = "lib_seq_id", allocationSize = 1)
	private Integer id;

	@Column(name = "lib_titulo")
	private String titulo;
	
	@Column(name = "lib_nombre")
	private Integer paginas;
	
//con list se puede pero no es lo optimo para el mapeo
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "libro_autor",
				joinColumns = @JoinColumn(name="liau_id_libro"),
				inverseJoinColumns = @JoinColumn(name="liau_id_autor"))
	private Set<Autor> autores;
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", paginas=" + paginas + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}


	public Set<Autor> getAutores() {
		return autores;
	}


	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}
}
