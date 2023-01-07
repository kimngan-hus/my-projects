package oop.collections.exercises;
import java.awt.image.ImageProducer;
import java.util.*;
public class Maps {
    public static int count(Map<Integer,Integer> map){
        return map.size();
    }
    public static void empty(Map<Integer,Integer> map){
        map.clear();
        System.out.println(map);
    }
    public static boolean contains(Map<Integer,Integer> map, int key){
        return map.containsKey(key);
    }
    public static boolean containsKeyValue(Map<Integer,Integer> map, int key, int value){
        return map!=null && map.get(key)!=null && Objects.equals(map.get(key),value);
    }
    public static Set<Integer> keySet(Map<Integer,Integer> map){
        return map.keySet();
    }
    public static Collection<Integer> values(Map<Integer,Integer> map){
        return map.values();
    }
    public static String getColor(int values){
        Map<String,Integer> color = new HashMap<>();
        color.put("black",0);
        color.put("white",1);
        color.put("red",2);
        for (Map.Entry<String, Integer> entry : color.entrySet()) {
            if (Objects.equals(values, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
