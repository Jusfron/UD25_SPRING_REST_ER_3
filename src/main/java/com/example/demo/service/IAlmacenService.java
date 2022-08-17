package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Almacen;

public interface IAlmacenService {
	
	//Metodos del CRUD
			public List<Almacen> listarAlmacenes(); //Listar All 
			
			public Almacen guardarAlmacen(Almacen almacen);	//Guarda un Almacen CREATE
			
			public Almacen almacenXID(Long id); //Leer datos de un Almacen READ
			
			public Almacen actualizarAlmacen(Almacen almacen); //Actualiza datos del Almacen UPDATE
			
			public void eliminarAlmacen(Long id);// Elimina el Almacen DELETE

}
