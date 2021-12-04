package com.edu.dependencia;

public class Matriculacion {

	private int anio;
	private String semestre;
	private Estudiante estudiante;
	
	
	public String Matricular(String nombre,String apellido, String calleP,String numeracion) {
		this.estudiante =new Estudiante();//JVM: heap//ID
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		
		Direccion direccion=new Direccion();
		direccion.setCallePrincipal(calleP);
		direccion.setNumeracion(numeracion);
		
		this.estudiante.setDireccion(direccion);
		
		//System.out.println(nombre+" "+apellido+" "+calleP+" "+numeracion);
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
