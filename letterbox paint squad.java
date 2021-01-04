// Kata Task

// Given the start and end letterbox numbers, write a method to return the frequency of all 10 digits painted.

// Example

// For start = 125, and end = 132

// The letterboxes are

// 125 = 1, 2, 5
// 126 = 1, 2, 6
// 127 = 1, 2, 7
// 128 = 1, 2, 8
// 129 = 1, 2, 9
// 130 = 1, 3, 0
// 131 = 1, 3, 1
// 132 = 1, 3, 2
// The digit frequencies are 1 x 0, 9 x 1, 6 x 2 etc...

// and so the method would return [1,9,6,3,0,1,1,1,1,1]

// Notes

// 0 < start <= end


public class Kata {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String speedify(final String input) {
        char[] finalWord = new char[125];
        for (int i=0; i<125; i++){
            finalWord[i] = ' ';
        }
        int i = 0;
        for (char ch: input.toCharArray()) {
            int n = ALPHABET.indexOf(ch);
            finalWord[n+i] = ch;
            i++;
        }

        return String.valueOf(finalWord).replaceAll("\\s+$", ""); // your code here
    }
}