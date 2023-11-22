package threeNames;

import javax.swing.*;
import java.util.Scanner;

public class ThreeNames {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < 3; i++) {
            String name = JOptionPane.showInputDialog("Ingrese un nombre completo");
            names[i] = name;
        }
        System.out.println("El nombre mas largo es: " + compareNames(names));
    }

    static String compareNames(String[] names){
        String largestName = "";
        for (String name : names) {
            if (name.length() > largestName.length()) {
                largestName = name;
            }
        }
        return largestName;
    }
}
