package lab8.gameobjects;

import java.awt.Color;

import lab8.SpaceInvaders;
import engine.drawing.ICanvas;

public class LaserCannon extends StandardEntity {

	int _xVelocity;

	public LaserCannon(int x, int y, int w, int h, Color c) {

		super(x, y, w, h, 0, 0, c);

	}

	@Override
	public void draw(ICanvas dc) {

		dc.drawFilledRectangle(_x, _y, _width, _height, _color);

	}

	@Override
	public void setXVelocity(int xVelocity) {

		_vx = xVelocity;
	}

	@Override
	public void update() {

		super.update();

		if (_x < 10) {

			_x = 10;

		} // '1' is for wall thickness

		if ((_x + _width) > (SpaceInvaders.GAME_WIDTH - 10)) {

			_x = (SpaceInvaders.GAME_WIDTH - 10 - _width);

		}
	}
}
