package com.example.demo.dto;

import javax.persistence.*;

@Entity
@Table(name="cajas")//en caso que la tabla sea diferente
public class Caja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "contenido")
	private String contenido;
	@Column(name = "valor")
	private int valor;
	
	@ManyToOne
    @JoinColumn(name="almacen")
	private Almacen almacen;

	public Caja() {
		super();
	}
	
	public Caja(Long id, String contenido, int valor, Almacen almacen) {
		super();
		this.id = id;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	
	

}
