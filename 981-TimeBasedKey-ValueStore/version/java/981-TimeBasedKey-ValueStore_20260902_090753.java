// Last updated: 02/09/2026, 09:07:53
1import java.util.*;
2
3class TimeMap {
4    HashMap<String, TreeMap<Integer, String>> map = new HashMap<>();
5    public TimeMap() {
6    }
7    public void set(String key, String value, int timestamp) {
8        map.putIfAbsent(key, new TreeMap<>());
9        map.get(key).put(timestamp, value);
10    }
11    public String get(String key, int timestamp) {
12        if(!map.containsKey(key))
13            return "";
14        Map.Entry<Integer, String> e = map.get(key).floorEntry(timestamp);
15        return e == null ? "" : e.getValue();
16    }
17}