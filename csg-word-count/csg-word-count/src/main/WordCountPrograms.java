package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import util.WordCountConstants;

public class WordCountPrograms {
	
	public static void main(String[] args) throws Exception {
		List<String> wordList = new ArrayList<>();
		System.out.println(countWord(wordList));
		System.out.println(countWords(wordList));
		
	}

	private static List<String> countWords(List<String> wordList) {
		List<String> wordsOfRequiredLength = new ArrayList<>();
		if(!wordList.isEmpty()) {
			wordsOfRequiredLength = wordList.stream().filter(word -> word.length() > 5).collect(Collectors.toList());
			return wordsOfRequiredLength;
		}
		return wordsOfRequiredLength;
	}

	private static int countWord(List<String> wordList) {
		if (!wordList.isEmpty()) {
			Optional<String> wordCount = wordList.stream()
					.filter(word -> word.startsWith(WordCountConstants.UPPER_CASE_LETTER)
							|| word.startsWith(WordCountConstants.LOWER_CASE_LETTER))
					.findAny();
			if (wordCount.isPresent()) {
				return Integer.parseInt(wordCount.get());
			}
		}
		return 0;
		
	}

}
