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
public class mainView extends JFrame {

	private JPanel panel;
	private JLabel titleLbl; //総資産ラベル
	private JLabel addComLbl; //会社増築ラベル
	private JLabel totalLbl; //総資産
	private JLabel costLbl; //費用
	private JLabel cacheLbl; //キャッシュフロー
	private JLabel cacheyenLbl; //
	private JLabel yearLbl; //年
	private JLabel monthLbl; //月
	private JButton upgradeBtn; //アップグレードボタン
	private JButton prevBtn; //戻るボタン

	/**
	 * コンストラクタ
	 */
	public mainView(Controller ctrl) {

		/**
		 * 各部品のインスタンス生成
		 */
		panel = new JPanel();

		ImageIcon icon1 = new ImageIcon("C:\\Usr\\pleiades\\eclipse\\images\\backBtn.jpg");
		
		JButton prev1Btn = new JButton(icon1);

		titleLbl = new JLabel("総資産");
		titleLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		addComLbl = new JLabel("会社増築");
		addComLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		totalLbl = new JLabel("100万");
		totalLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		cacheLbl = new JLabel("キャッシュフロー");
		cacheLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		cacheyenLbl = new JLabel("100万");
		cacheyenLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		costLbl = new JLabel("XX万");
		costLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		yearLbl = new JLabel("1998年");
		yearLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		monthLbl = new JLabel("12月");
		monthLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		upgradeBtn = new JButton("アップグレードしますか？");
		upgradeBtn.setFont(new Font("HGP行書体", Font.PLAIN, 30));

		prevBtn = new JButton("戻る");
		prevBtn.setFont(new Font("HGP行書体", Font.PLAIN, 30));
		/*prevBtn.setHorizontalTextPosition(JButton.CENTER);
		prevBtn.setBorder(BorderFactory.createEmptyBorder());
		prevBtn.setContentAreaFilled(false);
		*/

		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		panel.setBorder(border);
		// panelのサイズ指定
		panel.setPreferredSize(new Dimension(1000, 600));

		panel.setLayout(null);

		/**
		 * 各部品の設定
		 */
		titleLbl.setBounds(20, 10, 70, 20);
		addComLbl.setBounds(60, 60, 100, 20);
		totalLbl.setBounds(100, 10, 70, 20);
		cacheLbl.setBounds(190, 10, 180, 20);
		cacheyenLbl.setBounds(380, 10, 200, 20);
		costLbl.setBounds(450, 420, 340, 70);
		yearLbl.setBounds(810, 10, 100, 20);
		monthLbl.setBounds(900, 10, 70, 20);
		upgradeBtn.setBounds(310, 500, 340, 70);
		prevBtn.setBounds(750, 500, 110, 70);
		prev1Btn.setBounds(750, 400, 110, 70);

		/**
		 * 各部品をパネルに追加
		 */
		panel.add(titleLbl);
		panel.add(addComLbl);
		panel.add(totalLbl);
		panel.add(cacheLbl);
		panel.add(costLbl);
		panel.add(cacheyenLbl);
		panel.add(yearLbl);
		panel.add(monthLbl);
		panel.add(upgradeBtn);
		panel.add(prevBtn);
		panel.add(prev1Btn);

		/**
		 * ボタンにアクションリスナーを追加
		 */
		upgradeBtn.addActionListener(ctrl);
		prevBtn.addActionListener(ctrl);

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
