package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controller.Controller;
/**
 * モード選択画面クラス
 */
public class topView extends JFrame{

	private JPanel panel;
	private JLabel titleLbl;
	private JButton startBtn;
	private JButton settingBtn;

	/**
	 * コンストラクタ
	 */
	public topView(Controller ctrl) {


		/**
		 * 各部品のインスタンス生成
		 */
		panel = new JPanel();
		titleLbl = new JLabel("Road to Boss");
		titleLbl.setFont(new Font("HGP行書体", Font.BOLD, 100));
		startBtn = new JButton("スタート");
		startBtn.setFont(new Font("HGP行書体", Font.PLAIN, 30));
		settingBtn = new JButton("設定");
		settingBtn.setFont(new Font("HGP行書体", Font.PLAIN, 30));
		;

		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		panel.setBorder(border);
		// panelのサイズ指定
		panel.setPreferredSize(new Dimension(1000, 600));

		panel.setLayout(null);

		/**
		 * 各部品の設定
		 */
		titleLbl.setBounds(440, 200, 700, 200);
		startBtn.setBounds(650, 500, 200, 70);
		settingBtn.setBounds(650, 600, 200, 70);

		/**
		 * 各部品をパネルに追加
		 */
		panel.add(titleLbl);
		panel.add(startBtn);
		panel.add(settingBtn);

		/**
		 * ボタンにアクションリスナーを追加
		 */
		startBtn.addActionListener(ctrl);
		settingBtn.addActionListener(ctrl);

		/**
		 * ボタンにアクションコマンドを定義
		 */


		/**
		 * 背景設定
		 */




	}

	public JPanel getPanel() {
		return panel;
	}

}
