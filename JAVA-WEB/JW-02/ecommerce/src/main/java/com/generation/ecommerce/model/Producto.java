package com.generation.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
	
	@Entity
	
	@Table(name = "Producto")
	
	
public class Producto {

		
		@Id
		@GeneratedValue
		
	

	//Atributos
	private Long id;
	private String nombre;
	private String descripcion;
	private String URL_Imagen;
	private double precio;

	//Constructor vacío para el jackson (serializar y deserializar un objeto JAVA a JSON)
	public Producto() {
		
	}//Constructor vacío
	
	//Constructor con todos los campos
	public Producto(Long id, String nombre, String descripcion, String URL_Imagen, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.URL_Imagen = URL_Imagen;
		this.precio = precio;
	}//Constructor con todos los campos
	
	
	
	//Getters & Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getURL_Imagen() {
		return URL_Imagen;
	}

	public void setURL_Imagen(String URL_Imagen) {
		URL_Imagen = URL_Imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//toString(sobreescritura de metodos)
		@Override
		public String toString() {
			return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", uRL_Imagen="
					+ URL_Imagen + ", precio=" + precio + "]";
		}//toString
	
}//Clase Producto
