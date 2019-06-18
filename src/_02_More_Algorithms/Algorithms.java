package _02_More_Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}

		return 0;
	}

//---//
	public static Object countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearls++;
			}
		}
		return pearls;
	}
//--//

	public static double findTallest(List<Double> peeps) {
		double biggestValue = 0.0;
		// TODO Auto-generated method stub
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) >= biggestValue) {
				biggestValue = peeps.get(i);
			}
		}
		return biggestValue;
	}
//--//

	public static String findLongestWord(List<String> words) {
		String longestWord = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}
//--//

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		String morseCode = " ... --- ... ";
		// TODO Auto-generated method stub
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).equals(morseCode)) {
				return true;
			}

		}

		return false;
	}
//--//

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		
		Collections.sort(results);		
		
		return results;
	}

//--//

	public static List<String> sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		
		Collections.sort(unsortedSequences);
		
		return unsortedSequences;
	}
//--//

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		
		Collections.sort(words);
		
		return words;
	}
}
