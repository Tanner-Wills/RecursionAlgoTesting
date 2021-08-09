import java.util.ArrayList;

public class TowerOfHanoi {

    public static void main(String[] args) {


        //Rules:
        //1. You can only move 1 ring at a time
        //2. Large radius rings cannot be placed on top of smaller radius rings
        //3. When you move a ring, you can only move the ring on top of the stack

        // minimum number of moves is = (2^n) - 1
        //if n = 4, the rings will be sizes = [4,3,2,1]

        ArrayList<Integer> Tower_1 = new ArrayList<Integer>();
        ArrayList<Integer> Tower_middle = new ArrayList<Integer>();
        ArrayList<Integer> Tower_final = new ArrayList<Integer>();

        int discs = 4;

        for (int i = 1; i <= discs; i++) {
            Tower_1.add(i);
        }



    }
}
