// Given an array, find the integer that appears an odd number of times.

// There will always be only one integer that appears an odd number of times.


public class FindOdd {
    public static int findIt(int[] a) {
    int count = 0;
    int odd = 0;
    for(int i : a){
        for(int j : a){
            if(i == j){
                count++;
            }
        }
        if(count % 2 == 1){
            odd = i;
            break;
        }
        else{
            count = 0;
        }
    }
    return odd;
  }
}



// best solution

public class FindOdd {
  public static int findIt(int[] A) {
    int odd = 0;
    
    for (int i : A) {
      odd ^= i; // XOR operand. 1^1 = 0, 1^1^1 = 1
    }
  
    return odd;
  }
}

