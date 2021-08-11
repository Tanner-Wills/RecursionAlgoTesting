import java.util.ArrayList;
import java.util.Arrays;

public class TowerOfHanoi {
    /*
    Rules:
    1. You can only move 1 ring at a time
    2. Large radius rings cannot be placed on top of smaller radius rings
    3. When you move a ring, you can only move the ring on top of the stack

    minimum number of moves is = (2^n) - 1

    //Odd number of discs
            // odd numbers move to the left A -> C -> B -> A
            // even numbers move to the right A -> B -> C

        //Even number of discs
            // odd numbers move to the right A -> B -> C
            // even numbers move to the left A -> C -> B -> A

        //Sequence:
        // 1, 2, 1, 3
        // 1, 2, 1, 4
        // 1, 2, 1, 3
        // 1, 2, 1, 5
        // 1, 2, 1, 3
        // 1, 2, 1, 4
        // 1, 2, 1, 3
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

        char from = 'A';
        char aux = 'B';
        char to = 'C';
        int moves = 0;
        towerOfHanoi(discs, from, aux, to);

    }

    public static void towerOfHanoi(int discs,char from,char aux,char to) {

            //towerPrint(a, b, c);

            //Check for game victory

            if (discs == 1) {
                //moves += 1;
                System.out.println("Move disc 1 from " + from + " to " + to + ".\n");
                //System.out.println("Hanoi Complete in " + moves + " moves!");
            } else {
                //moves += 1;
                towerOfHanoi(discs - 1, from, to, aux);
                System.out.println("Move disc " + discs + " from " + from + " to " + to + ".\n");
                towerOfHanoi(discs - 1, aux, from, to);
            }
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
            1. [2,3,4,5] [0] [1]    1 A to C
            2. [3,4,5] [2] [1]      2 A to B
            3. [3,4,5] [1,2] [0]    1 C to B

            4. [4,5] [1,2] [3]      3 A to C
            5. [1,4,5] [2] [3]      1 C to A
            6. [1,4,5] [0] [2,3]    2 B to C
            7. [4,5] [0] [1,2,3]    1 A to C

            8. [5] [4] [1,2,3]      4 A to B
            9. [5] [1,4] [2,3]      1 C to B
            10.[2,5] [1,4] [3]      2 C to A
            11.[1,2,5] [4] [3]      1 B to A
            12.[1,2,5] [3,4] [0]    3 C to B
            13.[2,5] [3,4] [1]      1 A to C
            14.[5] [2,3,4] [1]      2 A to B
            15.[5] [1,2,3,4] [0]    1 C to B

            16.[0] [1,2,3,4] [5]    5 A to C
            17.[1] [2,3,4] [5]      1 B to A
            18.[1] [3,4] [2,5]      2 B to C
            19.[0] [3,4] [1,2,5]    1 A to C
            20.[3] [4] [1,2,5]      3 B to A
            21.[3] [1,4] [2,5]      1 C to B
            22.[2,3] [1,4] [5]      2 C to A
            23.[1,2,3] [4] [5]      1 B to A
            24.[1,2,3] [0] [4,5]    4 B to C
            25.[2,3] [0] [1,4,5]    1 A to C
            26.[3] [2] [1,4,5]      2 A to B
            27.[3] [1,2] [4,5]      1 C to B
            28.[0] [1,2] [3,4,5]    3 A to C
            29.[1] [2] [3,4,5]      1 B to A
            30.[1] [0] [2,3,4,5]    2 B to C
            31.[0] [0] [1,2,3,4,5]  1 A to C



        within 3 moves, you can move a stack of 2
        within 7 moves, you can move a stack of 3
        within 15 moves, you can move a stack of 4
        so to move a Stack of size (S), it will require 2^(Stack) -1 moves
        */


