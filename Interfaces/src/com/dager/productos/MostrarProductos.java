package com.dager.productos;

import com.dager.ropa.Calcetin;
import com.dager.ropa.Jeans;
import com.dager.ropa.Playera;
import com.dager.ropa.PlayeraPersonalizada;
import com.dager.telefono.Smartphone;

public class MostrarProductos {

	public static void main(String[] args) {
		
		// Creamos objetos de los productos Ropa
		Playera playera = new Playera(1, 379.5, "Mediana", "gris", "polo");
		PlayeraPersonalizada playeraPersonalizada = new PlayeraPersonalizada(2, 450, "S", "vino", "@dhaggehr");
		Jeans jeans = new Jeans(3, 799.90, "34", "azul", "recto", 'H');
		Calcetin tines = new Calcetin(4, 30, "Chica", "gris;");
		
		// Creamos objetos tipo Telefono
		Smartphone miTelefono = new Smartphone(1, 3450.99, "Motorola", "Moto G 3G", 789654900);
		
		// Mostramos datos de los productos
		playera.mostrarDatos("Playera hombre");
		playeraPersonalizada.mostrarDatos("Playera twitter");
		jeans.mostrarDatos("Jeans hombre");
		tines.mostrarDatos("Tines");
		
		// Implementamos metodos para la devolución
		playera.devolucion();
		jeans.devolucion();
		miTelefono.devolucion();
	}

}
