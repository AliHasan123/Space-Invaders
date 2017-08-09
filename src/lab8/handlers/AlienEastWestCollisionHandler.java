package lab8.handlers;

import engine.Entity;
import engine.collision.CollisionListener;

public class AlienEastWestCollisionHandler implements CollisionListener {

	@Override
	public void collisionOccurred(Entity e) {

		e.setXVelocity(-1 * e.getXVelocity());
		e.setYCoordinate(e.getYCoordinate() + 36);
		// TODO Auto-generated method stub

	}

}
