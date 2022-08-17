package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Almacen;
import com.example.demo.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {
	
	@Autowired
	AlmacenServiceImpl almacenServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes() {
		return almacenServiceImpl.listarAlmacenes();
	}
	
	@PostMapping("/almacenes")
	public Almacen salvarAlmacen(@RequestBody Almacen almacen) {
		return almacenServiceImpl.guardarAlmacen(almacen);
	}

	@GetMapping("/almacenes/{id}")
	public Almacen almacenXID(@PathVariable(name="id") Long id) {
		
		Almacen almacen_xid= new Almacen();
		
		almacen_xid=almacenServiceImpl.almacenXID(id);
		
		System.out.println("Almacen XID: "+almacen_xid);
		
		return almacen_xid;
	}
	
	@PutMapping("/almacenes/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name="id")Long id,@RequestBody Almacen almacen) {
		
		Almacen almacen_seleccionado= new Almacen();
		Almacen almacen_actualizado= new Almacen();
		
		almacen_seleccionado= almacenServiceImpl.almacenXID(id);
		
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());
		
		almacen_actualizado = almacenServiceImpl.actualizarAlmacen(almacen_seleccionado);
		
		System.out.println("El almacen actualizado es: "+ almacen_actualizado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacenes/{id}")
	public String eliminarAlmacen(@PathVariable(name = "id") Long id) {
		try {
			almacenServiceImpl.eliminarAlmacen(id);
			return "Almacen eliminado";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
}
