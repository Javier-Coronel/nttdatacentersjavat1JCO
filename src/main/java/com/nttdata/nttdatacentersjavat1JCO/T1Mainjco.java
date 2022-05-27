package com.nttdata.nttdatacentersjavat1JCO;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nttdata.nttdatacentersjavat1JCO.game.*;

/**
 * El juego consiste en indicar un numero de bolas para que se genere un tablero en el cual se obtendra una puntuacion.
 * @author jcoro
 *
 */
public class T1Mainjco 
{
	private static final Logger LOG = LoggerFactory.getLogger(T1Mainjco.class);
	
	/**
	 * Metodo principal.
	 * @param args args
	 */
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        Integer numberOfBalls = 0;
        do {
        
        	try {
        		System.out.println("Escriba el numero de bolas que quiere jugar.");
        		numberOfBalls = scanner.nextInt();
        	}catch(InputMismatchException e) {
        		scanner.next();
        		if(LOG.isWarnEnabled())LOG.warn("El input debe ser un numero entero.");
        		System.out.println("Por favor ponga un numero.");
        	}
        
        }while((numberOfBalls) <= 0);
        if(LOG.isDebugEnabled())LOG.debug("Number of balls {}.", numberOfBalls);
        game.launchAndStart(numberOfBalls);
        scanner.close();
    }
    /**
     * Devuelve el LOGGER.
     * @return Logger
     */
    public static Logger getLogger() {
    	return LOG;
    }
}
