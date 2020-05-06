// Part #2

// Now in this current Kata your task is the opposite.

// It's the same board with the same rules...

// But this time you are required to return the set of rotor moves needed to transform the display from the before to the after state.

// Look at the example tests for guidance.

// And good luck!

// :-)


public class Dinglemouse {

	private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";

	public static int[][] flapRotors(final String[] linesBefore, final String[] linesAfter) {
		// your code here 

		int[][] rotors = new int[linesBefore.length][linesBefore[0].length()];
		int indexB = 0;
		int indexA = 0;
		int rotor = 0;
    
    	for (int i = 0; i < linesBefore.length; i++) {
     		rotor = ALPHABET.length(); // not set to zero to account for indexB + rotor being over ALPHABET.length() after first instance.
    	  	for (int j = 0; j < linesBefore[i].length(); j++) {
    	  		indexB = (ALPHABET.indexOf(linesBefore[i].charAt(j)) + rotor) % ALPHABET.length();
    	  		indexA = ALPHABET.indexOf(linesAfter[i].charAt(j));
           		rotors[i][j] = (indexA - indexB + ALPHABET.length()) % ALPHABET.length();
           		rotor += rotors[i][j];
    	  	}
    	}
		return rotors;
	}
}




