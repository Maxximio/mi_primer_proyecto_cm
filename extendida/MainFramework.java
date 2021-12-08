package com.edu.inyeccion.inyeccion.extendida;

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
		
		System.out.println("Ingrese tipo");
		Scanner scannerInt;
		int tipo = scannerInt.nextInt();
		
		Estudiante estudiante;
		
		if(tipo==1) {
			estudiante = new Estudiante();
		}else if(tipo==2) {
			estudiante = new EstudianteOdontologia();
		}else if(tipo==3){
			estudiante = new EstudianteArquitetura();
		}else {
			estudiante = new EstudiantesAdministracion();
		}
		
		/*System.out.println("Numeracion de facultades: Medicina=1, Ingenieria=2");
		System.out.println("Ingrese la facultad: ");
		int facultad=scanner.nextInt();*/
		
		Matriculacion matricula=new Matriculacion(new Estudiante(),new Direccion());
		matricula.setAnio(2015);
		matricula.setSemestre("Sexto");
		
		String mensaje=matricula.Matricular(nombre,apellido,calle,numeracion);
		System.out.println(mensaje);
		
	}

}
