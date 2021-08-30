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
        int[] steps = {1, 3, 5};
        stairs_climbed(stairs, steps, "");
    }

    // Recursive Method
    public static void stairs_climbed(int stairs, int[] steps, String ans) {
        if (stairs == 0) {
            System.out.println(ans);
            return;
        } else if(stairs < 0){
            return;
        } else {
            for (int step : steps) {
                String climbed = (String.valueOf(step) + " ");
                stairs_climbed(stairs - step, steps, ans + climbed);
            }
        }
    }
}
