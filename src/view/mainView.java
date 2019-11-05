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
public class mainView extends JFrame{

	private JPanel panel;
	private JLabel titleLbl;			//総資産
	private JLabel totalLbl;           //
	private JLabel cacheLbl;			//キャッシュフロー
	private JLabel cacheyenLbl; 		//
	private JLabel yearLbl;			//年
	private JLabel monthLbl;			//月
	private JButton resourcesBtn;      //人材雇用ボタン
	private JButton trainingBtn;	    //育成ボタン
	private JButton requestBtn;	    //開発依頼ボタン
	private JButton extensionBtn;      //増築ボタン


	/**
	 * コンストラクタ
	 */
	public mainView(Controller ctrl) {


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


		requestBtn = new JButton("開発依頼");
		requestBtn.setFont(new Font("HGP行書体", Font.PLAIN, 30));


		extensionBtn = new JButton("増築");
		extensionBtn.setFont(new Font("HGP行書体", Font.PLAIN, 30));

		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		panel.setBorder(border);
		// panelのサイズ指定
		panel.setPreferredSize(new Dimension(1000, 600));

		panel.setLayout(null);

		/**
		 * 各部品の設定
		 */
		titleLbl.setBounds(30, 10, 70, 20);
		totalLbl.setBounds(120, 10, 70, 20);
		cacheLbl.setBounds(240, 10, 300, 20);
		cacheyenLbl.setBounds(450, 10, 200, 20);
		yearLbl.setBounds(1200, 10, 100, 20);
		monthLbl.setBounds(1350, 10, 70, 20);
		resourcesBtn.setBounds(117, 750, 200, 70);
		trainingBtn.setBounds(472, 750, 200, 70);
		requestBtn.setBounds(827, 750, 200, 70);
		extensionBtn.setBounds(1182, 750, 200, 70);




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
		panel.add(extensionBtn);

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

		ImagePanel phot = new ImagePanel("./testbiru.png");
		phot.setBounds(600,400,200,264);
		panel.add(phot);


	}

	public JPanel getPanel() {
		return panel;
	}

}
