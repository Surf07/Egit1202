package Lesson714;//Lesson445


import org.graalvm.compiler.phases.common.NodeCounterPhase.Stage;

import com.apple.eawt.Application;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Sample2  extends Application
{
	private Button bt;

	public static void main(String[] args)
	{
		launch(args);
	}

	public void start(Stage stage)throws Exception
	{

		bt = new Button();

		bt.setText("購入");

		BorderPane bp = new BorderPane();

		bp.setCenter(bt);

		Scene sc = new Scene(bp, 300, 200);

		stage.setScene(sc);

		stage.setTitle("サンプル");
		stage.show();
	}
}

