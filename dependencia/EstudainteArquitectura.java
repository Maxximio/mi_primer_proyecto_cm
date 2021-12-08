package com.edu.dependencia;

public class EstudainteArquitectura extends Estudiante{

	private String idMunicipio;
	
	public void pagarServipagos(String nombre) {
		System.out.println(nombre+ "hacer el pago");
		System.out.println(nombre+ "Pay Pal");
	}

	public String getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(String idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	
	
	
}
