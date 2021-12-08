package com.ecu.edu.inyeccion.dependencias;

import java.util.Scanner;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingrese el nombre: ");
		String nombre=scanner.nextLine();
		
		System.out.println("Ingrese el apellido: ");
		String apellido=scanner.nextLine();
		
		System.out.println("Ingrese la calle principal: ");
		String calle=scanner.nextLine();
		
		System.out.println("Ingrese la numeracion: ");
		String numeracion=scanner.nextLine();
		
		Matriculacion matricula=new Matriculacion(new Estudiante(),new Direccion());
		matricula.setAnio(2015);
		matricula.setSemestre("Sexto");
		
		String mensaje=matricula.Matricular(nombre,apellido,calle,numeracion);
		System.out.println(mensaje);
		
	}

}
