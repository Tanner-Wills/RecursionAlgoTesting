public class StringComboLengthK {
    /**
     * Print all combos of a given String list for length k.
     * ex:
     * String[] = {a,b}
     * k = 3
     *
     * output:
     * aaa, aab, aba, baa, bbb, bba, bab, abb
     */

    public static void main(String[] args) {
        String[] str = {"a","b"};
        int k = 3;
        printAllCombos(str, k);
    }

    // Wrapper method
    static void printAllCombos(String[] str, int k){
        int n = str.length;
        StringCombo(str, k, "", n);
    }

    public static void StringCombo(String[] str, int k, String ans, int n){
        if(k == 0){
            System.out.println();
            return;
        } else {
            for(int i = 0; i < k; i++){

                StringCombo(str, k-1);
            }
        }



    }

}
