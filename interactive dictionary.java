import java.util.Map;
import java.util.HashMap;

public class Dictionary {
    
    private Map<String, String> map;
    
    public Dictionary(){
        // your code  
        map = new HashMap<String, String>();
    }

    public void newEntry(String key, String value){
        // your code
        map.put(key, value);
    }

    public String look(String key){
        // your code
        return map.containsKey(key) ? map.get(key) : "Cant find entry for " + key;
    }
}