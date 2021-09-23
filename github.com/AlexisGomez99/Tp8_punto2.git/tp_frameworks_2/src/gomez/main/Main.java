package gomez.main;

import gomez.framework.Start;

public class Main {

	public static void main(String[] args) {
		//"/gomez/utilizacion/config.properties" path correcto
		Start s= new Start("/gomez/utilizacion/config.properties");
		s.desplegarMenu();
	}
	

}
