package juego;

import java.util.Arrays;

public class Jugada {

	public static boolean esGanadora(Tablero tablero, Jugador jugador) {
		if(esGanadoraHorizontal(tablero, jugador) ||
				esGanadoraVertical(tablero, jugador) ||
				esGanadoraDiagonal(tablero, jugador))
			return true;
		return false;
	}
	
	private static boolean esGanadoraHorizontal(Tablero tablero, Jugador jugador) {
		for(int i=0; i<tablero.tamanio(); i++) {
			int[] fila=new int[3];
			
			for(int j=0; j<tablero.tamanio(); j++) {
				fila[i]=tablero.getTablero()[i][j];	
			}
			
			if(Arrays.equals(fila, jugadasGanadoras(tablero, jugador))) return true;
		}
		return false;
	}
	
	private static boolean esGanadoraVertical(Tablero tablero, Jugador jugador) {
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
	private static boolean esGanadoraDiagonal(Tablero tablero, Jugador jugador) {
		int[] diagonal=new int[3];
		
		for(int i=0; i<tablero.tamanio(); i++) {
			diagonal[i]=tablero.getTablero()[i][i];	
		}
		
		if(diagonal.equals(jugadasGanadoras(tablero, jugador)) && esGanadoraDiagonal2(tablero, jugador)) return true;
		return false;
	}
	
	private static boolean esGanadoraDiagonal2(Tablero tablero, Jugador jugador) {
		int[] diagonal=new int[3];
		int j=tablero.tamanio();
		
		for(int i=0; i<tablero.tamanio(); i++) {
			diagonal[i]=tablero.getTablero()[i][j];
			j--;
		}
		
		if(diagonal.equals(jugadasGanadoras(tablero, jugador))) return true;
		return false;
	}
	
	private static int[] jugadasGanadoras(Tablero tablero, Jugador jugador) {
		int[] jugadas=new int[3];
		for(int i=0; i<tablero.getTablero().length; i++) jugadas[i]=jugador.getNumero();
		return jugadas;
	}

}
