import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PrimaryStage extends Application {
    private gameState gameState;
    private Scene welcomeScene, gameScene;
    private VBox welcomeScreen;
    private GameScreen gameScreen;
    private Image title;
    private ImageView titleView;
    private Button playButton;
    
    public void start(Stage primaryStage) throws Exception {
        welcomeScreen = new VBox(20);
        gameScreen = new GameScreen();
        title = new Image("file:Title.png");
        titleView = new ImageView();
        titleView.setImage(title);
        
        playButton = new Button("     Play     ");
        playButton.setPadding(new Insets(20));
        playButton.setFont(new Font("Verdana", 20));
        playButton.setOnAction(e -> {
            gameState = new gameState(5, gameScreen);
            primaryStage.setScene(gameScene);
            primaryStage.setFullScreen(true);
        });
        
        welcomeScreen.setAlignment(Pos.CENTER);
        welcomeScreen.setBackground(new Background(new BackgroundImage(new Image("file:Space.jpg"), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
        welcomeScreen.getChildren().addAll(titleView, playButton);
        
        welcomeScene = new Scene(welcomeScreen, 1000, 750);
        gameScene = new Scene(gameScreen, 1000, 750);
        
        primaryStage.setTitle("TypeHacks");
        primaryStage.setScene(welcomeScene);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}


