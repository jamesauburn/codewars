// You will be given two dimensions

// a positive integer lng (parameter named lng)
// a positive integer wdth (parameter named wdth)
// You will return an array or a string (depending 
// on the language; Shell bash, PowerShell and Fortran return a string) with the size of each of the squares.

//   sqInRect(5, 3) should return [3, 2, 1, 1]
//   sqInRect(3, 5) should return [3, 2, 1, 1]
//   or (Haskell)
//   squaresInRect  5  3 `shouldBe` Just [3,2,1,1]
//   squaresInRect  3  5 `shouldBe` Just [3,2,1,1]
//   or (Fsharp)
//   squaresInRect  5  3 should return Some [3,2,1,1]
//   squaresInRect  3  5 should return Some [3,2,1,1]
//   or (Swift)
//   squaresInRect  5  3 should return [3,2,1,1] as optional
//   squaresInRect  3  5 should return [3,2,1,1] as optional
//   or (Cpp)
//   sqInRect(5, 3) should return {3, 2, 1, 1}
//   sqInRect(3, 5) should return {3, 2, 1, 1}
//   (C)
//   C returns a structure, see the "Solution" and "Examples" tabs.
//   Your result and the reference test solution are compared by strings.

// Notes:

// lng == wdth as a starting case would be an entirely different problem and the drawing is planned to be interpreted with lng != wdth. (See kata, Square into Squares. Protect trees! http://www.codewars.com/kata/54eb33e5bc1a25440d000891 for this problem).
// When the initial parameters are so that lng == wdth, the solution [lng] would be the most obvious but not in the spirit of this kata so, in that case, return None/nil/null/Nothing
// return {} with C++, Array() with Scala.
// In that case the returned structure of C will have its sz component equal to 0.
// Return the string "nil" with Bash, PowerShell and Fortran.
// You can see more examples in "RUN SAMPLE TESTS".

import java.util.List;
import java.util.ArrayList;

public class SqInRect {
  
	public static List<Integer> sqInRect(int lng, int wdth) {
		// your code
    List<Integer> sizes = new ArrayList<>();

    if(lng > wdth){
    	sizes.add(wdth);
      List<Integer> sizes1 = sqInRect((lng - wdth), wdth);
        for(int i : sizes1){
          sizes.add(i);
        }
    }
    else if(lng < wdth){
    	sizes.add(lng);
      List<Integer> sizes2 = sqInRect(lng, (wdth - lng));
        for(int i : sizes2){
          sizes.add(i);
        }
    }
    else{//(lng == wdth){
      sizes.add(lng);
    }
    return sizes;
	}
}











