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
 * 雇用選び画面
 */
public class requestDetails extends JFrame{

	private JPanel panel;
	private JPanel waku1;
	private JPanel waku2;
	private JLabel titleLbl;			//総資産
	private JLabel totalLbl;           //
	private JLabel cacheLbl;			//キャッシュフロー
	private JLabel cacheyenLbl; 		//
	private JLabel yearLbl;			//年
	private JLabel monthLbl;			//月
	private JLabel erandeLbl;
	private JLabel iname1Lbl;
	private JLabel Conditions1;
	private JLabel Conditions2;
	private JLabel Conditions3;
	private JLabel Conditions4;

	private JLabel saisoku1;
	private JLabel saisoku2;

	private JLabel kagetuLbl;
	private JLabel zyoukenLbl;
	private JLabel ninnzuLbl;
	private JLabel kakurituLbl;
	private JLabel par;



	private JLabel ninnzu1;
	private JLabel nouki1;
	private JLabel nannido1;
	private JLabel hoshu1;



	private JTextField nanngatu;
	private JTextField parsent;

	private JButton ketteiBtn;
	private JButton backBtn;



	/**
	 * コンストラクタ
	 */
	public requestDetails(Controller ctrl) {


		/**
		 * 各部品のインスタンス生成
		 */
		panel = new JPanel();
		waku1 = new JPanel();
		waku2 = new JPanel();



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

		erandeLbl = new JLabel("依頼詳細");
		erandeLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 40));

		iname1Lbl = new JLabel("自動運転システム");
		iname1Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));




		Conditions1 = new JLabel("XX"+"人");
		Conditions1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		Conditions2 = new JLabel("３"+"ヶ月");
		Conditions2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		Conditions3 = new JLabel("C");
		Conditions3.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		Conditions4 = new JLabel("XX"+"万");
		Conditions4.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));


		ninnzu1 = new JLabel("人数上限");
		ninnzu1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		nouki1 = new JLabel("納期");
		nouki1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		nannido1 = new JLabel("難易度");
		nannido1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		hoshu1 = new JLabel("報酬");
		hoshu1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));




		saisoku1 = new JLabel("開発メンバーを選ぼう");
		saisoku1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 28));
		saisoku2 = new JLabel("開発期間を決めてね");
		saisoku2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 28));
		kagetuLbl = new JLabel("ヶ月");
		kagetuLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 40));
		zyoukenLbl = new JLabel("人数条件");
		zyoukenLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		ninnzuLbl = new JLabel("XX"+"人");
		ninnzuLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 25));
		kakurituLbl = new JLabel("成功確率");
		kakurituLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 45));
		par = new JLabel("%");
		par.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 40));



		nanngatu = new JTextField("");
		nanngatu.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));
		parsent = new JTextField("");
		parsent.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));


		ketteiBtn = new JButton("決定する");
		ketteiBtn.setFont(new Font("HGP行書体", Font.PLAIN, 40));

		backBtn = new JButton("戻る");
		backBtn.setFont(new Font("HGP行書体", Font.PLAIN, 40));


		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		panel.setBorder(border);
		waku1.setBorder(border);
		waku2.setBorder(border);

		// panelのサイズ指定
		panel.setPreferredSize(new Dimension(1500, 900));

		panel.setLayout(null);
		waku1.setPreferredSize(new Dimension(150, 200));
		waku1.setLayout(null);


		waku2.setPreferredSize(new Dimension(150, 200));
		waku2.setLayout(null);



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
		waku1.setBounds(100, 200, 400, 350);

		waku2.setBounds(540, 200, 320, 350);



		Conditions1.setBounds(360, 280, 200, 25);
		Conditions2.setBounds(360, 340, 200, 25);
		Conditions3.setBounds(360, 400, 200, 25);
		Conditions4.setBounds(360, 460, 200, 25);

		saisoku1.setBounds(550, 120, 380, 30);
		saisoku2.setBounds(900, 120, 380, 30);
		kagetuLbl.setBounds(1220, 250, 150, 40);
		zyoukenLbl.setBounds(680, 170, 130, 25);
		ninnzuLbl.setBounds(790, 170, 130, 25);
		kakurituLbl.setBounds(1000, 400, 250, 45);
		par.setBounds(1300, 400, 70, 40);


		ninnzu1.setBounds(195, 280, 130, 25);
		nouki1.setBounds(195, 340, 130, 25);
		nannido1.setBounds(195, 400, 130, 25);
		hoshu1.setBounds(195, 460, 130, 25);

		nanngatu.setBounds(1100,250,100,50);
		parsent.setBounds(1200,400,100,50);

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

		panel.add(Conditions1);
		panel.add(Conditions2);
		panel.add(Conditions3);
		panel.add(Conditions4);

		panel.add(ninnzu1);
		panel.add(nouki1);
		panel.add(nannido1);
		panel.add(hoshu1);

		panel.add(nanngatu);
		panel.add(parsent);


		panel.add(ketteiBtn);
		panel.add(backBtn);
		panel.add(waku1);
		panel.add(waku2);

		panel.add(saisoku1);
		panel.add(saisoku2);
		panel.add(kagetuLbl);
		panel.add(zyoukenLbl);
		panel.add(ninnzuLbl);
		panel.add(kakurituLbl);
		panel.add(par);




		/**
		 * ボタンにアクションリスナーを追加
		 */
		ketteiBtn.addActionListener(ctrl);
		backBtn.addActionListener(ctrl);

		/**
		 * ボタンにアクションコマンドを定義
		 */
		ketteiBtn.setActionCommand("KAKUNIN");
		backBtn.setActionCommand("DETAILS_BACK");


		/**
		 * 背景設定
		 */



	}

	public JPanel getPanel() {
		return panel;
	}

}