package lab8.handlers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import lab8.gameobjects.LaserCannon;

public class LaserCannonKeyHandler implements KeyListener {

	private LaserCannon _p;
	private char _c;
	private int _v;

	public LaserCannonKeyHandler(LaserCannon p) {

		_p = p;

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

		char a = e.getKeyChar();
		char s = e.getKeyChar();
		if (a == 'a') {
			_p.setXVelocity(0);

		}

		else if (s == 's') {

			_p.setXVelocity(0);

		}
	}

	@Override
	public void keyPressed(KeyEvent e) {

		char a = e.getKeyChar();
		char s = e.getKeyChar();
		if (a == 'a') {
			_p.setXVelocity(-5);

		}

		else if (s == 's') {

			_p.setXVelocity(5);

		}
	}

}