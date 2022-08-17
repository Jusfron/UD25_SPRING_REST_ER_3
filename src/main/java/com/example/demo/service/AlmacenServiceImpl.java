package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAlmacenDAO;
import com.example.demo.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{
	
	@Autowired
	IAlmacenDAO iAlmacenDAO;

	@Override
	public List<Almacen> listarAlmacenes() {
		// TODO Auto-generated method stub
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenXID(Long id) {
		// TODO Auto-generated method stub
		return iAlmacenDAO.findById(id).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Long id) {
		// TODO Auto-generated method stub
		iAlmacenDAO.deleteById(id);
	}

}
