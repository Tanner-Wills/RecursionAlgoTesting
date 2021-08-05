import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IncreasingSubsequence {

    public static void main(String[] args) {
        //instance variables
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 7, 3, 5, 2, 8, 10, 24, -1, -5, 4));

        int subcount = myList.size();
        int start = 0;
        int end = 1;

        int pointer1 = start;
        int pointer2 = end;

        //Iterate through the ArrayList
        while (start < myList.size() - 1) {
            System.out.println("*****");
            while (pointer2 < myList.size()) {
                //if the last two elements are increasing
                if (myList.get(pointer1) < myList.get(pointer2)) {

                    System.out.println(myList.get(pointer1));
                    System.out.println(myList.get(pointer2));

                    pointer1 = pointer2;
                    pointer2 += 1;
                    subcount += 1;

                    System.out.println("/////////");
                    System.out.println("Count = " + subcount);
                    System.out.println("pointer 2 = " + pointer2);
                    System.out.println("end = " + end);
                    System.out.println("/////////");
                    //if the last two elements are decreasing
                } else {
                    pointer2 += 1;
                }
            }
            // increment "end" position and set pointer 2 equal to it
            // this will increment the pointer 1 and 2 start position to identify all possible subarrays from the start position
            if (end < myList.size()-1) {
                end += 1;
                pointer1 = start;
                pointer2 = end;
            // If all possible subarrays have been examined from the current start position, increment start position +1
            } else {
                start += 1;
                end = start + 1;
                pointer1 = start;
                pointer2 = start + 1;
            }
            //while loop to prevent duplicate increasing subarrays
            while(pointer2 < myList.size()-1 && myList.get(pointer1) > myList.get(pointer2)){
                end += 1;
                pointer2 = end;
            }
        }
        System.out.println(subcount);
    }
}
