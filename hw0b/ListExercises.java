import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        Object[] arr =  L.toArray();
        int total = 0;

        for (Object o : arr) {
            total += (Integer) o;
        }
        return total;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        //方法一：直接将不是偶数的项目再创建一个新的列表
        /*
        List<Integer> result = new ArrayList<>();

        for (Integer i : L) {
            if(i % 2 == 0) {
                result.add(i);
            }
        }

        return result;
        */
        //方法二： 用 ArrayList的removeIF函数解决


        List<Integer> result = new ArrayList<>();
        for (Integer i : L) {
                if (i % 2 == 0) {
                    result.add(i);
                }
            }
        return result;




    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        //双遍历两个列表
        //创建一个新列表 装两个列表的公共元素
        List<Integer> result = new ArrayList<Integer>();

        for (Integer i : L1) {

            for (Integer j : L2) {
                if(i.equals(j)) {
                    result.add(i);
                }
            }

        }
        return result;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        // 先遍历words数组

        int count = 0;


        for(String w : words){
            // 这个时候w 是字符串

            for(int i = 0; i < w.length(); i++)
            {
                if(w.charAt(i) == c)
                {
                    count++;
                }
            }

        }

        return count;
    }
}
