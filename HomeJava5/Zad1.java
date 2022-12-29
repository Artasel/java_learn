package HomeJava5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Учитывая два массива строк words1и words2, возвращает количество строк, которые появляются ровно один раз в каждом из 
// двух массивов.

public class Zad1 {
    public static int countWords(String[] words1, String[] words2) {
        int ans = 0;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words1.length; i++) {
            if(!map.containsKey(words1[i])){
                map.put(words1[i], 0);
            } else{
                map.put(words1[i], map.get(words1[i]) + 1);
            }
        }
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            if (map.get(key) != 0) {
                iterator.remove();
            }
        }

        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < words2.length; i++) {
            if(!map2.containsKey(words2[i])){
                map2.put(words2[i], 0);
            } else{
                map2.put(words2[i], map2.get(words2[i]) + 1);
            }
        }
        Iterator<String> iterator2 = map2.keySet().iterator();
        while (iterator2.hasNext()) {
            String key = iterator2.next();
            if (map2.get(key) != 0) {
                iterator2.remove();
            }
        }

        for (String key: map.keySet()) {
            if (map2.containsKey(key)) {
                ans++;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        String[] words1 = { "leetcode", "is", "amazing", "as", "is"};
        String[] words2 = { "amazing", "leetcode", "is" };
        System.out.println(countWords(words1, words2));
    }
}
