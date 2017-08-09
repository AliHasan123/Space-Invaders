package lab8.handlers;

import engine.Entity;
import engine.collision.CollisionListener;

public class AnnounceWinnerHandler implements CollisionListener {

	private int _winner;

	public AnnounceWinnerHandler(int w) {
		_winner = w;
	}

	@Override
	public void collisionOccurred(Entity e) {
		System.out.println("Player #" + _winner + " wins!");
		System.exit(0);
	}

}
