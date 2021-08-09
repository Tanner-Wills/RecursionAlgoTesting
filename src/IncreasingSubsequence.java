import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IncreasingSubsequence {

    public static void main(String[] args) {
        /*
        Strategy:
          Index through the list
          At each index, count the number of ints that are of lesser index and lesser value. *subCount*
          Then subCount(i) += subCount at each index of lesser index and value
          Add this count to the ArrayList

        */

        //int[] myList = {1, 7, 3, 5, 2, 8, 10, 24, -1, -5, 4};
        //List<Integer> myList = new ArrayList<>(Arrays.asList(3,2,4,5,4));
        int[] myList = {3, 2, 4, 5, 4};
        //int[] myList = {1,2,3};
        System.out.println("Total = " + addSubsequence(myList));
    }

    public static int addSubsequence(int[] list) {
        ArrayList<Integer> subArray = new ArrayList<Integer>();
        int result = 1;
        int index = 1;
        subArray.add(1);

        while (index < list.length) {
            int subCount = 1;
            for (int i = index - 1; i >= 0; i--) {
                if (list[i] < list[index]) {
                    subCount += subArray.get(i);
                }
            }
            subArray.add(subCount);
            result += subCount;
            index += 1;
        }

        //subArray.forEach(System.out::println);
        for (int item : subArray) {
            System.out.println(item);
        }

        return result;
    }
}

