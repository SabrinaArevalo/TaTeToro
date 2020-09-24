package juego;

public class Tablero {
	private int[][] tablero;
	
	//La idea es tener una matriz de 3x3, y en cada turno poner 1 o 2 según dónde juegue el jugador
	//Y verificar si ganó a partir de este tablero
	public Tablero() {
		tablero=new int[3][3];
		
		for(int i=0; i<3; i++) 
			
			for(int j=0; i<3; i++) tablero[i][j]=0;		
	}

	public int[][] getTablero() {
		return tablero;
	}
	
	public void setJugada(Jugador jugador, int posicionFila, int posicionColumna) {
		this.tablero[posicionFila][posicionColumna]=jugador.getNumero();
	}

	public int tamanio() {
		return this.tablero.length;
	}
	
}
