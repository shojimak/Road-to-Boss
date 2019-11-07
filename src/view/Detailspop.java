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
 * 雇用選び画面
 */
public class Detailspop extends JFrame{

	private JPanel panel;
	private JPanel waku1;

	private JLabel up;

	private JButton YesBtn;
	private JButton NoBtn;



	/**
	 * コンストラクタ
	 */
	public Detailspop(Controller ctrl) {


		/**
		 * 各部品のインスタンス生成
		 */
		panel = new JPanel();
		waku1 = new JPanel();


		up = new JLabel("アップグレードしますか？");
		up.setFont(new Font("HGP行書体", Font.PLAIN, 20));
		YesBtn = new JButton("はい");
		YesBtn.setFont(new Font("HGP行書体", Font.PLAIN, 15));

		NoBtn = new JButton("いいえ");
		NoBtn.setFont(new Font("HGP行書体", Font.PLAIN, 15));


		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		panel.setBorder(border);
		waku1.setBorder(border);


		// panelのサイズ指定
		panel.setPreferredSize(new Dimension(1500, 900));

		panel.setLayout(null);
		waku1.setPreferredSize(new Dimension(300, 200));
		waku1.setLayout(null);





		/**
		 * 各部品の設定
		 */

		waku1.setBounds(600, 400, 300, 300);
		up.setBounds(620, 420, 200, 200);
		YesBtn.setBounds(620, 450, 50, 50);
		NoBtn.setBounds(660, 450, 50, 50);

		/**
		 * 各部品をパネルに追加
		 */



		panel.add(up);
		panel.add(YesBtn);
		panel.add(NoBtn);
		panel.add(waku1);
		/**
		 * ボタンにアクションリスナーを追加
		 */
		YesBtn.addActionListener(ctrl);
		NoBtn.addActionListener(ctrl);

		/**
		 * ボタンにアクションコマンドを定義
		 */
		YesBtn.setActionCommand("REQUESTLIST_BACK");
		NoBtn.setActionCommand("KAKUNIN_BACK");


		/**
		 * 背景設定
		 */



	}

	public JPanel getPanel() {
		return panel;
	}
}
