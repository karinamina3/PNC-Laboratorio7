package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(schema = "public", name = "estudiante")
public class Estudiante {

	@Id
	@Column(name = "c_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoEstudiante;
	
	@Column(name = "nombre")
	@Size(message = "El nombre no debe tener mas de 50 caracteres", max = 50)
	@NotEmpty(message = "Este campo no puede estar vacio")
	private String nombre;
	
	@Column(name = "apellido")
	@Size(message = "El apellido no debe tener mas de 50 caracteres", max = 50)
	@NotEmpty(message = "Este campo no puede estar vacio")
	private String apellido;
	
	@Column(name = "carne")
	@Size(message = "El carnet no debe tener mas de 10 caracteres", max = 10)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Pattern(regexp = "([0-9]*)$", message = "El carnet solo debe contener numeros")
	private String carnet;
	
	@Column(name = "carrera")
	@Size(message = "La carrera no debe tener mas de 100 caracteres", max = 100)
	@NotEmpty(message = "Este campo no puede estar vacio")
	private String carrera;
	
	
	public Estudiante() {
	
	}

	public Integer getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(Integer codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
}
