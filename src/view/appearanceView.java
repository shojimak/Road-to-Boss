package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
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
//
	private JPanel panel;
	private JLabel titleLbl; //総資産
	private JLabel totalLbl; //
	private JLabel cacheLbl; //キャッシュフロー
	private JLabel cacheyenLbl; //
	private JLabel yearLbl; //年
	private JLabel monthLbl; //月
	private JButton upgradeBtn; //アップグレードしますか？ボタン
	private ImageIcon upgradeIcon; // アップグレードしますか？s画像
	private JButton prevBtn; //戻るボタン
	private ImageIcon prevIcon; // 戻るボタン画像
	private JLabel beforeLbl; //アップグレード前
	private ImageIcon beforeIcon; // アップグレード前画像
	private JLabel afterLbl; //アップグレード後
	private ImageIcon afterIcon; // アップグレード後画像
	private JLabel rightLbl; //右矢印
	private ImageIcon rightIcon; // 右矢印画像
	private JLabel conLbl; // 会社増築
	private JLabel costLbl; //コスト

	/**
	 * コンストラクタ
	 */
	public appearanceView(Controller ctrl) {

		/**
		 * 各部品のインスタンス生成
		 */
		panel = new JPanel();

		prevIcon = new ImageIcon(getClass().getResource("./backBtn.jpg"));
		upgradeBtn = new JButton(prevIcon);

		upgradeIcon = new ImageIcon(getClass().getResource("./backBtn.jpg"));
		prevBtn = new JButton(prevIcon);

		beforeIcon = new ImageIcon(getClass().getResource("./iseki.jpg"));
		beforeLbl = new JLabel(beforeIcon);

		afterIcon = new ImageIcon(getClass().getResource("./build.jpg"));
		afterLbl = new JLabel(afterIcon);

		rightIcon = new ImageIcon(getClass().getResource("./right.jpg"));
		rightLbl = new JLabel(rightIcon);

		costLbl = new JLabel("XX万");
		costLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		conLbl = new JLabel("会社増築");
		conLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

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

		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		panel.setBorder(border);
		// panelのサイズ指定
		panel.setPreferredSize(new Dimension(1500, 900));

		panel.setLayout(null);

		/**
		 * 各部品の設定
		 */
		costLbl.setBounds(730, 700, 100, 20);
		conLbl.setBounds(120, 100, 100, 20);
		titleLbl.setBounds(30, 10, 70, 20);
		totalLbl.setBounds(120, 10, 70, 20);
		cacheLbl.setBounds(240, 10, 300, 20);
		cacheyenLbl.setBounds(450, 10, 200, 20);
		yearLbl.setBounds(1200, 10, 100, 20);
		monthLbl.setBounds(1350, 10, 70, 20);
		upgradeBtn.setBounds(590, 750, 350, 70);
		prevBtn.setBounds(1100, 750, 200, 70);
		beforeLbl.setBounds(100, 150, 450, 450);
		afterLbl.setBounds(950, 150, 450, 450);
		rightLbl.setBounds(600, 250, 300, 300);

		/**
		 * 各部品をパネルに追加
		 */
		panel.add(costLbl);
		panel.add(conLbl);
		panel.add(titleLbl);
		panel.add(totalLbl);
		panel.add(cacheLbl);
		panel.add(cacheyenLbl);
		panel.add(yearLbl);
		panel.add(monthLbl);
		panel.add(upgradeBtn);
		panel.add(prevBtn);
		panel.add(beforeLbl);
		panel.add(afterLbl);
		panel.add(rightLbl);

		/**
		 * ボタンにアクションリスナーを追加
		 */
		upgradeBtn.addActionListener(ctrl);
		prevBtn.addActionListener(ctrl);

		/**
		 * ボタンにアクションコマンドを定義
		 */

		upgradeBtn.setActionCommand("APPEARANCE_UPGRADE");
		prevBtn.setActionCommand("APPEARANCE_PREV");

		/**
		 * 背景設定
		 */

	}

	public JPanel getPanel() {
		return panel;
	}

}
