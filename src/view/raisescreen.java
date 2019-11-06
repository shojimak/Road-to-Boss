package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import controller.Controller;
/**
 * 雇用選び画面
 */
public class raisescreen extends JFrame{

	private JPanel panel;
	private JPanel waku2;
	private JPanel waku3;
	private JLabel titleLbl;			//総資産
	private JLabel totalLbl;           //
	private JLabel cacheLbl;			//キャッシュフロー
	private JLabel cacheyenLbl; 		//
	private JLabel yearLbl;			//年
	private JLabel monthLbl;			//月
	private JLabel erandeLbl;
	private JLabel listLbl;
	private JLabel name2Lbl;
	private JLabel name3Lbl;

	private JLabel kyaraname2;
	private JLabel kyaraname3;
	private JLabel nouryoku1;
	private JLabel nouryoku2;
	private JLabel nouryoku3;

	private JLabel comment;

	private JRadioButton proguramu;
	private JRadioButton dezain;
	private JRadioButton sekkei;
	private JRadioButton siki;

	private JLabel tikara5;
	private JLabel tikara6;
	private JLabel tikara7;
	private JLabel tikara8;

	private JLabel tikara9;
	private JLabel tikara10;
	private JLabel tikara11;
	private JLabel tikara12;

	private JLabel kikanLbl;
	private JTextField kikantext;
	private JLabel tuki;


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

	private JButton ketteiBtn;
	private JButton backBtn;

	ButtonGroup group = new ButtonGroup();


	/**
	 * コンストラクタ
	 */
	public raisescreen(Controller ctrl) {


		/**
		 * 各部品のインスタンス生成
		 */
		panel = new JPanel();
		waku2 = new JPanel();
		waku3 = new JPanel();

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

		erandeLbl = new JLabel("育成したい人を選んでね");
		erandeLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 40));
		listLbl = new JLabel("社員一覧");
		listLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));

		name2Lbl = new JLabel("名前");
		name2Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		name3Lbl = new JLabel("名前");
		name3Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		kyaraname2 = new JLabel("オタ　タロウ");
		kyaraname2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		kyaraname3 = new JLabel("オタ　タロウ");
		kyaraname3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		nouryoku1 = new JLabel("能力");
		nouryoku1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));
		nouryoku2 = new JLabel("能力");
		nouryoku2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		nouryoku3 = new JLabel("能力");
		nouryoku3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		comment = new JLabel("育成したい能力、期間を決めてね");
		comment.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));

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

		proguramu = new JRadioButton("プログラム");
		proguramu.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));
		proguramu.setBackground(Color.ORANGE);
		dezain = new JRadioButton("デザイン");
		dezain.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));
		dezain.setBackground(Color.ORANGE);
		sekkei = new JRadioButton("設計");
		sekkei.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));
		sekkei.setBackground(Color.ORANGE);
		siki = new JRadioButton("指揮");
		siki.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));
		siki.setBackground(Color.ORANGE);

		kikanLbl = new JLabel("期間");
		kikanLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));
		tuki = new JLabel("ヶ月");
		tuki.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));



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

		ketteiBtn = new JButton("決定");
		ketteiBtn.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		backBtn = new JButton("戻る");
		backBtn.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		kikantext = new JTextField("");


		BevelBorder border = new BevelBorder(BevelBorder.RAISED);


		panel.setBorder(border);
		waku2.setBorder(border);
		waku3.setBorder(border);
		// panelのサイズ指定

		panel.setPreferredSize(new Dimension(1500, 900));

		panel.setLayout(null);

		waku2.setPreferredSize(new Dimension(150, 200));
		waku2.setLayout(null);
		waku2.setBackground(Color.RED);

		waku3.setPreferredSize(new Dimension(150, 200));
		waku3.setLayout(null);
		waku3.setBackground(Color.RED);

		/**
		 * 各部品の設定
		 */
		titleLbl.setBounds(20, 10, 70, 20);
		totalLbl.setBounds(100, 10, 70, 20);
		cacheLbl.setBounds(190, 10, 180, 20);
		cacheyenLbl.setBounds(380, 10, 200, 20);
		yearLbl.setBounds(810, 10, 100, 20);
		monthLbl.setBounds(900, 10, 70, 20);
		erandeLbl.setBounds(150, 100, 600, 70);
		listLbl.setBounds(150,200,150,30);

		name2Lbl.setBounds(720, 220, 50, 25);
		name3Lbl.setBounds(1170, 220, 50, 25);

		kyaraname2.setBounds(790, 220, 160, 20);
		kyaraname3.setBounds(1240, 220, 160, 20);

		waku2.setBounds(550, 200, 400, 350);
		waku3.setBounds(1000, 200, 400, 350);

		nouryoku1.setBounds(465, 630, 100, 30);
		nouryoku2.setBounds(740, 260, 50, 20);
		nouryoku3.setBounds(1190, 260, 50, 20);
		comment.setBounds(400, 560, 500, 70);



		tikara5.setBounds(890, 310, 70, 20);
		tikara6.setBounds(890, 350, 70, 20);
		tikara7.setBounds(890, 390, 70, 20);
		tikara8.setBounds(890, 430, 70, 20);

		tikara9.setBounds(1340, 310, 70, 20);
		tikara10.setBounds(1340, 350, 70, 20);
		tikara11.setBounds(1340, 390, 70, 20);
		tikara12.setBounds(1340, 430, 70, 20);

		proguramu.setBounds(550, 680, 200, 35);
		dezain.setBounds(550, 725, 200, 35);
		sekkei.setBounds(550, 770, 200, 35);
		siki.setBounds(550, 815, 200, 35);


		puroguramu2.setBounds(740, 310, 130, 20);
		dezain2.setBounds(740, 350, 100, 20);
		sekkei2.setBounds(740, 390, 80, 20);
		siki2.setBounds(740, 430, 800, 20);
		geshuu2.setBounds(690, 510, 80, 20);
		geshuusu2.setBounds(750, 510, 70, 20);

		puroguramu3.setBounds(1190, 310, 130, 20);
		dezain3.setBounds(1190, 350, 100, 20);
		sekkei3.setBounds(1190, 390, 80, 20);
		siki3.setBounds(1190, 430, 800, 20);
		geshuu3.setBounds(1140, 510, 80, 20);
		geshuusu3.setBounds(1200, 510, 70, 20);

		kikantext.setBounds(850,730,100,50);

		kikanLbl.setBounds(770,630,100,50);
		tuki.setBounds(950,730,100,50);

		ketteiBtn.setBounds(1200,700,100,50);
		backBtn.setBounds(1200,770,100,50);




		/*ラジオボタングループ*/
		group.add(proguramu);
	    group.add(dezain);
	    group.add(sekkei);
	    group.add(siki);
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
		panel.add(listLbl);
		panel.add(name2Lbl);
		panel.add(name3Lbl);

		panel.add(kyaraname2);
		panel.add(kyaraname3);

		panel.add(nouryoku1);
		panel.add(nouryoku2);
		panel.add(nouryoku3);
		panel.add(comment);

		panel.add(tikara5);
		panel.add(tikara6);
		panel.add(tikara7);
		panel.add(tikara8);
		panel.add(tikara9);
		panel.add(tikara10);
		panel.add(tikara11);
		panel.add(tikara12);

		panel.add(proguramu);
		panel.add(dezain);
		panel.add(sekkei);
		panel.add(siki);

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

		panel.add(kikanLbl);
		panel.add(tuki);
		panel.add(kikantext);
		panel.add(ketteiBtn);
		panel.add(backBtn);
		panel.add(waku2);
		panel.add(waku3);






		/**
		 * ボタンにアクションリスナーを追加
		 */

		ketteiBtn.addActionListener(ctrl);
		backBtn.addActionListener(ctrl);



		/**
		 * ボタンにアクションコマンドを定義
		 */

		ketteiBtn.setActionCommand("RAISE_SCREEN_BACK");
		backBtn.setActionCommand("RAISE_SCREEN_BACK");


		/**
		 * 背景設定
		 */



	}

	public JPanel getPanel() {
		return panel;
	}

}
