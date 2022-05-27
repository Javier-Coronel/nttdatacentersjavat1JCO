package nttdata.javat1.game;

import java.util.Random;

/**
 * Punto con el que choca la bola
 * 
 */
public abstract class RelevantPoint {
	Random random = new Random();
	/**
	 * Hace una accion relaccionada con la bola.
	 * @param ball la pelota a alterar
	 */
	public abstract void accion(Ball ball);
}
