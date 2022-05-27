package nttdata.javat1.game;

import java.util.Arrays;
import java.util.Random;

import com.nttdata.nttdata.javat1.T1Mainjco;

/**
 * Esta clase contiene la base del juego
 * @author jcoro
 *
 */
public class Game {
	Random random = new Random();
	
	/**
	 * Inicia la partida
	 * @param numberOfBalls numero de bolas que se van a lanzar
	 */
	public void launchAndStart(int numberOfBalls){
		
		RelevantPoint[][] board = makeBoard();
		
		
		
		
		for (int i = 0; i < numberOfBalls; i++) {
			Ball a = new Ball();
			while(a.moveBall()) {
				board[a.getHeight() - 1][ random.nextInt( board[ a.getHeight() - 1].length ) ].accion(a);
				
			}
		}
		System.out.println(Ball.getScore());
		if(T1Mainjco.getLogger().isDebugEnabled())T1Mainjco.getLogger().debug("Score is: {}", Ball.getScore());
		Ball.resetScore();
	}
	
	/**
	 * Genera un array bidimensional que se considera el tablero del juego
	 * @return el array bidimensional
	 */
	private RelevantPoint[][] makeBoard() {
		
		RelevantPoint [][] board = new RelevantPoint[10][];
		
		for (int i = 0; i < board.length; i++) {
			board[i] = new RelevantPoint[random.nextInt(9) + 2];
			board[i][0] = new ScoreAdder();
			
			
			for (int j = 1; j < board[i].length; j++) {
				
				int a = random.nextInt(100);
				if(a < 80)	board[i][j] = new ScoreAdder();
				else if (a < 95) board[i][j] = new GoUpHeight();
				else board[i][j] = new GoToStart();
				
			}
			if(T1Mainjco.getLogger().isDebugEnabled())T1Mainjco.getLogger().debug("Board: height {} of the board: {}.", i, Arrays.toString(board[i]));
		}
		
		return board;
	}
	
	
	
	
}
