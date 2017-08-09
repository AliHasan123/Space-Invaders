package lab8.handlers;

import engine.Entity;
import engine.collision.CollisionListener;

public class AlienSouthCollisionHandler implements CollisionListener {

	@Override
	public void collisionOccurred(Entity e) {

		System.out.println("Aliens WIN!");
		System.exit(0);
		// TODO Auto-generated method stub

	}

}
