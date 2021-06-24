package gomez.main;

import gomez.utilizacion.Accion;

public class AccionTres implements Accion{

	@Override
	public void ejecutar() {
		System.out.println("Ejecutando AccionTres...");
	}

	@Override
	public String nombreItemMenu() {
		return "Accion 3";
	}

	@Override
	public String descripcionItemMenu() {
		// TODO Auto-generated method stub
		return "Esto envia un saludo a un contacto al azar...";
	}

}
