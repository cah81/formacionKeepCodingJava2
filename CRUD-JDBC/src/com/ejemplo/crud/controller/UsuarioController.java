package com.ejemplo.crud.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ejemplo.crud.Conexion;
import com.ejemplo.crud.model.Usuario;

public class UsuarioController {
	//metodo para insertar en la base de datos
	
	
	public void insertar(Usuario usuario) {
		
		//la consulta sql para insertar datos en la base de datos
		String sql = "INSERT INTO usuarios(username,password,fullname,email) VALUES(?,?,?,?)";
		//clase de java.sql para pasar una consulta sql a la base de datos
		PreparedStatement  statement; //para pasar la consulta a la base de datos
		
		try {
			//pasamos la conexion a base de datos y tambien la consulta
			//el valor String sql
			statement =Conexion.conexion().prepareStatement(sql);
			statement.setString(1,usuario.getUsername());
			statement.setString(2,usuario.getPassword());
			statement.setString(3,usuario.getFullname());
			statement.setString(4,usuario.getEmail());
			//cuando se ejecute esto va a devolver un entero
			//si es mayor a cero me fue bien
			//el execute me devuelve las filas afectadas
			int rowsInserted = statement.executeUpdate();
			//
			if(rowsInserted>0) {
				System.out.println("Los registros fueron insertados correctamente");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void listarUsuarios() {
		
		String sql = "SELECT *FROM usuarios";
		
		try {
			Statement statement = Conexion.conexion().createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			int cont=0;
			
			//recorre todas las posiciones con el .next
			//el result se usa para listar posiciones
			while (result.next()) {
				String username = result.getString(2);
				String password = result.getString(3);
				String fullname = result.getString(4);// se puede pasar como "fullname y se trae el valor del campo
				String email = result.getString(5);
				cont++;
				System.out.println("#usuario: "+cont+"- " + "nombre: " +username + "- " + "Password: "+ password + "- " +"Fullname: "+ fullname+ " "+ "Correo: " + email);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
	
	public void actualizar(Usuario usuario) {
		
		String sql ="UPDATE usuarios SET username =?,password=?,fullname=?,email=? WHERE id=?";
		
		PreparedStatement statement;
		try {
			//pasamos la conexion a base de datos y tambien la consulta
			//el valor String sql
			statement =Conexion.conexion().prepareStatement(sql);
			statement.setString(1,usuario.getUsername());
			statement.setString(2,usuario.getPassword());
			statement.setString(3,usuario.getFullname());
			statement.setString(4,usuario.getEmail());
			statement.setInt(5,usuario.getId());
			//estas instruccion es para ver si funcion la actualizacion
			//o el registro
			int rowsInserted = statement.executeUpdate();
			if(rowsInserted>0) {
				System.out.println("Los registros fueron actualizados correctamente");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	
	public void eliminar(int id) {
		
		String sql = "DELETE FROM usuarios WHERE id=?";
		
		try {
			PreparedStatement statement = Conexion.conexion().prepareStatement(sql);
			statement.setInt(1,id);
			int rowsDeleted = statement.executeUpdate();
			if(rowsDeleted>0) {
				System.out.println("Usuario Eliminado exitosamente");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	public void buscarUsuario(int id) {
		
String sql = "SELECT *FROM usuarios where id =" +id;
		
		try {
			Statement statement = Conexion.conexion().createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			int cont=0;
			
			//recorre todas las posiciones con el .next
			//el result se usa para listar posiciones
			while (result.next()) {
				String username = result.getString(2);
				String password = result.getString(3);
				String fullname = result.getString(4);// se puede pasar como "fullname y se trae el valor del campo
				String email = result.getString(5);
				cont++;
				System.out.println("#usuario: "+cont+"- " + "nombre: " +username + "- " + "Password: "+ password + "- " +"Fullname: "+ fullname+ " "+ "Correo: " + email);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

}
}
