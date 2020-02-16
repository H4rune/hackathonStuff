public class WordItem {
    private int [] position = {0,0};
    private String word;
    private int dist = 100;
    private int xCord;
    WordItem(int[] pos, String givenWord){
        position[0] = pos[0];
        position[1] = pos[1];
        word = givenWord;
    }
    WordItem(Integer distance, String givenWord,int x){
        dist = distance;
        word = givenWord;
        xCord = x;
    }
    public int getDist() {
        return dist;
    }
    public int getX() {
        return xCord;
    }
    
    public String getWord() {
        return word;
    }
    public int[] getPos() {
        return position;
    }
    public void setPos(int[] pos) {
        position[0] = pos[0];
        position[1] = pos[1];
    }

}