package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.GameKeyView;
import view.extensionscreen;
import view.mainView;
import view.topView;

/**
 * @author 庄島
 * @vertion 1.00(2019/01/29)
 *
 * コントローラクラス
 */
/**
 * @author s3a2
 *
 */
public class Controller implements ActionListener{


	GameKeyView 	gameKeyView;		//Road to Boss画面
	topView			topView;			//トップ画面
	mainView 		mainView;			// メイン画面
	extensionscreen  extension; 	//拡張




	/**
	 * mainメソッド
	 */
	public static void main(String[] args) {

		// コントローラクラスをインスタンス化
		Controller ctrl = new Controller();

		// システム実行
		ctrl.run();

	}

	/**
	 * コンストラクタ
	 */
	public Controller() {


		// ゲーム基幹画面クラスをインスタンス化
		gameKeyView = new GameKeyView("Road to Boss");

		// スタート画面クラスをインスタンス化
		topView = new topView(this);

		// メイン画面クラスをインスタンス化
		mainView = new mainView(this);

		extension = new extensionscreen(this);


	}
	/**
	 * システム実行
	 */
	public void run() {

		// ゲーム基幹画面を表示
		gameKeyView.setVisible(true);

		// モード選択画面を表示
		gameKeyView.setPanel(topView.getPanel());

	}

	public void start() {

		// モード選択画面を表示
		gameKeyView.setPanel(topView.getPanel());

	}


	public void setGameKeyView(GameKeyView gameKeyView){
		this.gameKeyView = gameKeyView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}


}
