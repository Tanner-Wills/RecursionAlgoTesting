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
        // Define number of discs
        int discs = 4;

        // The 3 towers represented as ArrayLists
        ArrayList<Integer> towerA = new ArrayList<Integer>();
        ArrayList<Integer> towerB = new ArrayList<Integer>();
        ArrayList<Integer> towerC = new ArrayList<Integer>();

        // Adding the number of discs to Tower_A
        for (int i = 1; i <= discs; i++) {
            towerA.add(i);
        }

        towerOfHanoi(towerA,towerB,towerC);

    }

    public static int towerOfHanoi(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c) {
        towerPrint(a, b, c);


        // ArrayList for recording the current move stack && the previous move stack
        // Moves will start by adding to the stack, then popping them off in the next iteration.
        ArrayList<Integer> moveStack = new ArrayList<Integer>();
        ArrayList<Integer> movePrev = new ArrayList<Integer>();
        int moves = 0;

        //Sequence for moving a stack of 1
        //if the move count == half of [2^(n) -2], pop the moves off the stack. (moves must be mirrored)
        //Always operate from index 0 because you can only remove the top disc
        //if an array is empty, move the largest available disc to the empty array.
        //if all arrays are full move the smallest disc to the



        return 1;
    }

    public static void towerPrint(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c) {
        int maxim = a.size() + b.size() + c.size();

        a.forEach(System.out::println);
        System.out.println("");
        b.forEach(System.out::print);
        System.out.println("");
        c.forEach(System.out::print);
        System.out.println("");
        System.out.println("---  ---  ---");

    }
}

        /*
        Find a pattern that can be repeated (Smaller sub-problems)

                (3 Rings)
        Start: [1,2,3] [0] [0]
            1. [2,3] [0] [1]    1 A to C
            2. [3] [2] [1]      2 A to B
            3. [3] [1,2] [0]    1 C to B

            4. [0] [1,2] [3]    3 A to C
            5. [1] [2] [3]      1 B to A
            6. [1] [0] [2,3]    2 B to C
            7. [0] [0] [1,2,3]  1 A to C

                    ***

                (4 Rings)
        Start: [1,2,3,4] [0] [0]
            1. [2,3,4] [1] [0]  1 A to B
            2. [3,4] [1] [2]    2 A to C
            3. [3,4] [0] [1,2]  1 B to C

            4. [4] [3] [1,2]    3 A to B
            5. [1,4] [3] [2]    1 C to A
            6. [1,4] [2,3] [0]  2 C to B
            7. [4] [1,2,3] [0]  1 A to B

            8. [0] [1,2,3] [4]  4 A to C
            9. [0] [2,3] [1,4]  1 B to C
            10.[2] [3] [1,4]    2 B to A
            11.[1,2] [3] [4]    1 C to A
            12.[1,2] [0] [3,4]  3 B to C
            13.[2] [1] [3,4]    1 A to B
            14.[0] [1] [2,3,4]  2 A to C
            15.[0] [0] [1,2,3,4]1 B to C

                    ***

                (5 Rings)
        Start: [1,2,3,4,5] [0] [0]
            1. [2,3,4,5] [0] [1]    1 to C
            2. [3,4,5] [2] [1]      2 to B
            3. [3,4,5] [1,2] [0]    1 to B

            4. [4,5] [1,2] [3]      3 to C
            5. [1,4,5] [2] [3]      1 to A
            6. [1,4,5] [0] [2,3]    2 to C
            7. [4,5] [0] [1,2,3]    1 to C

            8. [5] [4] [1,2,3]      4 to B
            9. [5] [1,4] [2,3]      1 to B
            10.[2,5] [1,4] [3]      2 to A
            11.[1,2,5] [4] [3]      1 to A
            12.[1,2,5] [3,4] [0]    3 to B
            13.[2,5] [3,4] [1]      1 to C
            14.[5] [2,3,4] [1]      2 to B
            15.[5] [1,2,3,4] [0]    1 to B

            16.[0] [1,2,3,4] [5]    5 to C
            17.[1] [2,3,4] [5]      1 to A
            18.[1] [3,4] [2,5]      2 to C
            19.[0] [3,4] [1,2,5]    1 to C
            20.[3] [4] [1,2,5]      3 to A
            21.[3] [1,4] [2,5]      1 to B
            22.[2,3] [1,4] [5]      2 to A
            23.[1,2,3] [4] [5]      1 to A
            24.[1,2,3] [0] [4,5]    4 to C
            25.[2,3] [0] [1,4,5]    1 to C
            26.[3] [2] [1,4,5]      2 to B
            27.[3] [1,2] [4,5]      1 to B
            28.[0] [1,2] [3,4,5]    3 to C
            29.[1] [2] [3,4,5]      1 to A
            30.[1] [0] [2,3,4,5]    2 to C
            31.[0] [0] [1,2,3,4,5]  1 to C



        within 3 moves, you can move a stack of 2
        within 7 moves, you can move a stack of 3
        within 15 moves, you can move a stack of 4
        so to move a Stack of size (S), it will require 2^(Stack) -1 moves
        */


