package gui;

import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class GameScreen extends BorderPane {
	private VBox infoArea;
	private HBox buttonArea;
	private Text title;
	
	public GameScreen() {
		infoArea = new VBox(10);
		
		title = new Text("Game");
		title.setFont(new Font("Verdana", 14));
		
		buttonArea = new HBox(10);
		
		getChildren().addAll(infoArea, buttonArea);
	}
}