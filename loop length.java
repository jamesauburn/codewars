public class LoopInspector {

  public int loopSize(Node node) {
    Node a = node;
    Node b = node.getNext();
 
    while (a != b)
    {
      a = a.getNext();
      b = b.getNext().getNext();
    }
  
    int len = 0;
    
    do {
      b = b.getNext();
      len++;
    } while (a != b);
 
   return len;
  }
}
