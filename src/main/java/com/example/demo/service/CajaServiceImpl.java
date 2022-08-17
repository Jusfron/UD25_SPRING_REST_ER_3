package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajaDAO;
import com.example.demo.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
		@Autowired
	ICajaDAO iCajaDAO;

	@Override
	public List<Caja> listarCajas() {
		// TODO Auto-generated method stub
		return iCajaDAO.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		// TODO Auto-generated method stub
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja cajaXID(Long id) {
		// TODO Auto-generated method stub
		return iCajaDAO.findById(id).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		// TODO Auto-generated method stub
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(Long id) {
		// TODO Auto-generated method stub
		iCajaDAO.deleteById(id);
	}

}
