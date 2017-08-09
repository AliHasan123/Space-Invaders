package lab8.gameobjects;

import java.awt.Color;

import engine.drawing.ICanvas;

public class LaserBlast extends StandardEntity {

	public LaserBlast(int x, int y, int w, int h, int vx, int vy, Color c) {

		super(x, y, w, h, vx, vy, c);

		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(ICanvas dc) {

		dc.drawFilledRectangle(_x, _y, _width, _height, _color);

		// TODO Auto-generated method stub

	}

}
