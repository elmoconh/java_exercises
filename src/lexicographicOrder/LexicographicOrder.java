package lexicographicOrder;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class LexicographicOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        SortedSet<String> sets = new TreeSet<String>();
        for (int i = 0; i <= s.length() - k; i++) {
            sets.add(s.substring(i, i + k));
            System.out.println("sets = " + sets);

        }
        smallest = sets.first();
        largest = sets.last();
        return smallest + "\n" + largest;
    }
}
