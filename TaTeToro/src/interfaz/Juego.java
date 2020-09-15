package interfaz;

import juego.Jugador;
import juego.Tablero;
import juego.Turno;

public class Juego {
	Tablero tablero=new Tablero();
	Jugador jugador1=new Jugador(1);
	Jugador jugador2=new Jugador(2);
	
	//Para hacer.
	private boolean gano() {
		int cont=0;
		//Tiene que verificar si hay tres botones en horizontal, vertical y diagonal
		//Para cada jugador
			for(int i=0; i<tablero.getTablero().length; i++) {
				for(int j=0; j<tablero.getTablero()[i].length; j++) {
					if(tablero.getTablero()[i][j]==1) cont++;
					if(cont>=3) return true;
				}
			}
		return false;
	}
}
