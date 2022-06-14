package com.ejemplo.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public static String databasename="test2"; //nombre de la base de datos
	public static String dbURL ="jdbc:mysql://localhost:3306/"+ databasename;	//direccion de la base de datos
	public static String username ="root";  //usuario de la base de datos
	public static String password ="";  //password de la base de datos
	
	public static Connection conexion() {
		
		Connection conect=null;
		
		try {
			 conect = DriverManager.getConnection(dbURL,username,password);
			if(conect!=null) {
				System.out.println("Conexion exitosa");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conect;
	}

}
