package lab8.handlers;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import lab8.gameobjects.LaserBlast;
import lab8.gameobjects.LaserCannon;
import engine.Game;

public class LaserBlastsKeyHandler implements KeyListener {

	private LaserCannon _p;
	private Game _g;

	public LaserBlastsKeyHandler(LaserCannon p, Game g) {

		_p = p;
		_g = g;
	}

	@Override
	public void keyTyped(KeyEvent e) {

		char k = e.getKeyChar();

		if (k == 'k') {

			LaserBlast laserblast = new LaserBlast(_p.getXCoordinate() + 25,
					370, 2, 8, 0, -4, Color.RED);
			_g.addEntity(laserblast);
			laserblast
					.addCollisionListener(new AlienLaserBlastsCollisionHandler(
							_g));

		}

		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {

		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	// TODO Auto-generated method stub

}