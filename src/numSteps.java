public class numSteps {
    /** determine the number of ways a staircase of N number of steps can be climbed.
     * You can climb 1 or 2 steps at a time.
     * Example:
     * N = 2 (2 stairs)
     * Output: 2 ways (1+1, 2)
     */

    public static void main(String[] args) {
        int N = 4;

        num_ways(N);
    }

    public static void num_ways(int stairs){
        int[] steps = {1,2};
        stairs_climbed(stairs,steps,"");
    }
    public static void stairs_climbed(int stairs, int[] steps, String ans){

    }
}
