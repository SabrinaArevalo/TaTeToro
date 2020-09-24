package juego;

import java.util.HashSet;
import java.util.Set;

public class JugadaGanadora {
	@SuppressWarnings("unchecked")
	Set<Integer>[] jugadasGanadoras=(Set<Integer>[]) new Set[8];
	
	//Horizontales
	Set<Integer> horizontal1= new HashSet<Integer>();
	Set<Integer> horizontal2= new HashSet<Integer>();
	Set<Integer> horizontal3= new HashSet<Integer>();
	Set<Integer> vertical1= new HashSet<Integer>();
	Set<Integer> vertical2= new HashSet<Integer>();
	Set<Integer> vertical3= new HashSet<Integer>();
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
	
	public void jugadaGanadora(Set<Integer>jugada, Jugador jugador) {
		
	}
}
