import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);

        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        // 要映射数字的平方 map.put每个数字不太现实
        // 所以要循环列表中每个元素
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.size(); i++){
            map.put(nums.get(i), nums.get(i)*nums.get(i));
        }
        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.

        //搞错了 不是字母出现的次数 是单词出现的次数
        /*
        // 先要知道列表中出现了那些字母 在计算每个字母出现的数字
        // 用来装字母的列表
        List<Character> letter = new ArrayList<>();

        for(String word : words) {
            for(int i = 0; i < word.length(); i++) {
                // 这样是把 words列表里的每一个字母都装进了letter列表里
                letter.add(word.charAt(i));
            }
        }
        HashMap<Character, Integer> map = new HashMap<>();
        */

        Map<String, Integer> map = new HashMap<>();

        //遍历单词列表
        for (String word : words) {
            //如果 map中已经有这个单词 增加他的计数
            if(map.containsKey(word)) {
                map.put(word, map.get(word)+1);
            }else {
                // 如果没有 就将这个单子初始计数为1
                map.put(word, 1);

            }
        }

        return map;
    }
}
