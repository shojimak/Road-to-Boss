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
 * 人材一覧画面
 */
public class memberlist extends JFrame{

	private JPanel panel;
	private JLabel titleLbl;			//総資産
	private JLabel totalLbl;           //
	private JLabel cacheLbl;			//キャッシュフロー
	private JLabel cacheyenLbl; 		//
	private JLabel yearLbl;			//年
	private JLabel monthLbl;			//月
	private JLabel erandeLbl;
	private JLabel name1Lbl;
	private JLabel kyaraname1;

	private JLabel nouryoku1;


	private JLabel tikara1;
	private JLabel tikara2;
	private JLabel tikara3;
	private JLabel tikara4;

	private JLabel puroguramu1;
	private JLabel dezain1;
	private JLabel sekkei1;
	private JLabel siki1;
	private JLabel geshuu1;
	private JLabel geshuusu1;


	private JButton discardBtn;
	private JButton backBtn;



	/**
	 * コンストラクタ
	 */
	public memberlist(Controller ctrl) {


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

		erandeLbl = new JLabel("社員一覧");
		erandeLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));

		name1Lbl = new JLabel("名前");
		name1Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));


		kyaraname1 = new JLabel("スタッ　フ子");
		kyaraname1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));


		nouryoku1 = new JLabel("能力");
		nouryoku1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		tikara1 = new JLabel("C");
		tikara1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		tikara2 = new JLabel("C");
		tikara2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		tikara3 = new JLabel("C");
		tikara3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		tikara4 = new JLabel("C");
		tikara4.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));


		puroguramu1 = new JLabel("プログラム");
		puroguramu1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		dezain1 = new JLabel("デザイン");
		dezain1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		sekkei1 = new JLabel("設計");
		sekkei1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		siki1 = new JLabel("指揮");
		siki1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		geshuu1 = new JLabel("月収");
		geshuu1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		geshuusu1 = new JLabel("XX万");
		geshuusu1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		discardBtn = new JButton("解雇する");
		discardBtn.setFont(new Font("HGP行書体", Font.PLAIN, 40));

		backBtn = new JButton("戻る");
		backBtn.setFont(new Font("HGP行書体", Font.PLAIN, 40));


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
		erandeLbl.setBounds(100, 50, 440, 30);
		name1Lbl.setBounds(160, 135, 50, 20);

		kyaraname1.setBounds(210, 135, 160, 20);

		nouryoku1.setBounds(175, 175, 50, 20);


		tikara1.setBounds(310, 210, 70, 20);
		tikara2.setBounds(310, 240, 70, 20);
		tikara3.setBounds(310, 270, 70, 20);
		tikara4.setBounds(310, 300, 70, 20);



		puroguramu1.setBounds(195, 210, 130, 20);
		dezain1.setBounds(195, 240, 100, 20);
		sekkei1.setBounds(195, 270, 80, 20);
		siki1.setBounds(195, 300, 800, 20);
		geshuu1.setBounds(195, 330, 80, 20);
		geshuusu1.setBounds(260, 330, 70, 20);



		discardBtn.setBounds(1200, 700,170 , 50);
		backBtn.setBounds(1200, 770, 170, 50);


		/**
		 * 各部品をパネルに追加
		 */
		panel.add(titleLbl);
		panel.add(totalLbl);
		panel.add(cacheLbl);
		panel.add(cacheyenLbl);
		panel.add(yearLbl);
		panel.add(monthLbl);
		panel.add(erandeLbl);
		panel.add(name1Lbl);

		panel.add(kyaraname1);

		panel.add(nouryoku1);

		panel.add(tikara1);
		panel.add(tikara2);
		panel.add(tikara3);
		panel.add(tikara4);

		panel.add(puroguramu1);
		panel.add(dezain1);
		panel.add(sekkei1);
		panel.add(siki1);
		panel.add(geshuu1);
		panel.add(geshuusu1);

		panel.add(backBtn);
		panel.add(discardBtn);




		/**
		 * ボタンにアクションリスナーを追加
		 */
		//resourcesBtn.addActionListener(ctrl);

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