package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.dao.EstudianteDAO;
import com.uca.capas.domain.Estudiante;
import com.uca.capas.repositories.EstudianteRepo;

@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	EstudianteRepo estudianteRepo;
	//EstudianteDAO estudianteDAO;

	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		//return estudianteRepo.findAll();
		return estudianteRepo.mostrarTodos();
	}

	@Override
	public Estudiante findOne(Integer code) throws DataAccessException {
		return estudianteRepo.getOne(code);
	}

	@Override
	public void save(Estudiante estudiante) throws DataAccessException {
		estudianteRepo.save(estudiante);
	}

	@Override
	public void delete(Integer code) throws DataAccessException {
		estudianteRepo.deleteById(code);		
	}
	
	@Override
	public List<Estudiante> filterByNombre(String cadena) throws DataAccessException {
		return estudianteRepo.mostrarPorNombre(cadena);		
	}
	
	@Override
	public List<Estudiante> findByApellidoStartingWith(String cadena) throws DataAccessException {
		return estudianteRepo.findByApellidoStartingWith(cadena);		
	}
}
