package SearchingAndSortingAlgorithms;

import java.util.Comparator;
import java.util.List;

public class Algorithms implements Comparator<String> {
	public static int findBrokenEgg(List<String> eggs) {
		int index = 0;
		for (String s : eggs) {
			if (s.equals("cracked")) {
				index = eggs.indexOf(s);
				break;
			}
		}

		return index; // <- this needs changing
	}

	// Add other methods here

	public static int countPearls(List<Boolean> oysters) {
		int amt = 0;
		for (boolean b : oysters) {
			if (b) {
				amt++;
			}
		}
		return amt;
	}

	public static double findTallest(List<Double> people) {
		double height = 0;
		for (double d : people) {
			if (d > height) {
				height = d;
			}
		}
		return height;
	}

	public static String findLongestWord(List<String> words) {
		String thing = "";
		for (String s : words) {
			if (s.length() > thing.length()) {
				thing = s;
			}
		}
		return thing;
	}

	public static boolean containsSOS(List<String> message) {
		for (String s : message) {
			if (s.contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> scores) {
		scores.sort(null);
		return scores;
	}

	public static List<String> sortDNA(List<String> dna) {
		dna.sort(new Algorithms());
		return dna;
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length() - o2.length();
	}

	public static List<String> sortWords(List<String> words) {
		words.sort(null);
		return words;
	}
}