import java.util.ArrayList;

public class TowerOfHanoi {
    /*
    Rules:
    1. You can only move 1 ring at a time
    2. Large radius rings cannot be placed on top of smaller radius rings
    3. When you move a ring, you can only move the ring on top of the stack

    minimum number of moves is = (2^n) - 1
    each sequence is mirrored at the halfway point
    so if n=4, the stack will build to 7, then pop off a mirrored move to 0. (15 total moves)

            *****
     */

    public static void main(String[] args) {

        int discs = 4;
        int moves = 0;

        // ArrayList for recording the current move stack && the previous move stack
        // Moves will start by adding to the stack, then popping them off in the next iteration.
        ArrayList<Integer> moveStack = new ArrayList<Integer>();
        ArrayList<Integer> movePrev = new ArrayList<Integer>();

        // The 3 towers represented as ArrayLists
        ArrayList<Integer> Tower_A = new ArrayList<Integer>();
        ArrayList<Integer> Tower_B = new ArrayList<Integer>();
        ArrayList<Integer> Tower_C = new ArrayList<Integer>();


        // Adding the number of discs to Tower_A
        for (int i = 1; i >= discs; i++) {
            Tower_A.add(i);
        }



    }

    public static int towerMoves(int discs) {

        //Sequence for moving a stack of 1
        //if the stack size == half of [2^(n) -2], pop the moves off the stack. (moves must be mirrored)
        //Always operate from index 0 because you can only remove the top disc
        //if an array is empty, move the largest available disc to the empty array.
        //if all arrays are full move the smallest disc to the


        return 1;
    }
}

        /*
        Find a pattern that can be repeated (Smaller sub-problems)
        Start: [1,2,3] [0] [0]
            1. [2,3] [0] [1]
            2. [3] [2] [1]
            3. [3] [1,2] [0]

            4. [0] [1,2] [3]
            5. [1] [2] [3]
            6. [1] [0] [2,3]
            7. [0] [0] [1,2,3]

                    ***

            (4 Rings)
        Start: [1,2,3,4] [0] [0]
            1. [2,3,4] [1] [0]
            2. [3,4] [1] [2]
            3. [3,4] [0] [1,2]

            4. [4] [3] [1,2]
            5. [1,4] [3] [2]
            6. [1,4] [2,3] [0]
            7. [4] [1,2,3] [0]

            8. [0] [1,2,3] [4]
            9. [0] [2,3] [1,4]
            10.[2] [3] [1,4]
            11.[1,2] [3] [4]
            12.[1,2] [0] [3,4]
            13.[2] [1] [3,4]
            14.[0] [1] [2,3,4]
            15.[0] [0] [1,2,3,4]

                    ***
            (5 Rings)
        Start: [1,2,3,4,5] [0] [0]
            1. [2,3,4,5] [0] [1]
            2. [3,4,5] [2] [1]
            3. [3,4,5] [1,2] [0]

            4. [4,5] [1,2] [3]
            5. [1,4,5] [2] [3]
            6. [1,4,5] [0] [2,3]
            7. [4,5] [0] [1,2,3]

            8. [5] [4] [1,2,3]
            9. [5] [1,4] [2,3]
            10.[2,5] [1,4] [3]
            11.[1,2,5] [4] [3]
            12.[1,2,5] [3,4] [0]
            13.[2,5] [3,4] [1]
            14.[5] [2,3,4] [1]
            15.[5] [1,2,3,4] [0]

            16.[0] [1,2,3,4] [5]
            17.[1] [2,3,4] [5]
            18.


        within 3 moves, you can move a stack of 2
        within 7 moves, you can move a stack of 3
        within 15 moves, you can move a stack of 4
        so to move a Stack of size (S), it will require 2^(Stack) -1 moves
        */


