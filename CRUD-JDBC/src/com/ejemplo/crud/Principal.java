package com.ejemplo.crud;

import com.ejemplo.crud.controller.UsuarioController;
import com.ejemplo.crud.model.Usuario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	     //	Conexion.conexion();
		
		//crear un objeto sobre controller
		UsuarioController operacionConUsuario = new UsuarioController();
		//crear un objeto para cargar la informacion del usuario
		Usuario usuario = new Usuario("JUAN","123456","carlos angulo","carles1981@gmail.com");
		//usuario.setId(2);
		//operacionConUsuario.listarUsuarios();
		//operacionConUsuario.actualizar(usuario);
		
		//operacionConUsuario.insertar(usuario);
		
		Usuario usuario2 = new Usuario("Jose","248848","Jose Perez","ccnndj@gmail.com");
		
		//operacionConUsuario.insertar(usuario2);
		// llama al metodo para mostrar registros
		//operacionConUsuario.listarUsuarios();
		
		//operacionConUsuario.eliminar(7);
		//operacionConUsuario.listarUsuarios();
		
		operacionConUsuario.buscarUsuario(8);
		
	}

}
