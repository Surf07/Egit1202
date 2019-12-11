package Lesson715;




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Sample3 extends Application
{
	private Label lb;
	private Button bt;

	public static void main(String[]args)
	{
		launch(args);
	}
	public void start(Stage stage)throws Exception
	{
		lb = new Label("いらっしゃいませ");
		bt = new Button("購入");

		BorderPane bp = new BorderPane();

		bp.setTop(lb);
		bp.setCenter(bt);

		Scene sc = new Scene(bp,300,200);

		stage.setScene(sc);

		stage.setTitle("サンプル");
		stage.show();
	}

}