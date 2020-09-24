package juego;

import java.util.HashSet;
import java.util.Set;

public class JugadaGanadora {

	public boolean esJugadaGanadora(Tablero tablero, Jugador jugador) {
		if(esJugadaGanadoraHorizontal(tablero, jugador) ||
				esJugadaGanadoraVertical(tablero, jugador) ||
				esJugadaGanadoraDiagonal1(tablero, jugador) ||
				esJugadaGanadoraDiagonal2(tablero, jugador))
			return true;
		return false;
	}
	
	private boolean esJugadaGanadoraHorizontal(Tablero tablero, Jugador jugador) {
		for(int i=0; i<tablero.tamanio(); i++) {
			int[] fila=new int[3];
			
			for(int j=0; j<tablero.tamanio(); j++) {
				fila[i]=tablero.getTablero()[i][j];	
			}
			
			if(fila.equals(jugadasGanadoras(tablero, jugador))) return true;
		}
		return false;
	}
	
	private boolean esJugadaGanadoraVertical(Tablero tablero, Jugador jugador) {
		for(int i=0; i<tablero.tamanio(); i++) {
			int[] columna=new int[3];
			
			for(int j=0; j<tablero.tamanio(); j++) {
				columna[i]=tablero.getTablero()[j][i];	
			}
			
			if(columna.equals(jugadasGanadoras(tablero, jugador))) return true;
		}
		return false;
	}
	
	//Las jugadas ganadoras diagonales fueron divididas en dos funciones
	private boolean esJugadaGanadoraDiagonal1(Tablero tablero, Jugador jugador) {
		int[] diagonal=new int[3];
		
		for(int i=0; i<tablero.tamanio(); i++) {
			diagonal[i]=tablero.getTablero()[i][i];	
		}
		
		if(diagonal.equals(jugadasGanadoras(tablero, jugador))) return true;
		return false;
	}
	
	private boolean esJugadaGanadoraDiagonal2(Tablero tablero, Jugador jugador) {
		int[] diagonal=new int[3];
		int j=tablero.tamanio();
		
		for(int i=0; i<tablero.tamanio(); i++) {
			diagonal[i]=tablero.getTablero()[i][j];
			j--;
		}
		
		if(diagonal.equals(jugadasGanadoras(tablero, jugador))) return true;
		return false;
	}
	
	private int[] jugadasGanadoras(Tablero tablero, Jugador jugador) {
		int[] jugadas=new int[3];
		for(int i=0; i<tablero.getTablero().length; i++) jugadas[i]=jugador.getNumero();
		return jugadas;
	}

}
