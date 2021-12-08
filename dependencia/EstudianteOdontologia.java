package com.edu.dependencia;

public class EstudianteOdontologia {
	
	private String dientes;
	
	public void pagarServipagos(String nombre) {
		System.out.println(nombre+ "hacer el pago");
		System.out.println(nombre+ "Tarjeta de Odontologo");
	}

	public String getDientes() {
		return dientes;
	}

	public void setDientes(String dientes) {
		this.dientes = dientes;
	}
	
	

}
