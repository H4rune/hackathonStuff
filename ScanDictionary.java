import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

//this should be a method
public class ScanDictionary {
    /*
    public static void main(String[] args){
        ArrayList<String> dictionary = new ArrayList<String>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("words");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Scanner scan = new Scanner(bufferedReader);
        
          while (scan.hasNextLine()) {
                String i = scan.nextLine();
                //System.out.println(i);
                dictionary.add(i);
            }
            scan.close();
            
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of words you want to type: ");
        int number  = input.nextInt();
        Random rand  = new Random();
        int index = rand.nextInt(77722);
        long startTime = System.nanoTime();
        String typed;
        
        for(int i = 0; i < number; i++) {
            System.out.println(dictionary.get(index));
            typed = input.next();
            if(!typed.equals(dictionary.get(index))) {
                System.out.println("You cannot type at all");
                break;
            }
            index = rand.nextInt(77722);
        }
        
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        
        System.out.println("You typed " + number + " words in " + (timeElapsed/1000000000)  + " seconds");
        input.close();
    }
    */

    
}


