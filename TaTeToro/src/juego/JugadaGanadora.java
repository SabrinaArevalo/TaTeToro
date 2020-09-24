package juego;

import java.util.HashSet;
import java.util.Set;

public class JugadaGanadora {
	@SuppressWarnings("unchecked")
	Set<Integer>[] jugadasGanadoras=(Set<Integer>[]) new Set[8];
	
	//Jugadas ganadoras horizontales
	Set<Integer> horizontal1= new HashSet<Integer>();
	Set<Integer> horizontal2= new HashSet<Integer>();
	Set<Integer> horizontal3= new HashSet<Integer>();

	//Jugadas ganadoras verticales
	Set<Integer> vertical1= new HashSet<Integer>();
	Set<Integer> vertical2= new HashSet<Integer>();
	Set<Integer> vertical3= new HashSet<Integer>();
	
	//Jugadas ganadoras diagonales
	Set<Integer> diagonal1= new HashSet<Integer>();
	Set<Integer> diagonal2= new HashSet<Integer>();
	
	public JugadaGanadora() {
		horizontal1.add(9);
		horizontal1.add(7);
		horizontal1.add(8);
		horizontal2.add(3);
		horizontal2.add(1);
		horizontal2.add(2);
		horizontal3.add(6);
		horizontal3.add(4);
		horizontal3.add(5);
		
		vertical1.add(3);
		vertical1.add(6);
		vertical1.add(9);
		vertical2.add(2);
		vertical2.add(5);
		vertical2.add(8);
		
		diagonal1.add(1);
		diagonal1.add(5);
		diagonal1.add(9);
		diagonal2.add(3);
		diagonal1.add(5);
		diagonal1.add(7);
		
	}
	
	public boolean esJugadaGanadora(Tablero tablero) {
		if(esJugadaGanadoraHorizontal(tablero) ||
				esJugadaGanadoraVertical(tablero) ||
				esJugadaGanadoraDiagonal1(tablero) ||
				esJugadaGanadoraDiagonal2(tablero))
			return true;
		return false;
	}
	
	private boolean esJugadaGanadoraHorizontal(Tablero tablero) {
		for(int i=0; i<tablero.tamanio(); i++) {
			Set<Integer> fila=new HashSet<Integer>();
			
			for(int j=0; j<tablero.tamanio(); j++) {
				fila.add(tablero.getTablero()[i][j]);	
			}
			
			if(fila.equals(horizontal1) || fila.equals(horizontal2) || fila.equals(horizontal3)) return true;
		}
		return false;
	}
	
	private boolean esJugadaGanadoraVertical(Tablero tablero) {
		for(int i=0; i<tablero.tamanio(); i++) {
			Set<Integer> fila=new HashSet<Integer>();
			
			for(int j=0; j<tablero.tamanio(); j++) {
				fila.add(tablero.getTablero()[j][i]);	
			}
			
			if(fila.equals(vertical1) || fila.equals(vertical2) || fila.equals(vertical3)) return true;
		}
		return false;
	}
	
	//Las jugadas ganadoras diagonales fueron divididas en dos funciones
	private boolean esJugadaGanadoraDiagonal1(Tablero tablero) {
		Set<Integer> fila=new HashSet<Integer>();
		
		for(int i=0; i<tablero.tamanio(); i++) {
			fila.add(tablero.getTablero()[i][i]);	
		}
		
		if(fila.equals(diagonal1) || fila.equals(diagonal2)) return true;
		return false;
	}
	
	private boolean esJugadaGanadoraDiagonal2(Tablero tablero) {
		Set<Integer> fila=new HashSet<Integer>();
		int j=tablero.tamanio();
		for(int i=0; i<tablero.tamanio(); i++) {
			fila.add(tablero.getTablero()[i][j]);
			j--;
		}
		
		if(fila.equals(diagonal1) || fila.equals(diagonal2)) return true;
		return false;
	}

}
