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
public class employmentscreen extends JFrame{

	private JPanel panel;
	private JLabel titleLbl;			//総資産
	private JLabel totalLbl;           //
	private JLabel cacheLbl;			//キャッシュフロー
	private JLabel cacheyenLbl; 		//
	private JLabel yearLbl;			//年
	private JLabel monthLbl;			//月
	private JLabel erandeLbl;
	private JLabel name1Lbl;
	private JLabel name2Lbl;
	private JLabel name3Lbl;
	private JLabel kyaraname1;
	private JLabel kyaraname2;
	private JLabel kyaraname3;
	private JLabel nouryoku1;
	private JLabel nouryoku2;
	private JLabel nouryoku3;

	private JLabel tikara1;
	private JLabel tikara2;
	private JLabel tikara3;
	private JLabel tikara4;

	private JLabel tikara5;
	private JLabel tikara6;
	private JLabel tikara7;
	private JLabel tikara8;

	private JLabel tikara9;
	private JLabel tikara10;
	private JLabel tikara11;
	private JLabel tikara12;


	private JLabel puroguramu1;
	private JLabel dezain1;
	private JLabel sekkei1;
	private JLabel siki1;
	private JLabel geshuu1;
	private JLabel geshuusu1;
	private JLabel puroguramu2;
	private JLabel dezain2;
	private JLabel sekkei2;
	private JLabel siki2;
	private JLabel geshuu2;
	private JLabel geshuusu2;
	private JLabel puroguramu3;
	private JLabel dezain3;
	private JLabel sekkei3;
	private JLabel siki3;
	private JLabel geshuu3;
	private JLabel geshuusu3;

	private JButton employmentBtn;
	private JButton backBtn;
	private JButton listBtn;


	/**
	 * コンストラクタ
	 */
	public employmentscreen(Controller ctrl) {


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

		erandeLbl = new JLabel("雇用したい人を選んでね");
		erandeLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));

		name1Lbl = new JLabel("名前");
		name1Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		name2Lbl = new JLabel("名前");
		name2Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		name3Lbl = new JLabel("名前");
		name3Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		kyaraname1 = new JLabel("スタッ　フ子");
		kyaraname1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		kyaraname2 = new JLabel("オタ　タロウ");
		kyaraname2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		kyaraname3 = new JLabel("キ　マジメ");
		kyaraname3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		nouryoku1 = new JLabel("能力");
		nouryoku1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		nouryoku2 = new JLabel("能力");
		nouryoku2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		nouryoku3 = new JLabel("能力");
		nouryoku3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		tikara1 = new JLabel("C");
		tikara1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		tikara2 = new JLabel("C");
		tikara2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		tikara3 = new JLabel("C");
		tikara3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		tikara4 = new JLabel("C");
		tikara4.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		tikara5 = new JLabel("B");
		tikara5.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		tikara6 = new JLabel("B");
		tikara6.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		tikara7 = new JLabel("B");
		tikara7.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		tikara8 = new JLabel("B");
		tikara8.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		tikara9 = new JLabel("S");
		tikara9.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		tikara10 = new JLabel("S");
		tikara10.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		tikara11 = new JLabel("S");
		tikara11.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		tikara12 = new JLabel("S");
		tikara12.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
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
		puroguramu2 = new JLabel("プログラム");
		puroguramu2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		dezain2 = new JLabel("デザイン");
		dezain2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		sekkei2 = new JLabel("設計");
		sekkei2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		siki2 = new JLabel("指揮");
		siki2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		geshuu2 = new JLabel("月収");
		geshuu2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		geshuusu2 = new JLabel("XX万");
		geshuusu2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		puroguramu3 = new JLabel("プログラム");
		puroguramu3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		dezain3 = new JLabel("デザイン");
		dezain3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		sekkei3 = new JLabel("設計");
		sekkei3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		siki3 = new JLabel("指揮");
		siki3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		geshuu3 = new JLabel("月収");
		geshuu3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		geshuusu3 = new JLabel("XX万");
		geshuusu3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		employmentBtn = new JButton("雇用する");
		employmentBtn.setFont(new Font("HGP行書体", Font.PLAIN, 40));

		backBtn = new JButton("戻る");
		backBtn.setFont(new Font("HGP行書体", Font.PLAIN, 40));

		listBtn = new JButton("社員一覧");
		listBtn.setFont(new Font("HGP行書体", Font.PLAIN, 40));

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
		name2Lbl.setBounds(455, 135, 50, 20);
		name3Lbl.setBounds(750, 135, 50, 20);
		kyaraname1.setBounds(210, 135, 160, 20);
		kyaraname2.setBounds(505, 135, 160, 20);
		kyaraname3.setBounds(800, 135, 160, 20);
		nouryoku1.setBounds(175, 175, 50, 20);
		nouryoku2.setBounds(470, 175, 50, 20);
		nouryoku3.setBounds(765, 175, 50, 20);

		tikara1.setBounds(310, 210, 70, 20);
		tikara2.setBounds(310, 240, 70, 20);
		tikara3.setBounds(310, 270, 70, 20);
		tikara4.setBounds(310, 300, 70, 20);

		tikara5.setBounds(620, 210, 70, 20);
		tikara6.setBounds(620, 240, 70, 20);
		tikara7.setBounds(620, 270, 70, 20);
		tikara8.setBounds(620, 300, 70, 20);

		tikara9.setBounds(915, 210, 70, 20);
		tikara10.setBounds(915, 240, 70, 20);
		tikara11.setBounds(915, 270, 70, 20);
		tikara12.setBounds(915, 300, 70, 20);

		puroguramu1.setBounds(195, 210, 130, 20);
		dezain1.setBounds(195, 240, 100, 20);
		sekkei1.setBounds(195, 270, 80, 20);
		siki1.setBounds(195, 300, 800, 20);
		geshuu1.setBounds(195, 330, 80, 20);
		geshuusu1.setBounds(260, 330, 70, 20);

		puroguramu2.setBounds(505, 210, 130, 20);
		dezain2.setBounds(505, 240, 100, 20);
		sekkei2.setBounds(505, 270, 80, 20);
		siki2.setBounds(505, 300, 800, 20);
		geshuu2.setBounds(505, 330, 80, 20);
		geshuusu2.setBounds(570, 330, 70, 20);

		puroguramu3.setBounds(800, 210, 130, 20);
		dezain3.setBounds(800, 240, 100, 20);
		sekkei3.setBounds(800, 270, 80, 20);
		siki3.setBounds(800, 300, 80, 20);
		geshuu3.setBounds(800, 330, 80, 20);
		geshuusu3.setBounds(865, 330, 70, 20);


		employmentBtn.setBounds(450, 450,150 , 30);
		backBtn.setBounds(450, 500, 150, 30);
		listBtn .setBounds(800, 500, 150, 30);


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
		panel.add(name2Lbl);
		panel.add(name3Lbl);
		panel.add(kyaraname1);
		panel.add(kyaraname2);
		panel.add(kyaraname3);
		panel.add(nouryoku1);
		panel.add(nouryoku2);
		panel.add(nouryoku3);
		panel.add(tikara1);
		panel.add(tikara2);
		panel.add(tikara3);
		panel.add(tikara4);
		panel.add(tikara5);
		panel.add(tikara6);
		panel.add(tikara7);
		panel.add(tikara8);
		panel.add(tikara9);
		panel.add(tikara10);
		panel.add(tikara11);
		panel.add(tikara12);
		panel.add(puroguramu1);
		panel.add(dezain1);
		panel.add(sekkei1);
		panel.add(siki1);
		panel.add(geshuu1);
		panel.add(geshuusu1);
		panel.add(puroguramu2);
		panel.add(dezain2);
		panel.add(sekkei2);
		panel.add(siki2);
		panel.add(geshuu2);
		panel.add(geshuusu2);
		panel.add(puroguramu3);
		panel.add(dezain3);
		panel.add(sekkei3);
		panel.add(siki3);
		panel.add(geshuu3);
		panel.add(geshuusu3);
		panel.add(employmentBtn);
		panel.add(backBtn);
		panel.add(listBtn);




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
