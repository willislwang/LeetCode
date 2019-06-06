class TimeMap {
    public HashMap<String, HashMap<Integer, String>> map;
    /** Initialize your data structure here. */
    public TimeMap() {
        map = new HashMap<String, HashMap<Integer, String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key)) {
            HashMap<Integer, String> innerMap = map.get(key);
            innerMap.put(timestamp, value);
        } else {
            HashMap<Integer, String> innerMap = new HashMap<Integer, String>();
            innerMap.put(timestamp, value);
            map.put(key, innerMap);
        }
                 
    }
    
    public String get(String key, int timestamp) {
        if (map.containsKey(key)) {
            HashMap<Integer, String> innerMap = map.get(key);
            int largestTime = -1;
            for (int time : innerMap.keySet()) {
                if (time <= timestamp && time > largestTime) {
                    largestTime = time;
                } 
            } 
            if (largestTime == -1) {
                return "";
            } else {
                return innerMap.get(largestTime);
            }
        } else {
            return "";
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
