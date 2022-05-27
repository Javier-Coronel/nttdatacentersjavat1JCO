package nttdata.javat1.game;

import com.nttdata.nttdata.javat1.T1Mainjco;

/**
 * Esta clase aumentara la puntuacion del juego
 * @author jcoro
 *
 */
public class ScoreAdder extends RelevantPoint{
	private int addedScore = 500;
	private int bonus;
	ScoreAdder(){
		int aux = random.nextInt(100);
		if(aux <= 5)bonus = 3;
		else if(aux <= 15)bonus = 2;
		else bonus = 1;
	}
	
	
	
	@Override
	public void accion(Ball ball) {
		Ball.addScore(addedScore * bonus);
		if(T1Mainjco.getLogger().isDebugEnabled())T1Mainjco.getLogger().debug("Ball touch a ScoreAdder point and got {} points", addedScore * bonus);
	}
	
	@Override
	public String toString() {
		StringBuilder toReturn = new StringBuilder("ScoreAdder that gives: ");
		toReturn.append(addedScore * bonus);
		return toReturn.toString();
	}

}
