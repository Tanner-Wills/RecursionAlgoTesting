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

        for (int i = discs; i > 0; i--) {
            Tower_1.add(i);
        }

        /* Find a pattern that can be repeated (4 Rings, 3 columns)
            Start: [1,2,3,4] [0] [0]
            1. Place ring 1 in column 2. [2,3,4] [1] [0]
            2. Place ring 2 in column 3. [3,4] [1] [2]
            3. All columns occupied, so place ring 1 on top of ring 2 (column 3). [3,4] [0] [1,2]
            4. Now a space is opened, so ring 3 in column 2. [4] [3] [1,2]
            5. Need to shift rings, so place ring 1 in column 1 (on top of largest ring). [1,4] [3] [2]
            6. Place ring 2 on ring 3 (column 2). [1,4] [2,3] [0]
            7. Place ring 1 on ring 2 (column 2). [4] [1,2,3] [0]
            8. Place ring 4 in column 3. [0] [1,2,3] [4]
            9. Place ring 1 on column 3. [0] [2,3] [1,4]
            10. Place ring 2 on column 1. [2] [3] [1,4]
            11. Place ring 1 on column 1. [1,2] [3] [4]
            12. Place ring 3 on column 3. [1,2] [0] [3,4]
            13. Place ring 1 in column 2. [2] [1] [3,4]
            14. Place ring 2 on column 3. [0] [1] [2,3,4]
            15. Place ring 1 on column 3. [0] [0] [1,2,3,4]
            Complete!
        */




    }
}
