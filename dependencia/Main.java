package com.edu.dependencia;

import java.util.Scanner;

public class Main {

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
		
		Matriculacion matricula=new Matriculacion();
		matricula.setAnio(2015);
		matricula.setSemestre("Sexto");
		
		String mensaje=matricula.Matricular(nombre,apellido,calle,numeracion,tipo);
		System.out.println(mensaje);
		
	}

}
