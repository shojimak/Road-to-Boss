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

		erandeLbl = new JLabel("開発依頼を選んでね");
		erandeLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 30));

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




		saisoku1 = new JLabel("開発メンバーを決めてください");
		saisoku1.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		saisoku2 = new JLabel("開発期間を決めてください");
		saisoku2.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		kagetuLbl = new JLabel("ヶ月");
		kagetuLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		zyoukenLbl = new JLabel("人数条件");
		zyoukenLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		ninnzuLbl = new JLabel("XX"+"人");
		ninnzuLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		kakurituLbl = new JLabel("成功確率");
		kakurituLbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));
		par = new JLabel("%");
		par.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));



		nanngatu = new JTextField("");
		parsent = new JTextField("");


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
		erandeLbl.setBounds(100, 50, 440, 30);
		iname1Lbl.setBounds(160, 135, 50, 20);
		waku1.setBounds(160, 135, 280, 230);

		waku2.setBounds(850, 210, 200, 230);



		Conditions1.setBounds(310, 210, 70, 20);
		Conditions2.setBounds(310, 240, 70, 20);
		Conditions3.setBounds(310, 270, 70, 20);
		Conditions4.setBounds(310, 300, 70, 20);

		saisoku1.setBounds(900, 100, 200, 20);
		saisoku2.setBounds(1200, 100, 200, 20);
		kagetuLbl.setBounds(1300, 200, 70, 20);
		zyoukenLbl.setBounds(900, 150, 70, 20);
		ninnzuLbl.setBounds(1050, 150, 70, 20);
		kakurituLbl.setBounds(1100, 310, 150, 20);
		par.setBounds(1400, 310, 70, 20);


		ninnzu1.setBounds(195, 210, 130, 20);
		nouki1.setBounds(195, 240, 100, 20);
		nannido1.setBounds(195, 270, 80, 20);
		hoshu1.setBounds(195, 300, 800, 20);

		nanngatu.setBounds(1200,200,100,50);
		parsent.setBounds(1250,300,100,50);

		ketteiBtn.setBounds(450, 450,200 , 30);
		backBtn.setBounds(450, 500, 200, 30);


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