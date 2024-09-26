import java.util.ArrayList;
import java.util.List;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        // TODO: Fill in this function.
        int[] array = {1,2,3,4,5,6,};
        return array;
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        // TODO: Fill in this function.
        // 注意：字符串的对照 要不能用 “==”
        String[] elem = new String[3];

        if(customer.equals("Ergun"))
        {
            String[] order1 = {"beyti", "pizza", "hamburger","tea"};
            return order1;
        }else if(customer.equals("Erik"))
        {
            String[] order2 = {"sushi", "pasta", "avocado", "coffee"};
            return order2;
        }
        return elem;
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    // 注意数组越界问题 for循环中 i的初始值不能设置成1 会越界
    public static int findMinMax(int[] array) {
        // TODO: Fill in this function.
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max - min;
    }

    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        // TODO: Fill in this function.
        //要将给定的n进行操作 n为偶数时 n为奇数 同时要用递归的方法处理
        list.add(x);

        //额外条件：当列表中只有一个元素的时候直接返回列表 x
        //额外条件：当x=1时 直接返回列表

        if(x == 1){
            return list;
        }

        //  偶数/2 奇数x3+1
        if(x % 2 == 0){
            return hailstoneHelper(x/2,list);
        }else{
            return hailstoneHelper(x*3+1, list);
        }





    }

}
