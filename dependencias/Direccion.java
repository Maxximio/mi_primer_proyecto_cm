package com.ecu.edu.inyeccion.dependencias;

public class Direccion {

	private String CallePrincipal;
	private String numeracion;
	
	
	//GETTERS Y SETTERS
	public void borrarDireccion() {
		
	}

	public String getCallePrincipal() {
		return CallePrincipal;
	}

	public void setCallePrincipal(String callePrincipal) {
		CallePrincipal = callePrincipal;
	}

	public String getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}

	@Override
	public String toString() {
		return "Direccion [CallePrincipal=" + CallePrincipal + ", numeracion=" + numeracion + "]";
	}
	
	
	
}
