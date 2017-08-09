package lab8.handlers;

import lab8.SpaceInvaders;
import lab8.gameobjects.Alien;
import lab8.gameobjects.LaserBlast;
import engine.Entity;
import engine.Game;
import engine.collision.CollisionListener;

public class AlienLaserBlastsCollisionHandler implements CollisionListener {

	private Game _g;
	private SpaceInvaders _s;

	public AlienLaserBlastsCollisionHandler(Game g) {

		_g = g;
	}

	@Override
	public void collisionOccurred(Entity e) {

		if (e.getClass().equals(LaserBlast.class)) {

			_g.removeEntity(e);

		}

		else if (e.getClass().equals(Alien.class)) {

			_g.removeEntity(e);

		}

		// TODO Auto-generated method stub

	}

}
