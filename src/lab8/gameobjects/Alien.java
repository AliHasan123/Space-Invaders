package lab8.gameobjects;

import java.awt.Color;

import engine.drawing.ICanvas;

public class Alien extends StandardEntity {

	public Alien(int x, int y, int vx, int vy, int w, int h, Color c) {

		super(x, y, w, h, vx, vy, c);

	}

	@Override
	public void draw(ICanvas dc) {

		dc.drawFilledRectangle(_x, _y, _width, _height, _color);

	}

}