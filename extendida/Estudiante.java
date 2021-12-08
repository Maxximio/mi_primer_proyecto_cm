package com.edu.inyeccion.inyeccion.extendida;

public class Estudiante {

	private String nombre;
	private String apellido;
	private Direccion direccion;
	
	
	public void pagarServipagos(String nombre) {
		
		/*if (facultad==1) {
			System.out.println(nombre+" presenta el pago con tarjeta");
			System.out.println("Pago concretado");
		}else if (facultad==2){
			*/System.out.println(nombre+" presenta el pago efectivo");
			System.out.println("Pago concretado");
		/*}else {
			System.out.println("Facultad no valida");
		}*/
		
	}
	
	

	//GETTERS Y SETTERS
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}

	
	
}
