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
 * モード選択画面クラス
 */
public class extensionscreen extends JFrame{

	private JPanel panel;
	private JPanel waku;
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



	/**
	 * コンストラクタ
	 */
	public extensionscreen(Controller ctrl) {


		/**
		 * 各部品のインスタンス生成
		 */
		panel = new JPanel();
		waku = new JPanel();

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
		txt1Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		txt2Lbl = new JLabel("ツール");
		txt2Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		txt3Lbl = new JLabel("下級システムツール");
		txt3Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		txt4Lbl = new JLabel("中級システムツール");
		txt4Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		txt5Lbl = new JLabel("上級システムツール");
		txt5Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		txt6Lbl = new JLabel("パソコン");
		txt6Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		txt7Lbl = new JLabel("低スペックパソコン");
		txt7Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		txt8Lbl = new JLabel("中スペックパソコン");
		txt8Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));

		txt9Lbl = new JLabel("高スペックパソコン");
		txt9Lbl.setFont(new Font("HGS創英角ｺﾞｼｯｸUB", Font.BOLD, 20));


		/*
		 * 購入ボタン
		 */
		Tbuy1Btn = new JButton("購入する");
		Tbuy1Btn.setFont(new Font("HGP行書体", Font.PLAIN, 20));

		Tbuy2Btn = new JButton("購入する");
		Tbuy2Btn.setFont(new Font("HGP行書体", Font.PLAIN, 20));


		Tbuy3Btn = new JButton("購入する");
		Tbuy3Btn.setFont(new Font("HGP行書体", Font.PLAIN, 20));


		Pbuy1Btn = new JButton("購入する");
		Pbuy1Btn.setFont(new Font("HGP行書体", Font.PLAIN, 20));

		Pbuy2Btn = new JButton("購入する");
		Pbuy2Btn.setFont(new Font("HGP行書体", Font.PLAIN, 20));

		Pbuy3Btn = new JButton("購入する");
		Pbuy3Btn.setFont(new Font("HGP行書体", Font.PLAIN, 20));

		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		panel.setBorder(border);
		waku.setBorder(border);
		// panelのサイズ指定
		panel.setPreferredSize(new Dimension(1000, 600));
		waku.setPreferredSize(new Dimension(200, 70));

		panel.setLayout(null);
		waku.setLayout(null);
		waku.setBackground(Color.red);
		/**
		 * 各部品の設定
		 */
		titleLbl.setBounds(30, 10, 70, 20);
		totalLbl.setBounds(120, 10, 70, 20);
		cacheLbl.setBounds(240, 10, 300, 20);
		cacheyenLbl.setBounds(450, 10, 200, 20);
		yearLbl.setBounds(1200, 10, 100, 20);
		monthLbl.setBounds(1350, 10, 70, 20);
		txt1Lbl.setBounds(35, 50, 350, 20);
		txt2Lbl.setBounds(90, 100, 70, 20);
		txt3Lbl.setBounds(40, 50, 350, 20);
		txt4Lbl.setBounds(40, 50, 350, 20);
		txt5Lbl.setBounds(40, 50, 350, 20);
		txt6Lbl.setBounds(40, 50, 350, 20);
		txt7Lbl.setBounds(40, 50, 350, 20);
		txt8Lbl.setBounds(40, 50, 350, 20);
		txt9Lbl.setBounds(40, 50, 350, 20);
		Tbuy1Btn.setBounds(20, 750, 200, 70);
		Tbuy2Btn.setBounds(280, 750, 200, 70);
		Tbuy3Btn.setBounds(540, 750, 200, 70);
		Pbuy1Btn.setBounds(800, 750, 200, 70);
		Pbuy2Btn.setBounds(800, 750, 200, 70);
		Pbuy3Btn.setBounds(800, 750, 200, 70);

		waku.setBounds(40, 50, 200, 70);

		/**
		 * 各部品をパネルに追加
		 */
		panel.add(titleLbl);
		panel.add(totalLbl);
		panel.add(cacheLbl);
		panel.add(cacheyenLbl);
		panel.add(yearLbl);
		panel.add(monthLbl);
		panel.add(Tbuy1Btn);
		panel.add(Tbuy2Btn);
		panel.add(Tbuy3Btn);
		panel.add(Pbuy1Btn);
		panel.add(Pbuy2Btn);
		panel.add(Pbuy3Btn);
		panel.add(txt1Lbl);
		panel.add(txt2Lbl);
		//panel.add(waku);

		/**
		 * ボタンにアクションリスナーを追加
		 */


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
