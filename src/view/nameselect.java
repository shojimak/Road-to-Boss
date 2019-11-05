package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import controller.Controller;
/**
 * モード選択画面クラス
 */
public class nameselect extends JFrame{

	private JPanel panel;
	private JLabel titleLbl;
	private JLabel kimeruLbl;
	private JButton backBtn;		//戻るボタン
	private JButton ketteiBtn;      //決定ボタン
	private JTextField nametext;

	/**
	 * コンストラクタ
	 */
	public nameselect(Controller ctrl) {


		/**
		 * 各部品のインスタンス生成
		 */
		panel = new JPanel();

		titleLbl = new JLabel("Road to Boss");
		titleLbl.setFont(new Font("Algerian", Font.BOLD, 150));

		kimeruLbl = new JLabel("社名を決めてください");
		kimeruLbl.setFont(new Font("HGP行書体", Font.PLAIN, 50));

		ketteiBtn = new JButton("決定");
		ketteiBtn.setFont(new Font("HGP行書体", Font.PLAIN, 40));

		backBtn = new JButton("戻る");
		backBtn.setFont(new Font("HGP行書体", Font.PLAIN, 40));

		nametext = new JTextField("");

		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		panel.setBorder(border);
		// panelのサイズ指定
		panel.setPreferredSize(new Dimension(1000, 600));

		panel.setLayout(null);

		/**
		 * 各部品の設定
		 */
		titleLbl.setBounds(200, 50, 1400, 250);
		kimeruLbl.setBounds(560,300,500,150);
		ketteiBtn.setBounds(650, 500, 200, 70);
		backBtn.setBounds(650, 590, 200, 70);
		nametext.setBounds(560,350,300,55);

		/**
		 * 各部品をパネルに追加
		 */
		panel.add(titleLbl);
		panel.add(kimeruLbl);
		panel.add(ketteiBtn);
		panel.add(backBtn);
		panel.add(nametext);


		/**
		 * ボタンにアクションリスナーを追加
		 */

		ketteiBtn.addActionListener(ctrl);
		backBtn.addActionListener(ctrl);

		/**
		 * ボタンにアクションコマンドを定義
		 */

		ketteiBtn.setActionCommand("MAINVIEW");
		backBtn.setActionCommand("NAMESELECT_BACK");


		/**
		 * 背景設定
		 */



	}

	public JPanel getPanel() {
		return panel;
	}

}