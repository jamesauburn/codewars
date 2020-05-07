public class Dinglemouse {

  public static int countDeafRats(final String town) {
    // Your code here
    int rats = 0;
    boolean piedFound = false;
    System.out.println(town);
    String[] LR = town.replace(" ", "").split("P");
    
    System.out.println(LR[0] + "PPP" + LR[1]);
    
    if(LR[0].length() < 2){
      continue;
    }
    else{
      for(int i = 0; i < LR[0].length()-3; i+=2){
          if(LR[0].charAt(i) == 'O' && LR[0].charAt(i+1) == '~'){
            rats++;
          }
        }
      }
      
    if(LR[1].length() < 2 0){
      continue;
    }
    else{
      for(int i = 0; i < LR[1].length()-3; i+=2){
          if(LR[1].charAt(i) == '~' && LR[1].charAt(i+1) == 'O'){
            rats++;
          }
        }
      }
    return rats;
  }

}