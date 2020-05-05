// Write a function, persistence, that takes in a positive parameter 
// num and returns its multiplicative persistence, which is the number of 
// times you must multiply the digits in num until you reach a single digit.


class Persist {
  public static int persistence(long n) {
    // your code
    long i = n;
    long j = 1;

    if ((i / 10) == 0){return 0;}
    
    for(i = n; i != 0; i /= 10){
      j = j * (i % 10);
    }
    return persistence(j) + 1;
  }
}