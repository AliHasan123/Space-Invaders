package lab8;

import java.awt.Color;

import javax.swing.Timer;

import lab8.gameobjects.Alien;
import lab8.gameobjects.LaserCannon;
import lab8.gameobjects.Wall;
import lab8.handlers.AlienEastWestCollisionHandler;
import lab8.handlers.AlienLaserBlastsCollisionHandler;
import lab8.handlers.AlienSouthCollisionHandler;
import lab8.handlers.LaserBlastsKeyHandler;
import lab8.handlers.LaserBlastsNorthCollisionHandler;
import lab8.handlers.LaserCannonKeyHandler;
import lab8.handlers.TimerHandler;
import engine.Game;

public class SpaceInvaders {
	private static final int WALL_LASERCANNON_WIDTH = 10;
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGHT = 400;
	private Alien _alien;

	public SpaceInvaders() {
		Game g = new Game(GAME_WIDTH, GAME_HEIGHT);
		g.setBackgroundColor(Color.BLACK);

		Wall north = new Wall(0, 0, GAME_WIDTH, WALL_LASERCANNON_WIDTH,
				Color.GRAY);
		Wall south = new Wall(0, GAME_HEIGHT - WALL_LASERCANNON_WIDTH,
				GAME_WIDTH, WALL_LASERCANNON_WIDTH, Color.GRAY);
		Wall west = new Wall(0, WALL_LASERCANNON_WIDTH, WALL_LASERCANNON_WIDTH,
				GAME_HEIGHT - 2 * WALL_LASERCANNON_WIDTH, Color.GRAY);
		Wall east = new Wall(GAME_WIDTH - WALL_LASERCANNON_WIDTH,
				WALL_LASERCANNON_WIDTH, WALL_LASERCANNON_WIDTH, GAME_HEIGHT - 2
						* WALL_LASERCANNON_WIDTH, Color.GRAY);
		LaserCannon lasercannon = new LaserCannon(38 * WALL_LASERCANNON_WIDTH,
				GAME_HEIGHT - 2 * WALL_LASERCANNON_WIDTH,
				5 * WALL_LASERCANNON_WIDTH, WALL_LASERCANNON_WIDTH, Color.BLUE);

		g.addKeyListener(new LaserCannonKeyHandler(lasercannon));
		g.addKeyListener(new LaserBlastsKeyHandler(lasercannon, g));
		east.addCollisionListener(new AlienEastWestCollisionHandler());
		west.addCollisionListener(new AlienEastWestCollisionHandler());
		south.addCollisionListener(new AlienSouthCollisionHandler());
		lasercannon.addCollisionListener(new AlienSouthCollisionHandler());
		north.addCollisionListener(new LaserBlastsNorthCollisionHandler(g));

		for (int y = 10; y < 680; y = y + 45) {

			_alien = new Alien(y, 10, 5, 0, 3 * WALL_LASERCANNON_WIDTH,
					3 * WALL_LASERCANNON_WIDTH, Color.WHITE);
			g.addEntity(_alien);
			_alien.addCollisionListener(new AlienLaserBlastsCollisionHandler(g));

		}

		g.addEntity(north);
		g.addEntity(west);
		g.addEntity(east);
		g.addEntity(south);
		g.addEntity(lasercannon);

		Timer t = new Timer(20, new TimerHandler(g));
		t.start();
	}

}
