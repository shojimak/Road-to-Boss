package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.GameKeyView;
import view.appearanceView;
import view.employmentscreen;
import view.extensionscreen;
import view.mainView;
import view.memberlist;
import view.nameselect;
import view.raisescreen;
import view.requestDetails;
import view.requestList;
import view.topView;




public class Controller implements ActionListener{


	GameKeyView 	gameKeyView;		//Road to Boss画面
	topView			topView;			//トップ画面
	mainView 		mainView;			// メイン画面
	extensionscreen  extension; 	//拡張
	employmentscreen employmentscreen; //人材雇用画面
	raisescreen raisescreen;	//育成画面
	requestList requestList;	//開発依頼画面
	requestDetails requestdetails; //開発詳細画面
	appearanceView appearanceView; //外見View画面
	memberlist memberlist;
	nameselect nameselect;




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

		//名前決定画面クラスをインスタンス化
		nameselect = new nameselect(this);

		// メイン画面クラスをインスタンス化
		mainView = new mainView(this);

		//
		extension = new extensionscreen(this);

		// 人材雇用画面
		employmentscreen = new employmentscreen(this);
		memberlist = new memberlist(this);

		// 育成画面
		raisescreen = new raisescreen(this);

		// 開発依頼画面
		requestList = new requestList(this);

		// 依頼詳細画面
		requestdetails = new requestDetails(this);

		// 外見View画面
		appearanceView = new appearanceView(this);


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
	public void actionPerformed(ActionEvent event) {
		// アクションコマンドを取得
		String cmd = event.getActionCommand();

		// 名前設定画面へ
		if(cmd.equals("START_BTN")) {

			// 現在表示されている画面を削除
			gameKeyView.deletePanel();

			gameKeyView.setPanel(nameselect.getPanel());


		// 名前設定画面で決定ボタンを押された場合
		}else if(cmd.equals("MAINVIEW")) {

			// 現在表示されている画面を削除
			gameKeyView.deletePanel();
			// 人材雇用画面表示
			gameKeyView.setPanel(mainView.getPanel());

		// 名前設定画面で戻るボタンを押された場合
		}else if(cmd.equals("NAMESELECT_BACK")) {

			// 現在表示されている画面を削除
			gameKeyView.deletePanel();
			// トップ画面表示
			gameKeyView.setPanel(topView.getPanel());

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

		//人材雇用画面で社員一覧ボタンが押された場合
		}else if(cmd.equals("MEMBER_LIST")) {

			// 現在表示されている画面を削除
			gameKeyView.deletePanel();
			// 社員一覧画面表示
			gameKeyView.setPanel(memberlist.getPanel());

		//社員一覧画面で戻るボタンが押された場合
		}else if(cmd.equals("MEMBER_LIST_BACK")) {

			// 現在表示されている画面を削除
			gameKeyView.deletePanel();
			// 社員一覧画面表示
			gameKeyView.setPanel(employmentscreen.getPanel());

		// メイン画面で育成ボタンが押された場合
		}else if(cmd.equals("RAISE_SCREEN")) {
			// 現在表示されている画面を削除
			gameKeyView.deletePanel();

			gameKeyView.setPanel(raisescreen.getPanel());

		// 育成画面で戻るボタンが押された場合
		}else if(cmd.equals("RAISE_SCREEN_BACK")) {
			// 現在表示されている画面を削除
			gameKeyView.deletePanel();

			gameKeyView.setPanel(mainView.getPanel());


		// メイン画面で開発依頼ボタンが押された場合
		}else if(cmd.equals("REQUEST_LIST")) {
			// 現在表示されている画面を削除
			gameKeyView.deletePanel();
			// 開発来画面表示
			gameKeyView.setPanel(requestList.getPanel());


		// 開発依頼画面で決定ボタンが押された場合
		}else if(cmd.equals("KETTEI_BTN")) {
			// 現在表示されている画面を削除
			gameKeyView.deletePanel();
			// 開発来画面表示
			gameKeyView.setPanel(requestdetails.getPanel());


		// 開発依頼画面で戻るボタンが押された場合
		}else if(cmd.equals("REQUESTLIST_BACK")) {
			// 現在表示されている画面を削除
			gameKeyView.deletePanel();
			// 開発来画面表示
			gameKeyView.setPanel(requestdetails.getPanel());


		// 依頼詳細画面で戻るボタンが押された場合
		}else if(cmd.equals("DETAILS_BACK")) {
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


		// 増築画面で増築ボタンが押された場合
		}else if(cmd.equals("UPGRADE_BTN")) {
			// 現在表示されている画面を削除
			gameKeyView.deletePanel();

			gameKeyView.setPanel(appearanceView.getPanel());



		// 増築画面で戻るボタンが押された場合
		}else if(cmd.equals("EXTENSION_BACK_BTN")) {
			// 現在表示されている画面を削除
			gameKeyView.deletePanel();

			gameKeyView.setPanel(mainView.getPanel());
		// メイン画面で戻るボタンが押された場合
		}else if(cmd.equals("MAINVIEW_BACK")) {
			// 現在表示されている画面を削除
			gameKeyView.deletePanel();

			gameKeyView.setPanel(topView.getPanel());
		}


	}


}
