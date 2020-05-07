import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dinglemouse {

  public static int countDeafRats(final String town) {
    //Your code here
    
    int deaf = 0;
     // String to be scanned to find the pattern.
    String patternLeft = "(O~)*[P]";
    String patternRight = "[P](~O)*";

    // Create a Pattern object
    Pattern right = Pattern.compile(patternLeft);
    Pattern left = Pattern.compile(patternRight);

    // Now create matcher object.
    Matcher mRight = right.matcher(town);
    Matcher mLeft = left.matcher(town);
    
    if(mRight.find()){
      deaf++;
    }
    if(mLeft.find()){
      deaf++;
    }
    return deaf;
  }
}



