package com.ecu.edu.inyeccion.dependencias;

public class Matriculacion {

	private int anio;
	private String semestre;
	private Estudiante estudiante;
	private Direccion  direccion;
	
	public Matriculacion(Estudiante estudiante,Direccion direccion) {
		this.estudiante=estudiante;
		this.direccion=direccion;
	}
	
	
	public String Matricular(String nombre,String apellido, String calleP,String numeracion) {
		
		this.estudiante.setApellido(nombre);
		this.estudiante.setApellido(apellido);
		
		this.direccion.setCallePrincipal(calleP);
		direccion.setNumeracion(numeracion);
		
		this.estudiante.setDireccion(direccion);
		
		System.out.println(this.estudiante);
		
		//logica para guardar los datos de la matricula y el estudiante
		return "Guardado de Estudiante...";
	}

	// GETTERS Y SETTERS
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	
	
}
