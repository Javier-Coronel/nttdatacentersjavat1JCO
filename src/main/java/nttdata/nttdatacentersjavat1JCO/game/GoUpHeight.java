package nttdata.nttdatacentersjavat1JCO.game;

import com.nttdata.nttdatacentersjavat1JCO.T1Mainjco;

/**
 * Esta clase hara que la bola suba de altura
 * @author jcoro
 *
 */
public class GoUpHeight extends RelevantPoint{

	@Override
	public void accion(Ball ball) {
		ball.setHeight(ball.getHeight() + 1);
		Ball.addScore(50);
		if(T1Mainjco.getLogger().isDebugEnabled())T1Mainjco.getLogger().debug("Ball touch a GoUpHeight point.");
	}
	
	@Override
	public String toString() {
		StringBuilder toReturn = new StringBuilder("GoUpHeight");
		return toReturn.toString();
	}
}
