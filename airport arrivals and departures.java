class Dinglemouse {
  
  private static final String ALPHABET = Preloaded.ALPHABET;
  
  public static String[] flapDisplay(final String[] lines, final int[][] rotors) {
    // Your code here
    int i = rotors[0].length;
  	int[] newRotors = new int[i];

  	String[] lineSplit = lines[0].split("");
  	String[] results = new String[lines.length];
    
    int count1 = 0;
    int hold = 0;

  	for(int rot : rotors[0]){
  		newRotors[count1] = rot + hold;
  		hold += rot;
      	count1++;
  	}

  	int count = 0;
  	int indexx = 0;

  	for(String s : lineSplit){
  		indexx = (newRotors[count] + ALPHABET.indexOf(s)) % 34)
  		results[count] = (ALPHABET.charAt(indexx);
      	count++;
  	}
    
  	
    return new String[0];
  }
  
} 


