package lab8.handlers;

import lab8.gameobjects.LaserBlast;
import engine.Entity;
import engine.Game;
import engine.collision.CollisionListener;

public class LaserBlastsNorthCollisionHandler implements CollisionListener {

	Game _g;
	LaserBlast _lb;

	public LaserBlastsNorthCollisionHandler(Game g) {

		_g = g;

	}

	@Override
	public void collisionOccurred(Entity e) {

		_g.removeEntity(e);
		// TODO Auto-generated method stub

	}

}
