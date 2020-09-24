package juego;

import static org.junit.Assert.*;

import org.junit.Test;

public class juegoTest {

	@Test
	public void creacionTableroTest() {
		Tablero tablero=new Tablero();
		assertTrue(tablero.getTablero()[0][0]==0);
	}
	
	@Test
	public void ingresarJugadaTest() {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(1);
		Jugador jugador2=new Jugador(2);
		tablero.setJugada(jugador1, 0, 0);
		tablero.setJugada(jugador2, 0, 1);
		assertTrue(tablero.getTablero()[0][0]==1);
		assertTrue(tablero.getTablero()[0][1]==2);
	}
	
	@Test
	public void jugadaGanadoraHorizontalTest() {
		Tablero tablero=new Tablero();
		Jugador jugador1=new Jugador(1);
		tablero.setJugada(jugador1, 0, 0);
		tablero.setJugada(jugador1, 0, 1);
		tablero.setJugada(jugador1, 0, 2);
		assertTrue(Jugada.esGanadora(tablero, jugador1));
	}
	
	

}
