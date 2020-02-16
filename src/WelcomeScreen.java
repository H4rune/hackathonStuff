package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WelcomeScreen extends Application {
	public void start(Stage primaryStage) throws Exception {
		GameScreen root = new GameScreen();

		primaryStage.setTitle("Game");
		primaryStage.setScene(new Scene(root, 1000, 650));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}


