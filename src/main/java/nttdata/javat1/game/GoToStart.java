package nttdata.javat1.game;

import com.nttdata.nttdata.javat1.T1Mainjco;

/**
 * Esta clase devolvera a la bola a su posicion inicial.
 * @author jcoro
 *
 */

public class GoToStart extends RelevantPoint {

	@Override
	public void accion(Ball ball) {
		ball.setHeight(10);
		Ball.addScore(500);
		if(T1Mainjco.getLogger().isDebugEnabled())T1Mainjco.getLogger().debug("Ball touch a GoToStart point");
	}
	
	
	@Override
	public String toString() {
		StringBuilder toReturn = new StringBuilder("GoToStart that gives");
		return toReturn.toString();
	}
}
