package com.ejemplo.excepciones;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		//uso de date
		Date fecha = new Date();
		System.out.println(fecha);
		
		
		int array[] = new int [4];
		
		try {
			array[4] =10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Index 5 out of bounds for length 4");
		}finally {
			System.out.println("En finally");
		}
		System.out.println("Hola");
	}

}
