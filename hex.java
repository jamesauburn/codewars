public class Hex{

  private int x;

  public Hex(int value){
    this.x = value;
  }
  
  public int valueOf(){
    return x;
  }
  
  public String toJSON(){
    return "0x" + String.format("%X", x);
   }
  
  public String toString(){
    return "0x" + String.format("%X", x);
  }
  
  public Hex plus(Hex other){
    return new Hex(x + other.valueOf());
    
  }
  
  public Hex minus(Hex other){
    return new Hex(x +-other.valueOf());
  }
  
  public Hex plus(int number){
    return new Hex(x + number);
  }
  
  public Hex minus(int number ){
    return new Hex(x - number);
  }
  
  public static int parse(String string){
    return Integer.valueOf(string, 16).intValue();
  }
  
  // public boolean equals(Object other){
  //   return x == other.x;
  // }
}


