package com.uce.demo2.tarea24.modelo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "libroT24")
public class LibroT {
	
	@Id
	@Column(name = "lib_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lib_seq_id")
	@SequenceGenerator(name = "lib_seq_id", sequenceName = "lib_seq_id", allocationSize = 1)
	private Integer id;

	@Column(name = "lib_titulo")
	private String titulo;
	
	@Column(name = "lib_nombre")
	private Integer paginas;
		
	@OneToMany(mappedBy= "libros", cascade = CascadeType.ALL)
	private Set<AutorLibro> autoresLibrosL;
	
	@Override
	public String toString() {
		return "Libro " + titulo + ", " + paginas;
	}

	//get set
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

	public Set<AutorLibro> getAutoresLibrosL() {
		return autoresLibrosL;
	}

	public void setAutoresLibrosL(Set<AutorLibro> autoresLibrosL) {
		this.autoresLibrosL = autoresLibrosL;
	}
}
