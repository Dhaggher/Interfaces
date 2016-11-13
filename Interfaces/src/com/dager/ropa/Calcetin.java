package com.dager.ropa;

import com.dager.interfaces.IDevolucion;

public class Calcetin extends Ropa implements IDevolucion{

	public Calcetin(int id, double precio, String talla, String color) {
		super(id, precio, talla, color);
	}

	@Override
	public void devolucion() {
		System.out.println("Clacetines devueltos");
	}
	
}
