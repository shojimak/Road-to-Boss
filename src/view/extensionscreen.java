package view;
// 勝本
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import controller.Controller;
/**
 * 増築画面クラス
 */
public class extensionscreen extends JFrame{

	private JPanel panel;
	private JPanel waku1;
	private JPanel waku2;
	private JPanel waku3;
	private JPanel waku4;
	private JPanel waku5;
	private JPanel waku6;
	private JPanel waku7;
	private JPanel waku8;

	private JLabel titleLbl;			//総資産
	private JLabel totalLbl;           //
	private JLabel cacheLbl;			//キャッシュフロー
	private JLabel cacheyenLbl; 		//
	private JLabel yearLbl;			//年
	private JLabel monthLbl;			//月

	private JLabel txt1Lbl;			//増築したい事を選んでください。
	private JLabel txt2Lbl;			//ツール
	private JLabel txt3Lbl;			//下級システムツール
	private JLabel txt4Lbl;			//中級システムツール
	private JLabel txt5Lbl;			//上級システムツール
	private JLabel txt6Lbl;			//パソコン
	private JLabel txt7Lbl;			//低スペックパソコン
	private JLabel txt8Lbl;			//中スペックパソコン
	private JLabel txt9Lbl;			//高スペックパソコン

	private JLabel Tyen1Lbl;			//
	private JLabel Tyen2Lbl;
	private JLabel Tyen3Lbl;
	private JLabel Pyen1Lbl;
	private JLabel Pyen2Lbl;
	private JLabel Pyen3Lbl;


	private JButton Tbuy1Btn;      //ツール購入ボタン
	private JButton Tbuy2Btn;	    //ツール購入ボタン
	private JButton Tbuy3Btn;	    //ツール購入ボタン
	private JButton Pbuy1Btn;      //PC購入ボタン
	private JButton Pbuy2Btn;      //PC購入ボタン
	private JButton Pbuy3Btn;      //PC購入ボタン

	private JButton BackBtn;		//戻るボタン
	private JButton UpgradeBtn;	//アップグレードボタン


	/**
	 * コンストラクタ
	 */
	public extensionscreen(Controller ctrl) {


		/**
		 * 各部品のインスタンス生成
		 */
		panel = new JPanel();
		waku1 = new JPanel();
		waku2 = new JPanel();
		waku3 = new JPanel();
		waku4 = new JPanel();
		waku5 = new JPanel();
		waku6 = new JPanel();
		waku7 = new JPanel();
		waku8 = new JPanel();

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

		txt1Lbl = new JLabel("増築したい事を選んでください。");
		txt1Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 40));

		txt2Lbl = new JLabel("ツール");
		txt2Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 40));

		txt3Lbl = new JLabel("下級システムツール");
		txt3Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 35));

		txt4Lbl = new JLabel("中級システムツール");
		txt4Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 35));

		txt5Lbl = new JLabel("上級システムツール");
		txt5Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 35));

		txt6Lbl = new JLabel("パソコン");
		txt6Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 40));

		txt7Lbl = new JLabel("低スペックパソコン");
		txt7Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 35));

		txt8Lbl = new JLabel("中スペックパソコン");
		txt8Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 35));

		txt9Lbl = new JLabel("高スペックパソコン");
		txt9Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 35));



		/*
		 * 値段
		 */
		Tyen1Lbl = new JLabel("30万");
		Tyen1Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));

		Tyen2Lbl = new JLabel("50万");
		Tyen2Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));

		Tyen3Lbl = new JLabel("70万");
		Tyen3Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));

		Pyen1Lbl = new JLabel("10万");
		Pyen1Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));

		Pyen2Lbl = new JLabel("20万");
		Pyen2Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));

		Pyen3Lbl = new JLabel("30万");
		Pyen3Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));



		/*
		 * 購入ボタン
		 */
		Tbuy1Btn = new JButton("購入");
		Tbuy1Btn.setFont(new Font("HGP行書体", Font.PLAIN, 20));

		Tbuy2Btn = new JButton("購入");
		Tbuy2Btn.setFont(new Font("HGP行書体", Font.PLAIN, 20));


		Tbuy3Btn = new JButton("購入");
		Tbuy3Btn.setFont(new Font("HGP行書体", Font.PLAIN, 20));


		Pbuy1Btn = new JButton("購入");
		Pbuy1Btn.setFont(new Font("HGP行書体", Font.PLAIN, 20));

		Pbuy2Btn = new JButton("購入");
		Pbuy2Btn.setFont(new Font("HGP行書体", Font.PLAIN, 20));

		Pbuy3Btn = new JButton("購入");
		Pbuy3Btn.setFont(new Font("HGP行書体", Font.PLAIN, 20));


		/*
		 * ボタン
		 */
		UpgradeBtn = new JButton("増築");
		UpgradeBtn.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 35));

		BackBtn = new JButton("戻る");
		BackBtn.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 35));


		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		panel.setBorder(border);
		waku1.setBorder(border);
		waku2.setBorder(border);
		waku3.setBorder(border);
		waku4.setBorder(border);
		waku5.setBorder(border);
		waku6.setBorder(border);
		waku7.setBorder(border);
		waku8.setBorder(border);

		// panelのサイズ指定
		panel.setPreferredSize(new Dimension(1000, 600));

		waku1.setPreferredSize(new Dimension(150, 200));
		waku1.setLayout(null);
		waku1.setBackground(Color.ORANGE);

		waku2.setPreferredSize(new Dimension(150, 200));
		waku2.setLayout(null);
		waku2.setBackground(Color.ORANGE);

		waku3.setPreferredSize(new Dimension(150, 200));
		waku3.setLayout(null);
		waku3.setBackground(Color.ORANGE);

		waku4.setPreferredSize(new Dimension(150, 200));
		waku4.setLayout(null);
		waku4.setBackground(Color.ORANGE);

		waku5.setPreferredSize(new Dimension(150, 200));
		waku5.setLayout(null);
		waku5.setBackground(Color.ORANGE);

		waku6.setPreferredSize(new Dimension(150, 200));
		waku6.setLayout(null);
		waku6.setBackground(Color.ORANGE);

		waku7.setPreferredSize(new Dimension(150, 200));
		waku7.setLayout(null);
		waku7.setBackground(Color.BLUE);

		waku8.setPreferredSize(new Dimension(150, 200));
		waku8.setLayout(null);
		waku8.setBackground(Color.BLUE);



		/**
		 * 各部品の設定
		 */
		titleLbl.setBounds(30, 10, 70, 20);
		totalLbl.setBounds(120, 10, 70, 20);
		cacheLbl.setBounds(240, 10, 300, 20);
		cacheyenLbl.setBounds(450, 10, 200, 20);
		yearLbl.setBounds(1200, 10, 100, 20);
		monthLbl.setBounds(1350, 10, 70, 20);


		txt1Lbl.setBounds(35, 60, 350, 40);
		txt2Lbl.setBounds(90, 120, 150, 40);
		txt3Lbl.setBounds(100, 200, 350, 35);
		txt4Lbl.setBounds(100, 255, 350, 35);
		txt5Lbl.setBounds(100, 310, 350, 35);
		txt6Lbl.setBounds(90, 400, 350, 40);
		txt7Lbl.setBounds(100, 470, 350, 35);
		txt8Lbl.setBounds(100, 525, 350, 35);
		txt9Lbl.setBounds(100, 580, 350, 35);


		Tyen1Lbl.setBounds(470, 200, 60, 35);
		Tyen2Lbl.setBounds(470, 255, 60, 35);
		Tyen3Lbl.setBounds(470, 310, 60, 35);
		Pyen1Lbl.setBounds(470, 470, 60, 35);
		Pyen2Lbl.setBounds(470, 525, 60, 35);
		Pyen3Lbl.setBounds(470, 580, 60, 35);


		Tbuy1Btn.setBounds(550, 200, 80, 35);
		Tbuy2Btn.setBounds(550, 255, 80, 35);
		Tbuy3Btn.setBounds(550, 310, 80, 35);
		Pbuy1Btn.setBounds(550, 470, 80, 35);
		Pbuy2Btn.setBounds(550, 525, 80, 35);
		Pbuy3Btn.setBounds(550, 580, 80, 35);

		UpgradeBtn.setBounds(1000, 550, 200, 70);
		BackBtn.setBounds(1000, 700, 200, 70);


		waku1.setBounds(100, 200, 450, 35);
		waku2.setBounds(100, 255, 450, 35);
		waku3.setBounds(100, 310, 450, 35);
		waku4.setBounds(100, 470, 450, 35);
		waku5.setBounds(100, 525, 450, 35);
		waku6.setBounds(100, 580, 450, 35);
		waku7.setBounds(85, 115, 560, 250);
		waku8.setBounds(85, 390, 560, 250);


		/**
		 * 各部品をパネルに追加
		 */
		panel.add(titleLbl);
		panel.add(totalLbl);
		panel.add(cacheLbl);
		panel.add(cacheyenLbl);
		panel.add(yearLbl);
		panel.add(monthLbl);
		panel.add(Tyen1Lbl);
		panel.add(Tyen2Lbl);
		panel.add(Tyen3Lbl);
		panel.add(Pyen1Lbl);
		panel.add(Pyen2Lbl);
		panel.add(Pyen3Lbl);
		panel.add(txt1Lbl);
		panel.add(txt2Lbl);
		panel.add(txt3Lbl);
		panel.add(txt4Lbl);
		panel.add(txt5Lbl);
		panel.add(txt6Lbl);
		panel.add(txt7Lbl);
		panel.add(txt8Lbl);
		panel.add(txt9Lbl);
		panel.add(Tbuy1Btn);
		panel.add(Tbuy2Btn);
		panel.add(Tbuy3Btn);
		panel.add(Pbuy1Btn);
		panel.add(Pbuy2Btn);
		panel.add(Pbuy3Btn);
		panel.add(BackBtn);
		panel.add(UpgradeBtn);
		panel.add(waku1);
		panel.add(waku2);
		panel.add(waku3);
		panel.add(waku4);
		panel.add(waku5);
		panel.add(waku6);
		panel.add(waku7);
		panel.add(waku8);




		/**
		 * ボタンにアクションリスナーを追加
		 */

		BackBtn.addActionListener(ctrl);
		UpgradeBtn.addActionListener(ctrl);

		/**
		 * ボタンにアクションコマンドを定義
		 */

		BackBtn.setActionCommand("EXTENSION_BACK_BTN");
		UpgradeBtn.setActionCommand("UPGRADE_BTN");

		/**
		 * 背景設定
		 */



	}

	public JPanel getPanel() {
		return panel;
	}

}
