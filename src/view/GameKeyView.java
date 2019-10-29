package view;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * ゲーム基幹クラス
 */
public class GameKeyView extends JFrame {

	Container cntnr;

	public GameKeyView(String title) {

		super(title);

		setLocation(200, 100);

		setSize(1000, 1000);

		cntnr = getContentPane();
		cntnr.setLayout(null);

	}

	public void setPanel(JPanel panel) {

		panel.setBounds(0, 0, 1000, 600);

		cntnr.add(panel);

		cntnr.repaint();

	}

	public void deletePanel() {

		cntnr.removeAll();

	}

}
