import java.util.ArrayList;

public class TowerOfHanoi {

    //Rules:
    //1. You can only move 1 ring at a time
    //2. Large radius rings cannot be placed on top of smaller radius rings
    //3. When you move a ring, you can only move the ring on top of the stack

    // minimum number of moves is = (2^n) - 1
    //if n = 4, the rings will be sizes = [4,3,2,1]

    public static void main(String[] args) {

        int discs = 4;

    }

    public static int towerMoves(int discs) {
        // minimum number of moves is = (2^n) - 1
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
        for (int i = discs; i > 0; i--) {
            Tower_A.add(i);
        }

        // Sequence for moving a stack of 2
        // for each sequence, the next sequence is a mirror of the previous one.

        return
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

            (4 Rings, 3 columns)
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

        within 3 moves, you can move a stack of 2
        within 7 moves, you can move a stack of 3
        within 15 moves, you can move a stack of 4
        so to move a Stack of size (S), it will require 2^(Stack) -1 moves
        */


