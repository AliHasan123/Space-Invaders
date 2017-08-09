package lab8.gameobjects;

import java.awt.Color;

import engine.drawing.ICanvas;

public class Wall extends StandardEntity {

	public Wall(int x, int y, int w, int h, Color c) {

		super(x, y, w, h, 0, 0, c);

	}

	@Override
	public void draw(ICanvas dc) {

		dc.drawFilledRectangle(_x, _y, _width, _height, _color);

	}

	@Override
	public void update() {

	}

}
