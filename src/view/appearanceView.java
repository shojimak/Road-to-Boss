package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controller.Controller;

/**
 * モード選択画面クラス
 */
public class appearanceView extends JFrame {

	private JPanel panel;
	private JLabel titleLbl; //総資産
	private JLabel totalLbl; //
	private JLabel cacheLbl; //キャッシュフロー
	private JLabel cacheyenLbl; //
	private JLabel yearLbl; //年
	private JLabel monthLbl; //月
	private JButton resourcesBtn; //人材雇用ボタン
	private JButton trainingBtn; //育成ボタン
	private JButton requestBtn; //開発依頼ボタン
	private JButton extensionBtn; //増築ボタン

	/**
	 * コンストラクタ
	 */
	public appearanceView(Controller ctrl) {

		/**
		 * 各部品のインスタンス生成
		 */
		panel = new JPanel();

		titleLbl = new JLabel("総資産");
		titleLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		totalLbl = new JLabel("100万");
		totalLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		cacheLbl = new JLabel("キャッシュフロー");
		cacheLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		cacheyenLbl = new JLabel("100万");
		cacheyenLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		yearLbl = new JLabel("1998年");
		yearLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		monthLbl = new JLabel("12月");
		monthLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		resourcesBtn = new JButton("人材雇用");
		resourcesBtn.setFont(new Font("HGP行書体", Font.PLAIN, 30));

		trainingBtn = new JButton("育成");
		trainingBtn.setFont(new Font("HGP行書体", Font.PLAIN, 30));
		trainingBtn.setHorizontalTextPosition(JButton.CENTER);
		trainingBtn.setBorder(BorderFactory.createEmptyBorder());
		trainingBtn.setContentAreaFilled(false);
		requestBtn = new JButton("開発依頼");
		requestBtn.setFont(new Font("HGP行書体", Font.PLAIN, 30));
		requestBtn.setHorizontalTextPosition(JButton.CENTER);
		requestBtn.setBorder(BorderFactory.createEmptyBorder());
		requestBtn.setContentAreaFilled(false);
		extensionBtn = new JButton("増築");
		extensionBtn.setFont(new Font("HGP行書体", Font.PLAIN, 30));
		extensionBtn.setHorizontalTextPosition(JButton.CENTER);
		extensionBtn.setBorder(BorderFactory.createEmptyBorder());
		extensionBtn.setContentAreaFilled(false);

		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		panel.setBorder(border);
		// panelのサイズ指定
		panel.setPreferredSize(new Dimension(1000, 600));

		panel.setLayout(null);

		/**
		 * 各部品の設定
		 */
		titleLbl.setBounds(20, 10, 70, 20);
		totalLbl.setBounds(100, 10, 70, 20);
		cacheLbl.setBounds(190, 10, 180, 20);
		cacheyenLbl.setBounds(380, 10, 200, 20);
		yearLbl.setBounds(810, 10, 100, 20);
		monthLbl.setBounds(900, 10, 70, 20);
		resourcesBtn.setBounds(380, 200, 200, 70);
		trainingBtn.setBounds(380, 290, 200, 70);
		requestBtn.setBounds(380, 380, 200, 70);

		/**
		 * 各部品をパネルに追加
		 */
		panel.add(titleLbl);
		panel.add(totalLbl);
		panel.add(cacheLbl);
		panel.add(cacheyenLbl);
		panel.add(yearLbl);
		panel.add(monthLbl);
		panel.add(resourcesBtn);
		panel.add(trainingBtn);
		panel.add(requestBtn);

		/**
		 * ボタンにアクションリスナーを追加
		 */
		resourcesBtn.addActionListener(ctrl);
		trainingBtn.addActionListener(ctrl);
		requestBtn.addActionListener(ctrl);

		/**
		 * ボタンにアクションコマンドを定義
		 */

		/**
		 * resourcesBtn.setActionCommand("MODESELECT_RANDOM");
		trainingBtn.setActionCommand("MODESELECT_LOCAL");
		requestBtn.setActionCommand("MODESELECT_FREE");
		 */

		/**
		 * 背景設定
		 */

	}

	public JPanel getPanel() {
		return panel;
	}

}
