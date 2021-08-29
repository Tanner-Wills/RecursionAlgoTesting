public class StringComboLengthK {
    /**
     * Print all combos of a given char list for length k.
     * ex:
     * String[] = {a,b}
     * k = 3
     *
     * output:
     * aaa, aab, aba, baa, bbb, bba, bab, abb
     */
    // Driver Code
    public static void main(String[] args)
    {
        System.out.println("First Test");
        char[] set1 = {'a', 'b'};
        int k = 3;
        printAllKLength(set1, k);

        System.out.println("\nSecond Test");
        char[] set2 = {'a', 'b', 'c', 'd'};
        k = 1;
        printAllKLength(set2, k);
    }

    static void printAllKLength(char[] set, int k)
    {
        int n = set.length;
        printAllKLengthRec(set, "", n, k);
    }

    // The main recursive method
    // to print all possible
    // strings of length k
    static void printAllKLengthRec(char[] set,
                                   String prefix,
                                   int n, int k)
    {
        // Base case: k is 0,
        // print prefix
        if (k == 0)
        {
            System.out.println(prefix);
            return;
        }

        // One by one add all characters
        // from set and recursively
        // call for k equals to k-1
        for (int i = 0; i < n; ++i)
        {

            // Next character of input added
            String newPrefix = prefix + set[i];

            // k is decreased, because
            // we have added a new character
            printAllKLengthRec(set, newPrefix,
                    n, k - 1);
        }
    }
}
