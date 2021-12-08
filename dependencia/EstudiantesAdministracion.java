package com.edu.dependencia;

public class EstudiantesAdministracion extends Estudiante{
	
	private String niffContabilidad;

	public void pagarServipagos(String nombre) {
		System.out.println(nombre+ "hacer el pago");
		System.out.println(nombre+ "Transferencia");
	}

	public String getNiffContabilidad() {
		return niffContabilidad;
	}

	public void setNiffContabilidad(String niffContabilidad) {
		this.niffContabilidad = niffContabilidad;
	}
	
	
}
