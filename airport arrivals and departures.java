// How it works

// You notice that each flap character is on some kind of a rotor and the order of characters on each rotor is:

// ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789

// And after a long while you deduce that the display works like this:

// Starting from the left, all rotors (from the current one to the end of the line) flap together until the left-most rotor character is correct.
// Then the mechanism advances by 1 rotor to the right...
// ...REPEAT this rotor procedure until the whole line is updated
// ...REPEAT this line procedure from top to bottom until the whole display is updated
// Example

// Consider a flap display with 3 rotors and one 1 line which currently spells CAT

// Step 1  (current rotor is 1)
// Flap x 1
// Now line says DBU
// Step 2  (current rotor is 2)
// Flap x 13
// Now line says DO)
// Step 3  (current rotor is 3)
// Flap x 27
// Now line says DOG
// This can be represented as

// lines  // array of strings. Each string is a display line of the initial configuration
// rotors // array of array-of-rotor-values. Each array-of-rotor-values is applied to the corresponding display line
// result // array of strings. Each string is a display line of the final configuration
// e.g.

// lines = ["CAT"]
// rotors = [[1,13,27]]
// result = ["DOG"]
// Kata Task

// Given the initial display lines and the rotor moves for each line, determine what the board will say after it has been fully updated.

// For your convenience the characters of each rotor are in the pre-loaded constant ALPHABET which is a string.

// And don't forget to try my other flap display Katas!

// :-)

class Dinglemouse {
  
  private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";
  
  public static String[] flapDisplay(final String[] lines, final int[][] rotors) {
    // Your code here
    int rotor = 0;
    int index = 0;
    String line = "";
    String[] newLines = new String[lines.length];
    
    for (int i = 0; i < lines.length; i++) {
      rotor = 0;
      line = "";
      for (int j = 0; j < lines[i].length(); j++) {
        index = ALPHABET.indexOf(lines[i].charAt(j)) + (rotor += rotors[i][j]);
        line += ALPHABET.charAt(index % ALPHABET.length());
      }
      newLines[i] = line;
    }
    return newLines;
  }
} 

















