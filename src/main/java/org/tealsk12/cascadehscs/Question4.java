package org.tealsk12.cascadehscs;

public class Question4 {
	public static void printShortWordsSplit(final String phrase, final int maxLength) {
		String[] words = phrase.split(" "); // split into words
		for(final String word : words) {
			final String trimmedWord = word.trim(); // trim extra spaces 
			if(trimmedWord.length() <= maxLength){ 
				System.out.println(trimmedWord); //print if longer than cutoff
			}
		}
	}

	public static void printShortWordsRecursive(final String phrase, final int maxLength) {
		if(phrase.length() < maxLength || phrase.indexOf(" ") < 0) {
			return; //base case
		}
		final int firstSpaceIndex = phrase.indexOf(" "); 
		if(firstSpaceIndex <= maxLength) { // works because index vs length
			System.out.println(phrase.substring(0, firstSpaceIndex)); // print if longer than maxlength
		}
		printShortWordsRecursive(phrase.substring(firstSpaceIndex + 1), maxLength); // recur with remainder of phrase (minus leading space)
	}

	public static void printShortWordsIterative(String phrase, int maxLength) {
		if(phrase.length() < maxLength || phrase.indexOf(" ") < 0) {
			return; // early return for short inputs
		}
		String word = phrase.substring(0, phrase.indexOf(" "));
		String restOfPhrase = phrase.substring(phrase.indexOf(" ") + 1);
		while(word.length() > 0 && restOfPhrase.indexOf(" ") >= 0) {
			if(word.length() <= maxLength) {
				System.out.println(word);
			}
			word = restOfPhrase.substring(0, restOfPhrase.indexOf(" "));
			restOfPhrase = restOfPhrase.substring(restOfPhrase.indexOf(" ") + 1);
		}
		if(word.length() <= maxLength) {
			System.out.println(word);
		}
	}
}