package fes.aragon.prueba;

import fes.aragon.saludos.Saludar;

public class Prueba {
	public static void main(String[] args) {
		Saludar.saludar("Juan");
		Saludar jon = new Saludar();
		jon.nombre = "Carlos";
		jon.setNum_anios(-8);
		jon.saludar(-5);
		jon.saludar(101);
		jon.saludar(23);
	}
}
