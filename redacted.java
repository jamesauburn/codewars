//Meanwhile... somewhere in a Pentagon basement
//
//Your job is to compare two confidential documents that have come into your possession.
//
//The first document has parts redacted, and the other one doesn't.
//
//
//But the original (unredacted) document might be a fake!
//
//You need to compare the two documents and decide if it is possible they are the same or not.
//
//Kata Task
//
//Return true if the two documents are possibly the same. Return false otherwise.
//
//Notes
//
//Each document is made of any visible characters, spaces, punctuation, and newlines \n
//Any character might be redacted (except \n)
//The redaction character is X
//The redacted document is always the first one

public class Dinglemouse {

	public static boolean redacted(String doc1, String doc2) {
		// Your code here

		if(doc1.length() != doc2.length()){
			return false;
		}
		for(int i = 0; i < doc1.length(); i++){
			if(doc1.charAt(i) != doc2.charAt(i)){
				if(doc1.charAt(i) != 'X'){
					return false;
				}
			}
			if(doc1.charAt(i) == 'X' && doc2.charAt(i) == '\n'){
				return false;
			}
		}

		return true;
	}
}

