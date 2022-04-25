package com.techelevator;

import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchDomainException;
import com.techelevator.search.SearchEngine;
import com.techelevator.util.TELog;

import java.util.List;

public class Application {

	public static void main(String[] args) {

		try {

			// Step Two: Create TELog, and log the start of the application.
			//
			//TELog logger = new TELog();
			TELog.log("Search application started");

//			SearchDomain data = new SearchDomain("folder");
//			TELog.log(data.toString());

			// Step Four: Instantiate a Search Domain
			//
			//SearchDomain searchDomain = new SearchDomain("data");
			SearchDomain searchDomain = new SearchDomain("exercise/data");
			TELog.log("Indexed files:\n" + searchDomain.toString());


			// Step Six: Single word search
			//
			SearchEngine searchEngine = new SearchEngine(searchDomain);
			searchEngine.indexFiles();
			List<String> resultOfSearchOneWord = searchEngine.search("squirrel");
			if (resultOfSearchOneWord.size() > 0) {
				for (String word : resultOfSearchOneWord) {
					System.out.println(word);
				}
			}
			else {
				System.out.println("Search term does not appear in the index(Single Word).");
			}


			// Step Seven: Multiple word search
			//
			List<String> resultOfMultipleWords = searchEngine.search("telephone line");
			if (resultOfMultipleWords.size() > 0) {
				for (String word : resultOfMultipleWords) {
					System.out.println(word);
				}
			} else{System.out.println("Search term does not appear in the index(MultiLw Words.)");
			}
		} catch (SearchDomainException e){
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
