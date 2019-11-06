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
public class requestList extends JFrame{

	private JPanel panel;
	private JPanel waku1;
	private JPanel waku2;
	private JPanel waku3;
	private JLabel titleLbl;			//総資産
	private JLabel totalLbl;           //
	private JLabel cacheLbl;			//キャッシュフロー
	private JLabel cacheyenLbl; 		//
	private JLabel yearLbl;			//年
	private JLabel monthLbl;			//月
	private JLabel erandeLbl;
	private JLabel iname1Lbl;
	private JLabel iname2Lbl;
	private JLabel iname3Lbl;

	private JLabel Conditions1;
	private JLabel Conditions2;
	private JLabel Conditions3;
	private JLabel Conditions4;

	private JLabel Conditions5;
	private JLabel Conditions6;
	private JLabel Conditions7;
	private JLabel Conditions8;

	private JLabel Conditions9;
	private JLabel Conditions10;
	private JLabel Conditions11;
	private JLabel Conditions12;


	private JLabel ninnzu1;
	private JLabel nouki1;
	private JLabel nannido1;
	private JLabel hoshu1;

	private JLabel ninnzu2;
	private JLabel nouki2;
	private JLabel nannido2;
	private JLabel hoshu2;

	private JLabel ninnzu3;
	private JLabel nouki3;
	private JLabel nannido3;
	private JLabel hoshu3;


	private JButton ketteiBtn;
	private JButton backBtn;



	/**
	 * コンストラクタ
	 */
	public requestList(Controller ctrl) {


		/**
		 * 各部品のインスタンス生成
		 */
		panel = new JPanel();
		waku1 = new JPanel();
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

		erandeLbl = new JLabel("開発依頼を選んでね");
		erandeLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 40));

		iname1Lbl = new JLabel("自動運転システム");
		iname1Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));

		iname2Lbl = new JLabel("自動販売機システム");
		iname2Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));

		iname3Lbl = new JLabel("銀行システム");
		iname3Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));


		Conditions1 = new JLabel("XX"+"人");
		Conditions1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		Conditions2 = new JLabel("３"+"ヶ月");
		Conditions2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		Conditions3 = new JLabel("C");
		Conditions3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		Conditions4 = new JLabel("XX"+"万");
		Conditions4.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));

		Conditions5 = new JLabel("XX"+"人");
		Conditions5.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		Conditions6 = new JLabel("３"+"ヶ月");
		Conditions6.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		Conditions7 = new JLabel("B");
		Conditions7.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		Conditions8 = new JLabel("XX" + "万");
		Conditions8.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));

		Conditions9 = new JLabel("XX"+"人");
		Conditions9.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		Conditions10 = new JLabel("３"+"ヶ月");
		Conditions10.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		Conditions11 = new JLabel("S");
		Conditions11.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		Conditions12 = new JLabel("XX" + "万");
		Conditions12.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));

		ninnzu1 = new JLabel("人数上限");
		ninnzu1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		nouki1 = new JLabel("納期");
		nouki1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		nannido1 = new JLabel("難易度");
		nannido1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		hoshu1 = new JLabel("報酬");
		hoshu1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));

		ninnzu2 = new JLabel("人数上限");
		ninnzu2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		nouki2 = new JLabel("納期");
		nouki2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		nannido2 = new JLabel("難易度");
		nannido2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		hoshu2 = new JLabel("報酬");
		hoshu2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));


		ninnzu3 = new JLabel("人数上限");
		ninnzu3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		nouki3 = new JLabel("納期");
		nouki3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		nannido3 = new JLabel("難易度");
		nannido3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		hoshu3 = new JLabel("報酬");
		hoshu3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));


		ketteiBtn = new JButton("決定する");
		ketteiBtn.setFont(new Font("HGP行書体", Font.PLAIN, 40));

		backBtn = new JButton("戻る");
		backBtn.setFont(new Font("HGP行書体", Font.PLAIN, 40));


		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		panel.setBorder(border);
		waku1.setBorder(border);
		waku2.setBorder(border);
		waku3.setBorder(border);
		// panelのサイズ指定
		panel.setPreferredSize(new Dimension(1500, 900));

		panel.setLayout(null);
		waku1.setPreferredSize(new Dimension(150, 200));
		waku1.setLayout(null);


		waku2.setPreferredSize(new Dimension(150, 200));
		waku2.setLayout(null);

		waku3.setPreferredSize(new Dimension(150, 200));
		waku3.setLayout(null);


		/**
		 * 各部品の設定
		 */
		titleLbl.setBounds(20, 10, 70, 20);
		totalLbl.setBounds(100, 10, 70, 20);
		cacheLbl.setBounds(190, 10, 180, 20);
		cacheyenLbl.setBounds(380, 10, 200, 20);
		yearLbl.setBounds(810, 10, 100, 20);
		monthLbl.setBounds(900, 10, 70, 20);
		erandeLbl.setBounds(140, 100, 440, 40);
		iname1Lbl.setBounds(140, 220, 350, 30);
		iname2Lbl.setBounds(590, 220, 350, 30);
		iname3Lbl.setBounds(1040, 220, 350, 30);


		waku1.setBounds(100, 200, 400, 350);
		waku2.setBounds(550, 200, 400, 350);
		waku3.setBounds(1000, 200, 400, 350);

		Conditions1.setBounds(360, 280, 200, 25);
		Conditions2.setBounds(360, 340, 200, 25);
		Conditions3.setBounds(360, 400, 200, 25);
		Conditions4.setBounds(360, 460, 200, 25);

		Conditions5.setBounds(810, 280, 200, 25);
		Conditions6.setBounds(810, 340, 200, 25);
		Conditions7.setBounds(810, 400, 200, 25);
		Conditions8.setBounds(810, 460, 200, 25);

		Conditions9.setBounds(1260, 280, 200, 25);
		Conditions10.setBounds(1260, 340, 200, 25);
		Conditions11.setBounds(1260, 400, 200, 25);
		Conditions12.setBounds(1260, 460, 200, 25);

		ninnzu1.setBounds(195, 280, 130, 25);
		nouki1.setBounds(195, 340, 130, 25);
		nannido1.setBounds(195, 400, 130, 25);
		hoshu1.setBounds(195, 460, 130, 25);

		ninnzu2.setBounds(645, 280, 130, 25);
		nouki2.setBounds(645, 340, 130, 25);
		nannido2.setBounds(645, 400, 130, 25);
		hoshu2.setBounds(645, 460, 130, 25);

		ninnzu3.setBounds(1095, 280, 130, 25);
		nouki3.setBounds(1095, 340, 130, 25);
		nannido3.setBounds(1095, 400, 130, 25);
		hoshu3.setBounds(1095, 460, 130, 25);



		ketteiBtn.setBounds(680, 650,200 , 30);
		backBtn.setBounds(680, 700, 200, 30);


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
		panel.add(iname1Lbl);
		panel.add(iname2Lbl);
		panel.add(iname3Lbl);

		panel.add(Conditions1);
		panel.add(Conditions2);
		panel.add(Conditions3);
		panel.add(Conditions4);
		panel.add(Conditions5);
		panel.add(Conditions6);
		panel.add(Conditions7);
		panel.add(Conditions8);
		panel.add(Conditions9);
		panel.add(Conditions10);
		panel.add(Conditions11);
		panel.add(Conditions12);
		panel.add(ninnzu1);
		panel.add(nouki1);
		panel.add(nannido1);
		panel.add(hoshu1);
		panel.add(ninnzu2);
		panel.add(nouki2);
		panel.add(nannido2);
		panel.add(hoshu2);
		panel.add(ninnzu3);
		panel.add(nouki3);
		panel.add(nannido3);
		panel.add(hoshu3);
		panel.add(waku1);
		panel.add(waku2);
		panel.add(waku3);


		panel.add(ketteiBtn);
		panel.add(backBtn);





		/**
		 * ボタンにアクションリスナーを追加
		 */

		ketteiBtn.addActionListener(ctrl);
		backBtn.addActionListener(ctrl);
		/**
		 * ボタンにアクションコマンドを定義
		 */


		ketteiBtn.setActionCommand("KETTEI_BTN");
		backBtn.setActionCommand("REQUESTLIST_BACK");


		/**
		 * 背景設定
		 */



	}

	public JPanel getPanel() {
		return panel;
	}

}