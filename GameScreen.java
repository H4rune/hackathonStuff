import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;


public class GameScreen extends VBox {
    private TextField typeField;
    private ArrayList<WordItem> wordItem;
    private int health;
    private Pane gamePane;
    private ArrayList<ImageView> meteor;
    ArrayList<int[]> pointList = new ArrayList<int[]>();
    
    public GameScreen() {
        typeField = new TextField();
        typeField.setFont(new Font("Verdana", 30));
        typeField.setAlignment(Pos.CENTER);
        typeField.setOnAction(e -> {
            typeField.clear();
            //Check if word matches
        });
        
        gamePane = new Pane();
        meteor = new ArrayList<>();
        for (int i=0; i<100; i++) {
            meteor.add(new ImageView(new Image("file:kirbs.png")));
            gamePane.getChildren().add(meteor.get(i));
        }
        
        setBackground(new Background(new BackgroundImage(new Image("file:Space.jpg"), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
        setAlignment(Pos.BOTTOM_CENTER);
        getChildren().addAll(gamePane, typeField);
    }
    
    public void addMeteor(int x, int y, int index) {
        meteor.get(index).setX(x);
        meteor.get(index).setY(y);
    }

        public void setHealth(int givenHealth) {
            health = givenHealth;
        }
        public void setWordArrayList(ArrayList<WordItem> word) {
            wordItem  = word;
        }
        
        
        public void update() {
            //will be called by GameState
            
            //needs to update locations of Meteors in screen
            //Includes moving meteors and removing finished meteors
            for(WordItem word:wordItem) {
                int dist = word.getDist();
                int xCord = word.getX();
                int index = wordItem.indexOf(word);
                
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int totalHeight = (int) screenSize.getHeight();
                
                int[] thingy = {xCord,(dist*totalHeight)/100};
                pointList.add(thingy);
            }
            
            
            for(int[] thins:pointList) {
                Circle circle = new Circle(thins[0], thins[1], 10);    
            }
            //System.out.println("should work");
            
            int i=0;
            for(int[] things:pointList) {
                addMeteor(things[0], things[1], i);
                i++;
            }
        }
        //gethealth
        //getWord
        //getDistance
    }