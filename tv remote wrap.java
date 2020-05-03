// Background

// My TV remote control has arrow buttons and an OK button.

// I can use these to move a "cursor" on a logical screen keyboard to type words...

// Keyboard

// The screen "keyboard" layout looks like this

// a b c d e 1 2 3
// f g h i j 4 5 6
// k l m n o 7 8 9
// p q r s t . @ 0
// u v w x y z _ /
// aA  SP            

// * `aA` is the SHIFT key. Pressing this key toggles alpha characters between UPPERCASE and lowercase * `SP` is the space character * The other blank keys in the bottom row have no function
// Kata task

// How many button presses on my remote are required to type the given words?

// Hint

// This Kata is an extension of the earlier ones in this series. You should complete those first.

// Notes

// The cursor always starts on the letter a (top left)
// The alpha characters are initially lowercase (as shown above)
// Remember to also press OK to "accept" each letter
// Take the shortest route from one letter to the next
// The cursor wraps, so as it moves off one edge it will reappear on the opposite edge
// Although the blank keys have no function, you may navigate through them if you want to
// Spaces may occur anywhere in the words string
// Do not press the SHIFT key until you need to. For example, with the word e.Z, the SHIFT change happens after the . is pressed (not before)
// Example

// words = Code Wars

// C => a-aA-OK-A-B-C-OK = 6
// o => C-B-A-aA-OK-u-v-w-x-y-t-o-OK = 12
// d => o-j-e-d-OK = 4
// e => d-e-OK = 2
// space => e-d-c-b-SP-OK = 5
// W => SP-aA-OK-SP-V-W-OK = 6
// a => W-V-U-aA-OK-a-OK = 6
// r => a-f-k-p-q-r-OK = 6
// s => r-s-OK = 2
// Answer = 6 + 12 + 4 + 2 + 5 + 6 + 6 + 6 + 2 = 49


public class Dinglemouse {

  public static int tvRemote(final String words) {
    // Your code here
    String currentKeys = "abcde123fghij456klmno789pqrst.@0uvwxyz_/";
    String otherKeys = "ABCDE123FGHIJ456KLMNO789PQRST.@0UVWXYZ_/";
    String hold = "";
    String[] letters = words.split("");
    int moves = 0;
    int x = 0; // x 0 - 7 %8 
    int y = 0; // y 0 - 4 /8
    int indexX = 0;
    int indexY = 0;
    
    for(String letter : letters){
      if(letter.equals(" ")){
        moves += movesCalc(x, 1, y, 5);
        x = 1;
        y = 5;
      }
      else{
        if(!currentKeys.contains(letter)){
          moves += movesCalc(x, 0, y, 5);
          x = 0;  
          y = 5;
          hold = currentKeys;
          currentKeys = otherKeys;
          otherKeys = hold;
        }
        int position = currentKeys.indexOf(letter);
        indexX = position % 8;
        indexY = position / 8;
        moves += movesCalc(x, indexX, y, indexY);
        x = indexX;
        y = indexY;
      }
    }
    return moves;
  }  
  
  private static int wrapArround(int i, String j){
    if(j.equals("x")){
      if(i <= 4){
        return i;
      }
      else{
        return 8-i;
      }
    }
    else if(j.equals("y")){
      if(i <= 3){
        return i;
      }
      else{
        return 6-i;
      }
    }
    else{throw new IndexOutOfBoundsException();}
  }
  
  private static int movesCalc(int a, int b, int c, int d){
    int x = wrapArround(Math.abs(a - b), "x");
    int y = wrapArround(Math.abs(c - d), "y");
    return (x + y + 1); // for the key press
  }
}