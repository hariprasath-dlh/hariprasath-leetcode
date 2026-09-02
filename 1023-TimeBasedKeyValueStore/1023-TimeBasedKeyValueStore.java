// Last updated: 02/09/2026, 09:11:47
import java.util.*;

class TimeMap {
    HashMap<String, TreeMap<Integer, String>> map = new HashMap<>();
    public TimeMap() {
    }
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new TreeMap<>());
        map.get(key).put(timestamp, value);
    }
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
            return "";
        Map.Entry<Integer, String> e = map.get(key).floorEntry(timestamp);
        return e == null ? "" : e.getValue();
    }
}