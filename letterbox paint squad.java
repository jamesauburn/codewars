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

public class Dinglemouse {

    public static int[] paintLetterboxes(final int start, final int end) {
    // Your code here

        int[] values = new int[10];
        for (int i = start; i <= end; i++){
            int n = i;
            while (n > 0){
                values[n%10] += 1;
                n /= 10;
            }
        }
        return values;
    }
}