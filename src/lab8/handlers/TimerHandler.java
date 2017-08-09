package lab8.handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import engine.Game;

public class TimerHandler implements ActionListener {

	private Game _g;

	public TimerHandler(Game g) {
		_g = g;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ORDER IS IMPORTANT
		_g.updateEntities();
		_g.checkCollision();
		_g.draw();
	}

}
