package nttdata.javat1.game;

/**
 * Clase bola, contiene la puntuacion de la partida y la altura de una bola
 * @author jcoro
 *
 */

public class Ball {
	private int height = 10;
	private static int score = 0;
	
	
	/**
	 * Mueve la bola hacia abajo 
	 * @return boolean comprueba si la bola puede seguir bajando o no
	 */
	public boolean moveBall(){
	
		this.height--;
		return height > 0;
	}
	
	/**
	 * Devuelve la puntuacion
	 * @return int puntuacion
	 */
	public static int getScore() {
		
		return score;
	}
	
	/**
	 * A&ntilde;ade puntuacion a la puntuacion actual.
	 * @param addedScore La puntuacion a añadir
	 */
	public static void addScore(int addedScore){
		
		score += addedScore;
	}
	
	/**
	 * Pone la puntuacion a cero.
	 */
	public static void resetScore() {
		
		score = 0;
	}
	
	/**
	 * Obtiene la altura de la pelota.
	 * @return int altura
	 */
	public int getHeight() {
		
		return this.height;
	}
	
	/**
	 * Pone una altura a la pelota.
	 * @param height altura
	 */
	public void setHeight(int height){
		
		this.height= height;
	}
	
	@Override
	public String toString() {
		StringBuilder toReturn = new StringBuilder("height: ");
		toReturn.append(getHeight());
		toReturn.append(", score: ");
		toReturn.append(getScore());
		return toReturn.toString();
	}
	
}
