package com.dager.telefono;

public class Telefono {
	
	private int id;
	private double precio;
	private String marca;
	private String modelo;
	
	public Telefono(int id, double precio, String marca, String modelo) {
		this.id = id;
		this.precio = precio;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void mostrarDatos(){
		System.out.println("Id: " + getId());
		System.out.println("Precio: " + getPrecio());
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
	}
}
