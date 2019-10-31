package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.GameKeyView;
<<<<<<< HEAD
import view.appearanceView;
=======
import view.employmentscreen;
>>>>>>> branch 'youki' of https://github.com/shojimak/Road-to-Boss.git
import view.extensionscreen;
import view.mainView;
import view.raisescreen;
import view.requestList;
import view.topView;

<<<<<<< HEAD
//勝本
public class Controller implements ActionListener {
=======

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
>>>>>>> branch 'youki' of https://github.com/shojimak/Road-to-Boss.git

<<<<<<< HEAD
	GameKeyView gameKeyView; //Road to Boss画面
	topView topView; //トップ画面
	mainView mainView; // メイン画面
	extensionscreen extension; //拡張
	appearanceView appearanceView; //会社増築
=======

	GameKeyView 	gameKeyView;		//Road to Boss画面
	topView			topView;			//トップ画面
	mainView 		mainView;			// メイン画面
	extensionscreen  extension; 	//拡張
	employmentscreen employmentscreen; //人材雇用画面
	raisescreen raisescreen;	//育成画面
	requestList requestList;	//開発依頼画面



>>>>>>> branch 'youki' of https://github.com/shojimak/Road-to-Boss.git

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

		//
		extension = new extensionscreen(this);

<<<<<<< HEAD
=======
		// 人材雇用画面
		employmentscreen = new employmentscreen(this);

		// 育成画面
		raisescreen = new raisescreen(this);

		// 開発依頼画面
		requestList = new requestList(this);


>>>>>>> branch 'youki' of https://github.com/shojimak/Road-to-Boss.git
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

	public void setGameKeyView(GameKeyView gameKeyView) {
		this.gameKeyView = gameKeyView;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// アクションコマンドを取得
		String cmd = event.getActionCommand();

<<<<<<< HEAD
		//　スタートボタン
		if (cmd.equals("START_BTN")) {
=======
		// メイン画面へ
		if(cmd.equals("START_BTN")) {

>>>>>>> branch 'youki' of https://github.com/shojimak/Road-to-Boss.git
			// 現在表示されている画面を削除
			gameKeyView.deletePanel();

			gameKeyView.setPanel(mainView.getPanel());





		// メイン画面で人材雇用ボタンを押された場合
		}else if(cmd.equals("EMPLOYMENT_SCREEN")) {

			// 現在表示されている画面を削除
			gameKeyView.deletePanel();
			// 人材雇用画面表示
			gameKeyView.setPanel(employmentscreen.getPanel());




		// 人材雇用画面で戻るボタンを押された場合
		}else if(cmd.equals("BACK_BTN")) {

			// 現在表示されている画面を削除
			gameKeyView.deletePanel();
			// 人材雇用画面表示
			gameKeyView.setPanel(mainView.getPanel());




		// メイン画面で育成ボタンが押された場合
		}else if(cmd.equals("RAISE_SCREEN")) {
			// 現在表示されている画面を削除
			gameKeyView.deletePanel();

			gameKeyView.setPanel(raisescreen.getPanel());



		// メイン画面で開発依頼ボタンが押された場合
		}else if(cmd.equals("REQUEST_LIST")) {
			// 現在表示されている画面を削除
			gameKeyView.deletePanel();
			// 開発来画面表示
			gameKeyView.setPanel(requestList.getPanel());


		// 開発依頼画面で戻るボタンが押された場合
		}else if(cmd.equals("REQUEST_BACK_BTN")) {
				// 現在表示されている画面を削除
				gameKeyView.deletePanel();

				gameKeyView.setPanel(mainView.getPanel());


		// メイン画面で増築ボタンが押された場合
		}else if(cmd.equals("EXTENSION_SCREEN")) {
			// 現在表示されている画面を削除
			gameKeyView.deletePanel();

			gameKeyView.setPanel(extension.getPanel());
		}

	}

}
