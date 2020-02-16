import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;     
import javax.swing.JFrame;
import javax.swing.Timer;

public class gameState implements ActionListener {
    ArrayList<String> words = new ArrayList<String>();
    ArrayList<Integer> distance = new ArrayList<Integer>();
    ArrayList<String> dictionary = new ArrayList<String>();
    ArrayList<Integer> xCordList= new ArrayList<Integer>();

    private int health = 10;
    private int num = 0;
    private int difficulty;
    private Timer t = new Timer(10, this);
    JFrame frame = new JFrame();
    GameScreen a;


    gameState(int difficulty, GameScreen screen){
        frame.setVisible(true);
        this.difficulty = difficulty;
        t.start();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("words.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        a = screen;

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Scanner scan = new Scanner(bufferedReader);

        while (scan.hasNextLine()) {
            String i = scan.nextLine();
            //System.out.println(i);
            dictionary.add(i);
        }
        scan.close();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0;i<distance.size();i++) {
            distance.set(i, distance.get(i)-difficulty);
            if(distance.get(i)==0) {
                health--;
                distance.remove(i);
                i--;
            }
        }
        num++;
        if(num ==50) {
            num = 0;
            Random rand  = new Random();
            int index = rand.nextInt(77722);
            words.add(dictionary.get(index));
            distance.add(Integer.valueOf(100));
            xCordList.add((int)(Math.random()*750));
        }
//        if(health == 0) {
//            t.stop();
//        }
        a.setHealth(health);
        a.setWordArrayList(returnWordItem());
        a.update();
    }
    public ArrayList<Integer> returnDistance(){
        return distance;
    }
    public ArrayList<String> returnWords(){
        return words;
    }
    public int returnHealth() {
        return health;
    }
    public ArrayList<WordItem> returnWordItem() {
        ArrayList<WordItem> returnList = new ArrayList<WordItem>();
        for(int i = 0;i<distance.size();i++) {
            returnList.add(new WordItem(distance.get(i),words.get(i),(int)xCordList.get(i)));
        }
        return returnList;
    }
    public boolean typedWord(String word) {
        for(int i = 0;i>words.size();i++) {
            if(word.equals(words.get(i))) {
                words.remove(i);
                i--;
                return true;
            }            
        }
        return false;
    }
}


