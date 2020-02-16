package hackathonProject;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

//this should be a method
public class ScanDictionary {
	
	public ArrayList<String> getDictionary(){
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
			return dictionary;
	}
	
}
