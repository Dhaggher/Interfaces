package com.dager.ropa;

import com.dager.interfaces.IDevolucion;

public class Playera extends Ropa implements IDevolucion{
	
	private String corte;
	
	public Playera(int id, double precio, String talla, String color, String corte) {
		super(id, precio, talla, color);
		this.corte = corte;
	}
	
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}

	@Override
	public void mostrarDatos(String nombreClase) {
		// TODO Auto-generated method stub
		super.mostrarDatos(nombreClase);
		System.out.println("Corte: " + getCorte());
	}

	@Override
	public void devolucion() {
		System.out.println("Playera devuelta");
	}
}
