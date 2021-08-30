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
    public static void main(String[] args) {
        System.out.println("First Test");
        char[] set1 = {'a', 'b'};
        int k = 3;
        printAllKLength(set1, k);

        System.out.println("\nSecond Test");
        char[] set2 = {'a', 'b', 'c', 'd'};
        k = 1;
        printAllKLength(set2, k);
    }

    // Wrapper method
    static void printAllKLength(char[] set, int k) {
        int n = set.length;
        printAllKLengthRec(set, "", n, k);
    }

    // The main recursive method
    static void printAllKLengthRec(char[] set, String prefix, int n, int k) {
        // Base case
        if (k == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < n; ++i) {
            String newPrefix = prefix + set[i];

            printAllKLengthRec(set, newPrefix, n, k - 1);
        }
    }
}
