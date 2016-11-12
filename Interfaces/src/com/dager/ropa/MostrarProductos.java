package com.dager.ropa;

public class MostrarProductos {

	public static void main(String[] args) {
		Playera playera = new Playera(1, 379.5, "Mediana", "gris", "polo");
		Jeans jeans = new Jeans(2, 799.90, "34", "azul", "recto", 'H');
		Calcetin tines = new Calcetin(3, 30, "Chica", "gris;");
		
		playera.mostrarDatos("Playera hombre");
		jeans.mostrarDatos("Jeans hombre");
		tines.mostrarDatos("Tines");
	}

}
