package juego;

public class Tablero {
	private int[][] tablero;
	
	//La idea es tener una matriz de 3x3, y en cada turno poner 1 o 2 según dónde juegue el jugador
	//Y verificar si ganó a partir de este tablero
	public Tablero() {
		tablero=new int[3][3];
	}

	public int[][] getTablero() {
		return tablero;
	}

	public void setTablero(int[][] tablero) {
		this.tablero = tablero;
	}
	
}
