package com.dager.telefono;

public class TelefonoFijo extends Telefono {

	private boolean alambrico;
	
	public TelefonoFijo(int id, double precio, String marca, String modelo, boolean alambrico) {
		super(id, precio, marca, modelo);
		this.alambrico = alambrico;
	}

	public boolean isAlambrico() {
		return alambrico;
	}

	public void setAlambrico(boolean alambrico) {
		this.alambrico = alambrico;
	}

	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Alambrico: " + isAlambrico());
	}
	
}
