package com.dager.telefono;

import com.dager.interfaces.IDevolucion;

public class Smartphone extends Telefono implements IDevolucion{
	
	private long sim;

	public Smartphone(int id, double precio, String marca, String modelo, long sim) {
		super(id, precio, marca, modelo);
		this.sim = sim;
	}

	public long getSim() {
		return sim;
	}

	public void setSim(long sim) {
		this.sim = sim;
	}

	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Sim: " + getSim());
	}

	@Override
	public void devolucion() {
		System.out.println("Telefono devuelto");
	}
}
