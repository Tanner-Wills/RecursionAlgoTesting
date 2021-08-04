import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IncreasingSubsequence {

    public static void main(String[] args) {
        //instance variables
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 7, 3, 5, 2, 8, 10, 24, -1, -5, 4));

        int subcount = myList.size();
        int start = 0;
        int end = 2;

        int pointer1 = 0;
        int pointer2 = 1;

        //Iterate through the ArrayList
        while (start < myList.size() - 2) {
            List<Integer> sublist = myList.subList(start, end + 1);

            System.out.println("gg no re");
            while (pointer2 < myList.size()) {

                //if the last two elements are increasing
                if (myList.get(pointer1) < myList.get(pointer2)) {
                    System.out.println(myList.get(pointer1));
                    System.out.println(myList.get(pointer2));
                    pointer1 = pointer2;
                    pointer2 += 1;
                    subcount += 1;

                    //if the last two elements are decreasing
                } else {
                    pointer2 += 1;
                }
            }
            if (end < myList.size() - 1) {
                end += 1;
                pointer1 = start;
                pointer2 = sublist.size() - 1;

            } else {
                start += 1;
                end = start + 2;
                pointer1 = start;
                pointer2 = start + 1;
            }
        }
        System.out.println(subcount);
    }
}