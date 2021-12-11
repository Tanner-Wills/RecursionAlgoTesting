public class numSteps {
    /**
     * determine the number of ways a staircase of N number of steps can be climbed.
     * You can climb 1 or 2 steps at a time.
     * Example:
     * N = 2 (2 stairs)
     * Output: 2 ways (1+1, 2)
     */

    // Driver Code
    public static void main(String[] args) {
        int N = 4;
        num_ways(N);
    }

    // Wrapper Method
    public static void num_ways(int stairs) {
        int[] steps = {1, 2};
        System.out.println("Number of ways = " + stairs_climbed(stairs, steps));
    }

    // Recursive Method
    public static int stairs_climbed(int stairs, int[] steps) {
        // Base case #1
        if (stairs == 0){
            return 1;

        // Base case #2
        } else if(stairs < 0){
            return 0;

        }
        int total = 0;
        for (int step : steps) {
            total += stairs_climbed(stairs - step, steps);
            }
        return total;
    }
}
