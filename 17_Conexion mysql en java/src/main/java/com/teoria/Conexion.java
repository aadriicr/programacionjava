package com.teoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//base de datos en mysql con una tabla 
		
		//conectar la base de datos, hacer select, y mostrar el resultado en la consola
		
		//base de datos: mysql
		
		//phpmyadmin para gestionar mysql
		
		//codigo en java para conectar con MYSQL : conector java para MYSQL. fabricante de mysql
		
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root", "curso") ;
			System.out.println(conexion);
			Statement st = conexion.createStatement();
			
			ResultSet rs = st.executeQuery("select * from clientes");
			System.out.println(rs);
			while(rs.next()) {
				System.out.println(rs.getString("nombre"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
