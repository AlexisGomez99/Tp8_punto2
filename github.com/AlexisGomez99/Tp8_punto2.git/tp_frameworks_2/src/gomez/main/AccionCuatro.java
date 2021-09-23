package gomez.main;

import gomez.utilizacion.Accion;

public class AccionCuatro implements Accion{

	@Override
	public void ejecutar() {
		System.out.println("Ejecutando AccionCuatro...");
	}

	@Override
	public String nombreItemMenu() {
		// TODO Auto-generated method stub
		return "Accion 4";
	}

	@Override
	public String descripcionItemMenu() {
		// TODO Auto-generated method stub
		return "Habilita las todas las alarmas...";
	}

}
